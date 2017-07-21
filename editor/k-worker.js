importScripts("dependencies/ace-worker/worker.js");
importScripts("dependencies/ace-builds/src-noconflict/ace.js");
importScripts("dependencies/ace-worker/mirror.js");

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
    window.require = antlr4_require;
    antlr4 = antlr4_require('antlr4/index');
    ModelLexer = antlr4_require('parser/ModelLexer').ModelLexer;
    ModelParser = antlr4_require('parser/ModelParser').ModelParser;
    ModelListener = antlr4_require('parser/ModelListener').ModelListener;

  } finally {
    window.require = ace_require;
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
    constructor(expressions, tokenStream) {
      super()
      this.tokens = tokenStream;
      this.expressions = expressions;
      this.functions = [];
      this.inFn = false;
    }
    exitConstraint(ctx) {
      var start_index = ctx.start.tokenIndex;
      var stop_index = ctx.stop.tokenIndex;
      var user_text = this.tokens.getText({start: start_index, stop: stop_index});
      this.expressions.push(user_text);
    };
    enterFunctionDeclaration(ctx){
      this.inFn = true;
      this._tempBuilder = ctx.Identifier().getText();
    }
    enterParamList(ctx){
      if(this.inFn){
              this._tempBuilder += '(' + ctx.getText() + ')';
      }
    }
    exitFunctionDeclaration(ctx) {
      // var start_index = ctx.start.tokenIndex;
      // var stop_index = ctx.stop.tokenIndex;
      // var user_text = this.tokens.getText({start: start_index, stop: stop_index});
      this.functions.push(this._tempBuilder);
      this._tempBuilder = undefined;
      this.inFn = false;
    };
    exitModel(ctx){
        console.log(this.functions);
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
    walker.walk(new ExpressionListener(expressions,tokens), tree);
    return expressions;
  }

  (function () {

    this.onUpdate = function () {
      var value = this.doc.getValue();
      var annotations = validate(value);
      if (annotations.length == 0) {
        var expressions = listenForExpressions(value);
        this.sender.emit("renderExpression", expressions)
      }
      this.sender.emit("annotate", annotations);
    };

  }).call(MyWorker.prototype);

  exports.MyWorker = MyWorker;
});