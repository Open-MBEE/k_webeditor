importScripts("dependencies/ace-worker/worker.js");
importScripts("dependencies/ace-builds/src-noconflict/ace.js");
importScripts("dependencies/ace-worker/mirror.js");
importScripts("dependencies/lodash.js")
ace.define('ace/worker/k-worker', ["require", "exports", "module", "ace/lib/oop", "ace/worker/mirror"], function (require, exports, module) {
  "use strict";

  var oop = require("ace/lib/oop");
  var Mirror = require("ace/worker/mirror").Mirror;

  var MyWorker = function (sender) {
    Mirror.call(this, sender);
    this.setTimeout(200);
    this.$dialect = null;
  };

  oop.inherits(MyWorker, Mirror);

  // load nodejs compatible require
  var ace_require = require;
  window.require = undefined; // prevent error: "Honey: 'require' already defined in global scope"
  var Honey = { 'requirePath': ['..'] }; // walk up to js folder, see Honey docs
  importScripts("./require.js");
  var antlr4_require = window.require;
  window.require = require = ace_require;

  // load antlr4 and myLanguage
  var antlr4, ModelLexer, ModelParser, ModelListener;
  try {
    window.require = require = antlr4_require;
    antlr4 = require('./build/parser/index').antlr4;
    ModelLexer = require('./build/parser/index').ModelLexer;
    ModelParser = require('./build/parser/index').ModelParser;
    ModelListener = require('./build/parser/index').ModelListener;
  } finally {
    window.require = require = ace_require;
  }

  // class for gathering errors and posting them to ACE editor
  var AnnotatingErrorListener = function (annotations) {
    antlr4.error.ErrorListener.call(this);
    this.annotations = annotations;
    return this;
  };

  AnnotatingErrorListener.prototype = Object.create(antlr4.error.ErrorListener.prototype);
  AnnotatingErrorListener.prototype.constructor = AnnotatingErrorListener;

  AnnotatingErrorListener.prototype.syntaxError = function (recognizer, offendingSymbol, line, column, msg, e) {
    this.annotations.push({
      row: line - 1,
      column: column,
      text: msg,
      type: "error"
    });
  };


  // class for listening for incoming expressions

  class ExpressionListener extends ModelListener {
    constructor(parser, structure) {
        super();
        this.parser = parser;
        this.structure = structure;
        this.structure.push({name: 'Top Level', children: []})
        this._inClass = 0;
        this.findStackByIndex = function (index, arr) {
            let last = arr.length - 1;
            if (last < 0 ) {
                return arr;
            }
            if (index == 0) {
                return arr[last];
            }
            return this.findStackByIndex(index - 1, arr[last].children);
        };
    }

    enterEntityDeclaration(ctx){
      var tok = this.parser.getTokenStream();
      if(ctx.Identifier() != null){
          let idText = ctx.Identifier().toString();
          this.findStackByIndex(this._inClass, this.structure).children.push({name: idText, children: []});
          this._inClass += 1;
      }
    }
    exitEntityDeclaration(ctx){
      this._inClass -= 1;
    }

    enterMemberDeclaration(ctx){
        var tok = this.parser.getTokenStream();
        if(typeof ctx.constraint != 'undefined' && ctx.constraint() != null){
          let ctText = tok.getText(ctx.constraint());
            let obj = {value: ctText, line: ctx.constraint().start.line, col:ctx.constraint().start.column};
            this.findStackByIndex(this._inClass, this.structure).children.push(obj)
        }
    }

    exitModel(ctx){
      console.log(this.structure);
    }
  }
  


  function validate(input) {
    var stream = new antlr4.InputStream(input);
    var lexer = new ModelLexer(stream);
    var tokens = new antlr4.CommonTokenStream(lexer);
    var parser = new ModelParser(tokens);
    var annotations = [];
    var listener = new AnnotatingErrorListener(annotations);
    parser.removeErrorListeners();
    parser.addErrorListener(listener);
    let tree = parser.model();
    return annotations;
  }

  function listenForExpressions(input) {
    var stream = new antlr4.InputStream(input);
    var lexer = new ModelLexer(stream);
    var tokens = new antlr4.CommonTokenStream(lexer);
    var parser = new ModelParser(tokens);
    var tree = parser.model();
    var walker = new antlr4.tree.ParseTreeWalker();
    var expressions = [];
    var listener = new ExpressionListener(parser,expressions);
    walker.walk(listener, tree);
    return expressions;
  }

  (function () {
    var runListeners = function () {
        var value = this.doc.getValue();
        var annotations = validate(value);
        if (annotations.length == 0) {
            var expressions = listenForExpressions(value);
            this.sender.emit("renderExpression", expressions)
        }
        this.sender.emit("annotate", annotations);
    };

    this.onUpdate = _.debounce(runListeners, 500)

  }).call(MyWorker.prototype);

  exports.MyWorker = MyWorker;
});