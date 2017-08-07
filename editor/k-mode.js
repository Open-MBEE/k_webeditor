ace.define("ace/mode/matching_brace_outdent", ["require", "exports", "module", "ace/range"], function (require, exports, module) {
    "use strict";

    var Range = require("../range").Range;

    var MatchingBraceOutdent = function () { };

    (function () {

        this.checkOutdent = function (line, input) {
            if (! /^\s+$/.test(line))
                return false;

            return /^\s*\}/.test(input);
        };

        this.autoOutdent = function (doc, row) {
            var line = doc.getLine(row);
            var match = line.match(/^(\s*\})/);

            if (!match) return 0;

            var column = match[1].length;
            var openBracePos = doc.findMatchingBracket({ row: row, column: column });

            if (!openBracePos || openBracePos.row == row) return 0;

            var indent = this.$getIndent(doc.getLine(openBracePos.row));
            doc.replace(new Range(row, 0, row, column - 1), indent);
        };

        this.$getIndent = function (line) {
            return line.match(/^\s*/)[0];
        };

    }).call(MatchingBraceOutdent.prototype);

    exports.MatchingBraceOutdent = MatchingBraceOutdent;
});

ace.define("ace/mode/behaviour/cstyle", ["require", "exports", "module", "ace/lib/oop", "ace/mode/behaviour", "ace/token_iterator", "ace/lib/lang"], function (require, exports, module) {
    "use strict";

    var oop = require("../../lib/oop");
    var Behaviour = require("../behaviour").Behaviour;
    var TokenIterator = require("../../token_iterator").TokenIterator;
    var lang = require("../../lib/lang");

    var SAFE_INSERT_IN_TOKENS =
        ["text", "paren.rparen", "punctuation.operator"];
    var SAFE_INSERT_BEFORE_TOKENS =
        ["text", "paren.rparen", "punctuation.operator", "comment"];

    var context;
    var contextCache = {};
    var initContext = function (editor) {
        var id = -1;
        if (editor.multiSelect) {
            id = editor.selection.index;
            if (contextCache.rangeCount != editor.multiSelect.rangeCount)
                contextCache = { rangeCount: editor.multiSelect.rangeCount };
        }
        if (contextCache[id])
            return context = contextCache[id];
        context = contextCache[id] = {
            autoInsertedBrackets: 0,
            autoInsertedRow: -1,
            autoInsertedLineEnd: "",
            maybeInsertedBrackets: 0,
            maybeInsertedRow: -1,
            maybeInsertedLineStart: "",
            maybeInsertedLineEnd: ""
        };
    };

    var getWrapped = function (selection, selected, opening, closing) {
        var rowDiff = selection.end.row - selection.start.row;
        return {
            text: opening + selected + closing,
            selection: [
                0,
                selection.start.column + 1,
                rowDiff,
                selection.end.column + (rowDiff ? 0 : 1)
            ]
        };
    };

    var CstyleBehaviour = function () {
        this.add("braces", "insertion", function (state, action, editor, session, text) {
            var cursor = editor.getCursorPosition();
            var line = session.doc.getLine(cursor.row);
            if (text == '{') {
                initContext(editor);
                var selection = editor.getSelectionRange();
                var selected = session.doc.getTextRange(selection);
                if (selected !== "" && selected !== "{" && editor.getWrapBehavioursEnabled()) {
                    return getWrapped(selection, selected, '{', '}');
                } else if (CstyleBehaviour.isSaneInsertion(editor, session)) {
                    if (/[\]\}\)]/.test(line[cursor.column]) || editor.inMultiSelectMode) {
                        CstyleBehaviour.recordAutoInsert(editor, session, "}");
                        return {
                            text: '{}',
                            selection: [1, 1]
                        };
                    } else {
                        CstyleBehaviour.recordMaybeInsert(editor, session, "{");
                        return {
                            text: '{',
                            selection: [1, 1]
                        };
                    }
                }
            } else if (text == '}') {
                initContext(editor);
                var rightChar = line.substring(cursor.column, cursor.column + 1);
                if (rightChar == '}') {
                    var matching = session.$findOpeningBracket('}', { column: cursor.column + 1, row: cursor.row });
                    if (matching !== null && CstyleBehaviour.isAutoInsertedClosing(cursor, line, text)) {
                        CstyleBehaviour.popAutoInsertedClosing();
                        return {
                            text: '',
                            selection: [1, 1]
                        };
                    }
                }
            } else if (text == "\n" || text == "\r\n") {
                initContext(editor);
                var closing = "";
                if (CstyleBehaviour.isMaybeInsertedClosing(cursor, line)) {
                    closing = lang.stringRepeat("}", context.maybeInsertedBrackets);
                    CstyleBehaviour.clearMaybeInsertedClosing();
                }
                var rightChar = line.substring(cursor.column, cursor.column + 1);
                if (rightChar === '}') {
                    var openBracePos = session.findMatchingBracket({ row: cursor.row, column: cursor.column + 1 }, '}');
                    if (!openBracePos)
                        return null;
                    var next_indent = this.$getIndent(session.getLine(openBracePos.row));
                } else if (closing) {
                    var next_indent = this.$getIndent(line);
                } else {
                    CstyleBehaviour.clearMaybeInsertedClosing();
                    return;
                }
                var indent = next_indent + session.getTabString();

                return {
                    text: '\n' + indent + '\n' + next_indent + closing,
                    selection: [1, indent.length, 1, indent.length]
                };
            } else {
                CstyleBehaviour.clearMaybeInsertedClosing();
            }
        });

        this.add("braces", "deletion", function (state, action, editor, session, range) {
            var selected = session.doc.getTextRange(range);
            if (!range.isMultiLine() && selected == '{') {
                initContext(editor);
                var line = session.doc.getLine(range.start.row);
                var rightChar = line.substring(range.end.column, range.end.column + 1);
                if (rightChar == '}') {
                    range.end.column++;
                    return range;
                } else {
                    context.maybeInsertedBrackets--;
                }
            }
        });

        this.add("parens", "insertion", function (state, action, editor, session, text) {
            if (text == '(') {
                initContext(editor);
                var selection = editor.getSelectionRange();
                var selected = session.doc.getTextRange(selection);
                if (selected !== "" && editor.getWrapBehavioursEnabled()) {
                    return getWrapped(selection, selected, '(', ')');
                } else if (CstyleBehaviour.isSaneInsertion(editor, session)) {
                    CstyleBehaviour.recordAutoInsert(editor, session, ")");
                    return {
                        text: '()',
                        selection: [1, 1]
                    };
                }
            } else if (text == ')') {
                initContext(editor);
                var cursor = editor.getCursorPosition();
                var line = session.doc.getLine(cursor.row);
                var rightChar = line.substring(cursor.column, cursor.column + 1);
                if (rightChar == ')') {
                    var matching = session.$findOpeningBracket(')', { column: cursor.column + 1, row: cursor.row });
                    if (matching !== null && CstyleBehaviour.isAutoInsertedClosing(cursor, line, text)) {
                        CstyleBehaviour.popAutoInsertedClosing();
                        return {
                            text: '',
                            selection: [1, 1]
                        };
                    }
                }
            }
        });

        this.add("parens", "deletion", function (state, action, editor, session, range) {
            var selected = session.doc.getTextRange(range);
            if (!range.isMultiLine() && selected == '(') {
                initContext(editor);
                var line = session.doc.getLine(range.start.row);
                var rightChar = line.substring(range.start.column + 1, range.start.column + 2);
                if (rightChar == ')') {
                    range.end.column++;
                    return range;
                }
            }
        });

        this.add("brackets", "insertion", function (state, action, editor, session, text) {
            if (text == '[') {
                initContext(editor);
                var selection = editor.getSelectionRange();
                var selected = session.doc.getTextRange(selection);
                if (selected !== "" && editor.getWrapBehavioursEnabled()) {
                    return getWrapped(selection, selected, '[', ']');
                } else if (CstyleBehaviour.isSaneInsertion(editor, session)) {
                    CstyleBehaviour.recordAutoInsert(editor, session, "]");
                    return {
                        text: '[]',
                        selection: [1, 1]
                    };
                }
            } else if (text == ']') {
                initContext(editor);
                var cursor = editor.getCursorPosition();
                var line = session.doc.getLine(cursor.row);
                var rightChar = line.substring(cursor.column, cursor.column + 1);
                if (rightChar == ']') {
                    var matching = session.$findOpeningBracket(']', { column: cursor.column + 1, row: cursor.row });
                    if (matching !== null && CstyleBehaviour.isAutoInsertedClosing(cursor, line, text)) {
                        CstyleBehaviour.popAutoInsertedClosing();
                        return {
                            text: '',
                            selection: [1, 1]
                        };
                    }
                }
            }
        });

        this.add("brackets", "deletion", function (state, action, editor, session, range) {
            var selected = session.doc.getTextRange(range);
            if (!range.isMultiLine() && selected == '[') {
                initContext(editor);
                var line = session.doc.getLine(range.start.row);
                var rightChar = line.substring(range.start.column + 1, range.start.column + 2);
                if (rightChar == ']') {
                    range.end.column++;
                    return range;
                }
            }
        });

        this.add("string_dquotes", "insertion", function (state, action, editor, session, text) {
            if (text == '"' || text == "'") {
                initContext(editor);
                var quote = text;
                var selection = editor.getSelectionRange();
                var selected = session.doc.getTextRange(selection);
                if (selected !== "" && selected !== "'" && selected != '"' && editor.getWrapBehavioursEnabled()) {
                    return getWrapped(selection, selected, quote, quote);
                } else if (!selected) {
                    var cursor = editor.getCursorPosition();
                    var line = session.doc.getLine(cursor.row);
                    var leftChar = line.substring(cursor.column - 1, cursor.column);
                    var rightChar = line.substring(cursor.column, cursor.column + 1);

                    var token = session.getTokenAt(cursor.row, cursor.column);
                    var rightToken = session.getTokenAt(cursor.row, cursor.column + 1);
                    if (leftChar == "\\" && token && /escape/.test(token.type))
                        return null;

                    var stringBefore = token && /string|escape/.test(token.type);
                    var stringAfter = !rightToken || /string|escape/.test(rightToken.type);

                    var pair;
                    if (rightChar == quote) {
                        pair = stringBefore !== stringAfter;
                    } else {
                        if (stringBefore && !stringAfter)
                            return null; // wrap string with different quote
                        if (stringBefore && stringAfter)
                            return null; // do not pair quotes inside strings
                        var wordRe = session.$mode.tokenRe;
                        wordRe.lastIndex = 0;
                        var isWordBefore = wordRe.test(leftChar);
                        wordRe.lastIndex = 0;
                        var isWordAfter = wordRe.test(leftChar);
                        if (isWordBefore || isWordAfter)
                            return null; // before or after alphanumeric
                        if (rightChar && !/[\s;,.})\]\\]/.test(rightChar))
                            return null; // there is rightChar and it isn't closing
                        pair = true;
                    }
                    return {
                        text: pair ? quote + quote : "",
                        selection: [1, 1]
                    };
                }
            }
        });

        this.add("string_dquotes", "deletion", function (state, action, editor, session, range) {
            var selected = session.doc.getTextRange(range);
            if (!range.isMultiLine() && (selected == '"' || selected == "'")) {
                initContext(editor);
                var line = session.doc.getLine(range.start.row);
                var rightChar = line.substring(range.start.column + 1, range.start.column + 2);
                if (rightChar == selected) {
                    range.end.column++;
                    return range;
                }
            }
        });

    };


    CstyleBehaviour.isSaneInsertion = function (editor, session) {
        var cursor = editor.getCursorPosition();
        var iterator = new TokenIterator(session, cursor.row, cursor.column);
        if (!this.$matchTokenType(iterator.getCurrentToken() || "text", SAFE_INSERT_IN_TOKENS)) {
            var iterator2 = new TokenIterator(session, cursor.row, cursor.column + 1);
            if (!this.$matchTokenType(iterator2.getCurrentToken() || "text", SAFE_INSERT_IN_TOKENS))
                return false;
        }
        iterator.stepForward();
        return iterator.getCurrentTokenRow() !== cursor.row ||
            this.$matchTokenType(iterator.getCurrentToken() || "text", SAFE_INSERT_BEFORE_TOKENS);
    };

    CstyleBehaviour.$matchTokenType = function (token, types) {
        return types.indexOf(token.type || token) > -1;
    };

    CstyleBehaviour.recordAutoInsert = function (editor, session, bracket) {
        var cursor = editor.getCursorPosition();
        var line = session.doc.getLine(cursor.row);
        if (!this.isAutoInsertedClosing(cursor, line, context.autoInsertedLineEnd[0]))
            context.autoInsertedBrackets = 0;
        context.autoInsertedRow = cursor.row;
        context.autoInsertedLineEnd = bracket + line.substr(cursor.column);
        context.autoInsertedBrackets++;
    };

    CstyleBehaviour.recordMaybeInsert = function (editor, session, bracket) {
        var cursor = editor.getCursorPosition();
        var line = session.doc.getLine(cursor.row);
        if (!this.isMaybeInsertedClosing(cursor, line))
            context.maybeInsertedBrackets = 0;
        context.maybeInsertedRow = cursor.row;
        context.maybeInsertedLineStart = line.substr(0, cursor.column) + bracket;
        context.maybeInsertedLineEnd = line.substr(cursor.column);
        context.maybeInsertedBrackets++;
    };

    CstyleBehaviour.isAutoInsertedClosing = function (cursor, line, bracket) {
        return context.autoInsertedBrackets > 0 &&
            cursor.row === context.autoInsertedRow &&
            bracket === context.autoInsertedLineEnd[0] &&
            line.substr(cursor.column) === context.autoInsertedLineEnd;
    };

    CstyleBehaviour.isMaybeInsertedClosing = function (cursor, line) {
        return context.maybeInsertedBrackets > 0 &&
            cursor.row === context.maybeInsertedRow &&
            line.substr(cursor.column) === context.maybeInsertedLineEnd &&
            line.substr(0, cursor.column) == context.maybeInsertedLineStart;
    };

    CstyleBehaviour.popAutoInsertedClosing = function () {
        context.autoInsertedLineEnd = context.autoInsertedLineEnd.substr(1);
        context.autoInsertedBrackets--;
    };

    CstyleBehaviour.clearMaybeInsertedClosing = function () {
        if (context) {
            context.maybeInsertedBrackets = 0;
            context.maybeInsertedRow = -1;
        }
    };



    oop.inherits(CstyleBehaviour, Behaviour);

    exports.CstyleBehaviour = CstyleBehaviour;
});

ace.define("ace/mode/folding/cstyle", ["require", "exports", "module", "ace/lib/oop", "ace/range", "ace/mode/folding/fold_mode"], function (require, exports, module) {
    "use strict";

    var oop = require("../../lib/oop");
    var Range = require("../../range").Range;
    var BaseFoldMode = require("./fold_mode").FoldMode;

    var FoldMode = exports.FoldMode = function (commentRegex) {
        if (commentRegex) {
            this.foldingStartMarker = new RegExp(
                this.foldingStartMarker.source.replace(/\|[^|]*?$/, "|" + commentRegex.start)
            );
            this.foldingStopMarker = new RegExp(
                this.foldingStopMarker.source.replace(/\|[^|]*?$/, "|" + commentRegex.end)
            );
        }
    };
    oop.inherits(FoldMode, BaseFoldMode);

    (function () {

        this.foldingStartMarker = /(\{|\[)[^\}\]]*$|^\s*(\/\*)/;
        this.foldingStopMarker = /^[^\[\{]*(\}|\])|^[\s\*]*(\*\/)/;
        this.singleLineBlockCommentRe = /^\s*(\/\*).*\*\/\s*$/;
        this.tripleStarBlockCommentRe = /^\s*(\/\*\*\*).*\*\/\s*$/;
        this.startRegionRe = /^\s*(\/\*|\/\/)#?region\b/;
        this._getFoldWidgetBase = this.getFoldWidget;
        this.getFoldWidget = function (session, foldStyle, row) {
            var line = session.getLine(row);

            if (this.singleLineBlockCommentRe.test(line)) {
                if (!this.startRegionRe.test(line) && !this.tripleStarBlockCommentRe.test(line))
                    return "";
            }

            var fw = this._getFoldWidgetBase(session, foldStyle, row);

            if (!fw && this.startRegionRe.test(line))
                return "start"; // lineCommentRegionStart

            return fw;
        };

        this.getFoldWidgetRange = function (session, foldStyle, row, forceMultiline) {
            var line = session.getLine(row);

            if (this.startRegionRe.test(line))
                return this.getCommentRegionBlock(session, line, row);

            var match = line.match(this.foldingStartMarker);
            if (match) {
                var i = match.index;

                if (match[1])
                    return this.openingBracketBlock(session, match[1], row, i);

                var range = session.getCommentFoldRange(row, i + match[0].length, 1);

                if (range && !range.isMultiLine()) {
                    if (forceMultiline) {
                        range = this.getSectionRange(session, row);
                    } else if (foldStyle != "all")
                        range = null;
                }

                return range;
            }

            if (foldStyle === "markbegin")
                return;

            var match = line.match(this.foldingStopMarker);
            if (match) {
                var i = match.index + match[0].length;

                if (match[1])
                    return this.closingBracketBlock(session, match[1], row, i);

                return session.getCommentFoldRange(row, i, -1);
            }
        };

        this.getSectionRange = function (session, row) {
            var line = session.getLine(row);
            var startIndent = line.search(/\S/);
            var startRow = row;
            var startColumn = line.length;
            row = row + 1;
            var endRow = row;
            var maxRow = session.getLength();
            while (++row < maxRow) {
                line = session.getLine(row);
                var indent = line.search(/\S/);
                if (indent === -1)
                    continue;
                if (startIndent > indent)
                    break;
                var subRange = this.getFoldWidgetRange(session, "all", row);

                if (subRange) {
                    if (subRange.start.row <= startRow) {
                        break;
                    } else if (subRange.isMultiLine()) {
                        row = subRange.end.row;
                    } else if (startIndent == indent) {
                        break;
                    }
                }
                endRow = row;
            }

            return new Range(startRow, startColumn, endRow, session.getLine(endRow).length);
        };
        this.getCommentRegionBlock = function (session, line, row) {
            var startColumn = line.search(/\s*$/);
            var maxRow = session.getLength();
            var startRow = row;

            var re = /^\s*(?:\/\*|\/\/|--)#?(end)?region\b/;
            var depth = 1;
            while (++row < maxRow) {
                line = session.getLine(row);
                var m = re.exec(line);
                if (!m) continue;
                if (m[1]) depth--;
                else depth++;

                if (!depth) break;
            }

            var endRow = row;
            if (endRow > startRow) {
                return new Range(startRow, startColumn, endRow, line.length);
            }
        };

    }).call(FoldMode.prototype);

});

ace.define(
    'ace/mode/k-mode',
    [
        "require",
        "exports",
        "module",
        "ace/lodash",
        "ace/lib/oop",
        "ace/mode/text",
        "ace/ext/antlr4/token-type-map",
        "ace/ext/antlr4/tokenizer",
        "ace/mode/k_highlight_rules",
        "ace/worker/worker_client"
    ],
    function (require, exports, module) {
        var oop = require("ace/lib/oop");
        var lang = require("../lib/lang");
        var Range = require("../range").Range;
        var TokenIterator = require("../token_iterator").TokenIterator;
        var TextMode = require("ace/mode/text").Mode;
        var tokenTypeMapping = antlr4_require('./k-token-map');
        var createTokenTypeMap = require('ace/ext/antlr4/token-type-map').createTokenTypeMap;
        var tokenTypeToNameMap = createTokenTypeMap(tokenTypeMapping);
        var ModelLexer = antlr4_require('./build/parser/index').ModelLexer;
        var Antlr4Tokenizer = require('ace/ext/antlr4/tokenizer').Antlr4Tokenizer;
        var MatchingBraceOutdent = require("ace/mode/matching_brace_outdent").MatchingBraceOutdent;
        var CstyleBehaviour = require("./behaviour/cstyle").CstyleBehaviour;
        var CStyleFoldMode = require("./folding/cstyle").FoldMode;
        var MatchingBraceOutdent = require("./matching_brace_outdent").MatchingBraceOutdent;
        var mathjs = antlr4_require('./dependencies/mathjs/dist/math.min.js');

        var MyMode = function () {
            this.$outdent = new MatchingBraceOutdent();
            this.$behaviour = new CstyleBehaviour();
            this.foldingRules = new CStyleFoldMode();
            this.$globalClass = [{name: 'Timepoint', name: 'Timeline'}];
            this.$id = "ace/mode/k-mode";
            this.lineCommentStart = "---";
            this.blockComment = { start: "===", end: "===" };
            // this.$highlightRules = false;
        };
        oop.inherits(MyMode, TextMode);

        (function () {


            this.toggleCommentLines = function(state, session, startRow, endRow) {
                var doc = session.doc;

                var ignoreBlankLines = true;
                var shouldRemove = true;
                var minIndent = Infinity;
                var tabSize = session.getTabSize();
                var insertAtTabStop = false;

                if (!this.lineCommentStart) {
                    if (!this.blockComment)
                        return false;
                    var lineCommentStart = this.blockComment.start;
                    var lineCommentEnd = this.blockComment.end;
                    var regexpStart = new RegExp("^(\\s*)(?:" + lang.escapeRegExp(lineCommentStart) + ")");
                    var regexpEnd = new RegExp("(?:" + lang.escapeRegExp(lineCommentEnd) + ")\\s*$");

                    var comment = function(line, i) {
                        if (testRemove(line, i))
                            return;
                        if (!ignoreBlankLines || /\S/.test(line)) {
                            doc.insertInLine({row: i, column: line.length}, lineCommentEnd);
                            doc.insertInLine({row: i, column: minIndent}, lineCommentStart);
                        }
                    };

                    var uncomment = function(line, i) {
                        var m;
                        if (m = line.match(regexpEnd))
                            doc.removeInLine(i, line.length - m[0].length, line.length);
                        if (m = line.match(regexpStart))
                            doc.removeInLine(i, m[1].length, m[0].length);
                    };

                    var testRemove = function(line, row) {
                        if (regexpStart.test(line))
                            return true;
                        var tokens = session.getTokens(row);
                        for (var i = 0; i < tokens.length; i++) {
                            if (tokens[i].type === "comment")
                                return true;
                        }
                    };
                } else {
                    if (Array.isArray(this.lineCommentStart)) {
                        var regexpStart = this.lineCommentStart.map(lang.escapeRegExp).join("|");
                        var lineCommentStart = this.lineCommentStart[0];
                    } else {
                        var regexpStart = lang.escapeRegExp(this.lineCommentStart);
                        var lineCommentStart = this.lineCommentStart;
                    }
                    regexpStart = new RegExp("^(\\s*)(?:" + regexpStart + ") ?");

                    insertAtTabStop = session.getUseSoftTabs();

                    var uncomment = function(line, i) {
                        var m = line.match(regexpStart);
                        if (!m) return;
                        var start = m[1].length, end = m[0].length;
                        if (!shouldInsertSpace(line, start, end) && m[0][end - 1] == " ")
                            end--;
                        doc.removeInLine(i, start, end);
                    };
                    var commentWithSpace = lineCommentStart + " ";
                    var comment = function(line, i) {
                        if (!ignoreBlankLines || /\S/.test(line)) {
                            if (shouldInsertSpace(line, minIndent, minIndent))
                                doc.insertInLine({row: i, column: minIndent}, commentWithSpace);
                            else
                                doc.insertInLine({row: i, column: minIndent}, lineCommentStart);
                        }
                    };
                    var testRemove = function(line, i) {
                        return regexpStart.test(line);
                    };

                    var shouldInsertSpace = function(line, before, after) {
                        var spaces = 0;
                        while (before-- && line.charAt(before) == " ")
                            spaces++;
                        if (spaces % tabSize != 0)
                            return false;
                        var spaces = 0;
                        while (line.charAt(after++) == " ")
                            spaces++;
                        if (tabSize > 2)
                            return spaces % tabSize != tabSize - 1;
                        else
                            return spaces % tabSize == 0;
                        return true;
                    };
                }

                function iter(fun) {
                    for (var i = startRow; i <= endRow; i++)
                        fun(doc.getLine(i), i);
                }


                var minEmptyLength = Infinity;
                iter(function(line, i) {
                    var indent = line.search(/\S/);
                    if (indent !== -1) {
                        if (indent < minIndent)
                            minIndent = indent;
                        if (shouldRemove && !testRemove(line, i))
                            shouldRemove = false;
                    } else if (minEmptyLength > line.length) {
                        minEmptyLength = line.length;
                    }
                });

                if (minIndent == Infinity) {
                    minIndent = minEmptyLength;
                    ignoreBlankLines = false;
                    shouldRemove = false;
                }

                if (insertAtTabStop && minIndent % tabSize != 0)
                    minIndent = Math.floor(minIndent / tabSize) * tabSize;

                iter(shouldRemove ? uncomment : comment);
            };

            this.toggleBlockComment = function(state, session, range, cursor) {
                var comment = this.blockComment;
                if (!comment)
                    return;
                if (!comment.start && comment[0])
                    comment = comment[0];

                var iterator = new TokenIterator(session, cursor.row, cursor.column);
                var token = iterator.getCurrentToken();

                var sel = session.selection;
                var initialRange = session.selection.toOrientedRange();
                var startRow, colDiff;

                if (token && /comment/.test(token.type)) {
                    var startRange, endRange;
                    while (token && /comment/.test(token.type)) {
                        var i = token.value.indexOf(comment.start);
                        if (i != -1) {
                            var row = iterator.getCurrentTokenRow();
                            var column = iterator.getCurrentTokenColumn() + i;
                            startRange = new Range(row, column, row, column + comment.start.length);
                            break;
                        }
                        token = iterator.stepBackward();
                    }

                    var iterator = new TokenIterator(session, cursor.row, cursor.column);
                    var token = iterator.getCurrentToken();
                    while (token && /comment/.test(token.type)) {
                        var i = token.value.indexOf(comment.end);
                        if (i != -1) {
                            var row = iterator.getCurrentTokenRow();
                            var column = iterator.getCurrentTokenColumn() + i;
                            endRange = new Range(row, column, row, column - comment.end.length);
                            break;
                        }
                        token = iterator.stepForward();
                    }
                    if (endRange)
                        session.remove(endRange);
                    if (startRange) {
                        session.remove(startRange);
                        startRow = startRange.start.row;
                        colDiff = -comment.start.length;
                    }
                } else {
                    colDiff = comment.start.length;
                    startRow = range.start.row;
                    session.insert(range.end, comment.end);
                    session.insert(range.start, comment.start);
                }
                // todo: selection should have ended up in the right place automatically!
                // if (initialRange.start.row == startRow)
                //     initialRange.start.column += colDiff;
                // if (initialRange.end.row == startRow)
                //     initialRange.end.column += colDiff;
                // session.selection.fromOrientedRange(initialRange);
            };

            this.getTokenizer = function () {
                if (!this.$tokenizer) {
                    this.$tokenizer = new Antlr4Tokenizer(ModelLexer, tokenTypeToNameMap);
                }
                return this.$tokenizer;
            };

            this.getNextLineIndent = function (state, line, tab) {
                var indent = this.$getIndent(line);

                var tokenizedLine = this.getTokenizer().getLineTokens(line, state);
                var tokens = tokenizedLine.tokens;
                var endState = tokenizedLine.state;

                if (tokens.length && tokens[tokens.length - 1].type == "comment") {
                    return indent;
                }

                if (state == "start" || state == "no_regex") {
                    var match = line.match(/^.*(?:\bcase\b.*:|[\{\(\[])\s*$/);
                    if (match) {
                        indent += tab;
                    }
                } else if (state == "doc-start") {
                    if (endState == "start" || endState == "no_regex") {
                        return "";
                    }
                    var match = line.match(/^\s*(\/?)\*/);
                    if (match) {
                        if (match[1]) {
                            indent += " ";
                        }
                    }
                }

                return indent;
            };

            this.checkOutdent = function (state, line, input) {
                return this.$outdent.checkOutdent(line, input);
            };

            this.autoOutdent = function (state, doc, row) {
                this.$outdent.autoOutdent(doc, row);
            };

            this.renderExpressions = function (expr, session){
                const stripReq = (s) => { s.value = s.value.replace('req', '').replace(/\|\|/g, ' or ').replace(/\&\&/g, ' and '); return s};
                const parseMath = e => {
                    try {
                        e.value = mathjs.parse(e.value);
                        return e
                    } catch (err) {
                        e.value = mathjs.parse('0');
                        return e
                    }
                };
                const toTex = p => {p.value = p.value.toTex(); return p;};
                const toExprDOM = p => p.children ? cardOut(p) : $('<p class="prettyExpr" data-line="'+p.start.line+'" data-col="'+p.start.col+'">$$'+p.value+'$$</p>');
                const toAnnotation = p => p.children ? annOut(p) : {line: p.start.line, display: '$$'+p.value+'$$'};
                // const cardOut = (obj, nest) => {
                //     var isExpr = c => c.type == 'expression' || c.type == 'constraint';
                //     var isClass = c => c.type == "class";
                //     var card = nest ? $('<div class="accordion"></div>') : $('<div class="ui styled accordion"></div>');
                //     var cardTitle =  $(`<div class="active title"> <i class="chevron down icon"></i> ${obj.name}</div>`);
                //     var cardContent = $(`<div class="active content"></div>`);
                //     cardContent.append(`<div class="subtitle"><i>${obj.children.filter(p=>isExpr(p)).length} expressions</i></div>`);
                //     let expressions = obj.children.filter(p=>isExpr(p)).map(stripReq).map(parseMath).map(toTex).map(toExprDOM);
                //     let subCard = obj.children.filter(isClass).map(p=>cardOut(p, true));
                //     cardContent.append(expressions);
                //     cardContent.append(subCard);
                //     card.append(cardTitle);
                //     card.append(cardContent);
                //     return card;
                // };
                const annOut = (obj) => {
                    var isExpr = c => c.type == 'expression' || c.type == 'constraint';
                    var isClass = c => c.type == "  class";

                    let expressions = obj.children.filter(p=>isExpr(p))
                        .map(stripReq).map(parseMath)
                        .map(toTex).map(toAnnotation).reduce(flat,[]);
                    let subCard = obj.children.filter(isClass).map(p=>annOut(p)).reduce(flat,[]);
                    let out = [].concat(expressions).concat(subCard);
                    return out;
                };
                const goToLineandCol = function (e){
                    var editor = ace.edit('editor');
                    let l = $(this).data('line');
                    let c = $(this).data('col');
                    editor.focus();
                    editor.gotoLine(l, c, true);

                };
                const flat = function(a, b) {
                    return a.concat(b);
                };
                let annotations = expr.map(annOut).reduce(flat,[]);


                $('.widget.stack-message')
                    .remove();

                session.lineAnnotations = {};
                for(let ann of annotations){
                    session.lineAnnotations[ann.line - 1] = ann;
                }
                // let expStr = expr.map(cardOut);
                $('#renderDiv').html(expStr);
                $('#renderDiv .ui.accordion').accordion({ animateChildren: false, exclusive: false });
                $('#renderDiv .prettyExpr').on('click', goToLineandCol);
                MathJax.Hub.Queue(["Typeset", MathJax.Hub,"renderDiv"]);
            };

            var WorkerClient = require("ace/worker/worker_client").WorkerClient;
            this.createWorker = function (session) {
                this.$worker = new WorkerClient(["ace"], "ace/worker/k-worker", "MyWorker");

                this.$worker.on("errors", function (e) {
                    session.setAnnotations(e.data);
                });

                this.$worker.on("annotate", function (e) {
                    session.setAnnotations(e.data);
                });

                this.$worker.on("parseDecl", function (e) {
                    session.$struct = e.data;
                    const tojsTree = (n=>{n.active = false; if(n.children){
                        n.children = n.children.map(tojsTree);
                    }
                    n.toggled = true;
                    return n;}
                    );
                    session.$tree.data = e.data.map(tojsTree);
                    session.$mode.renderExpressions(e.data, session);
                });

                this.$worker.on("terminate", function () {
                    session.clearAnnotations();
                });
                this.$worker.attachToDocument(session.getDocument());

                return this.$worker;

            };

        }).call(MyMode.prototype);

        exports.Mode = MyMode;
    });