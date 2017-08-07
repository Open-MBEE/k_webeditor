var kCompleter = {
    identifierRegexps: [/[a-zA-Z_0-9]/],
    getCompletions: function (editor, session, pos, prefix, callback) {
        let tokz = session.$mode.$tokenizer;
        let keywords = tokz.antlrTokenNameToAceTokenType;
        let toks = tokz
            .getLineTokens(session.getLine(pos.row))
            .tokens
            .filter(tok => tok.type !== 'text');
        let tokI = toks.map(t => t.value).indexOf(prefix);
        let prevTok = tokI > 0 ? toks[tokI - 1] : false;
        let currTok = toks[tokI];

        if (session.$struct && session.$struct.length > 0) {
            const reduceToProps = (list, nodes) => {
                if (!Array.isArray(nodes)) {
                    list.push(nodes);
                    if (nodes.children && nodes.children.length > 0) {
                        reduceToProps(list, nodes.children);
                    }
                } else {
                    for (let node of nodes) {
                        reduceToProps(list, node);
                    }
                }
                return list;
            };
            const namedScopeFilter = (tok) => {
                return typeof tok.name != 'undefined' && tok.type != 'expression';
            };
            let curr={line: pos.row, col: pos.column};
            let scope = findScope({start: curr, end: curr}, session.$struct);
            if(scope.length == 0){
                scope = session.$struct;
            }
            let topLevel = scope.children.filter(namedScopeFilter);
            for (let elm of topLevel) {
                keywords[elm.name] = elm.type;
            }
            if (prevTok && prevTok.type === "punctuation.member") {
                let members = tokI - 2 > 0 ? findType(scope, toks[tokI - 2].value) : [];
                for (let m of members) {
                    members = members.concat(m.children.filter(k => k.type == 'function' || k.type == 'property')).filter(namedScopeFilter);
                }
                keywords = {};
                for (let m of members) {
                    keywords[m.name] = m.type;
                }
            }
        }
        let words = [];
        for (let k in keywords) {
            let v = k.replace(/\'/g, '');
            if (v.lastIndexOf(prefix, 0) == 0) {
                words.push({
                    name: v,
                    value: v,
                    score: 0,
                    meta: keywords[k]
                });
            }
        }
        callback(null, words);
    }
};

function findScope(node, tree){
    const calcDistance = (p1,p2) => {
        return {y: p1.start.line - p2.start.line, x: p1.start.col - p2.start.col};
    };
    const endDist = (p1,p2) => {
        return {y: p1.end.line - p2.end.line, x: p1.end.col - p2.end.col};
    };
    const findMinScope = (scopes) => {
        if (scopes.length === 0) {
            return false;
        }
        const tDist = (x,y)=>Math.sqrt(Math.pow(x,2)+1000*Math.pow(y,2)); //hackish, line dist has superior weight
        var min = scopes[0].scope;
        var minDist = tDist(scopes[0].distance.x,scopes[0].distance.y);
        for (var i = 1; i < scopes.length; i++) {
            if(scopes[i].distance.y <= 0 && scopes[i].distance.x <=0){
                continue; // it's outside of the scope
            }
            let dist = tDist(scopes[i].distance.x,scopes[i].distance.y);
            if (dist < minDist) {
                min = scopes[i].scope;
                minDist = dist;
            }
        }
        return min;
    };

    let scopes = dfs(tree[0],'child.children && child.children.length > 0',[]);
    let distances = [];
    for(let scope of scopes){
        let endD = endDist(node,scope);
        if(endD.y >= 0 && endD.x >= 0){
            continue;
        }
        distances.push({scope: scope, distance: calcDistance(node,scope)});
    }
    let scope = findMinScope(distances);
    return scope ? scope : tree[0];

}

function findType (r,identifier) { // we might be able to simplify this to just search on the children of the scope :3
            if(r.children && r.children.length > 0){
                for(let child of r.children){
                    if(child.name === identifier && child.type == 'property'){
                        let search = dfs(r,{name: child.kType, type: 'class'},[]);
                        return search;
                    }
                }
            }
            return [];
}

function dfs(root, query, bag) {
    if (root.children && root.children.length > 0) {
        let props = Object.keys(query);
        for (let child of root.children) {
            let found = 0;
            if (typeof query !== 'string') {
                for (let prop of props) {
                    if (child[prop] == query[prop]) {
                        found++;
                    }
                }
                if (found == props.length) {
                    bag.push(child);
                }
            } else if(eval(query)) {
                bag.push(child);
            }
            dfs(child, query, bag);
        }
    }
    return bag;
}
function addInlineExpr(e, renderer) {
    var textLayer = renderer.$textLayer;
    var config = textLayer.config;
    var session = textLayer.session;

    if (!session.lineAnnotations) return;

    var first = config.firstRow;
    var last = config.lastRow;

    var lineElements = textLayer.element.childNodes;
    var lineElementsIdx = 0;

    var row = first;
    var foldLine = session.getNextFoldLine(row);
    var foldStart = foldLine ? foldLine.start.row : Infinity;

    var useGroups = textLayer.$useLineGroups();
    var widgets = [];
    while (true) {
        if (row > foldStart) {
            row = foldLine.end.row + 1;
            foldLine = textLayer.session.getNextFoldLine(row, foldLine);
            foldStart = foldLine ? foldLine.start.row : Infinity;
        }
        if (row > last)
            break;

        var lineElement = lineElements[lineElementsIdx++];
        if (lineElement && session.lineAnnotations[row]) {
            if (useGroups) lineElement = lineElement.lastChild;
            var widget, a = session.lineAnnotations[row];
            if (!a.element) {
                widget = document.createElement("span");
                widget.textContent = a.display;
                widget.className = "widget stack-message" + (a.more ? " more" : "");
                widget.annotation = a;
                widget.style = "display: none;";
                session.lineAnnotations[row].element = widget;
            }
            else widget = a.element;

            lineElement.appendChild(widget);
            widgets.push(widget);
        }
        row++;
    }
    MathJax.Hub.Queue(["Typeset", MathJax.Hub,widgets]);
    MathJax.Hub.Queue(function(){
        widgets.forEach((w)=>{w.style = "display: inline-block;" });
    });

}
function initEditor () {
    var aceEditor = window.aceEditor = ace.edit('editor');
    var lang = ace.require("ace/ext/language_tools");
    ace.config.setModuleUrl(
        'ace/mode/k-mode', './k-mode.js'
    );
    ace.config.setModuleUrl(
        'ace/worker/k-worker',
        './k-worker.js'
    );
    aceEditor.$blockScrolling = Infinity;
    aceEditor.setTheme("ace/theme/twilight");
    aceEditor.getSession().setMode('ace/mode/k-mode');
    aceEditor.setOption("showPrintMargin", false);
    aceEditor.setOptions({
    //     // enableSnippets: true
        enableLiveAutocompletion: true
    });
    aceEditor.renderer.on("afterRender", addInlineExpr);
    aceEditor.session.lineAnnotations = {
    };
    lang.setCompleters();
    lang.addCompleter(kCompleter);
    return aceEditor;
}

export {initEditor};