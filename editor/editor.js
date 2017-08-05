var kCompleter = {
    identifierRegexps: [/[a-zA-Z_0-9]/],
    getCompletions: function (editor, session, pos, prefix, callback) {
        let tokz = session.$mode.$tokenizer;
        let keywords = tokz.antlrTokenNameToAceTokenType;
        let toks = tokz
            .getLineTokens(session.getLine(pos.row))
            .tokens
            .filter(tok => tok.type !== 'text');
        let thisTok = toks.map(t=>t.value).indexOf(prefix);
        let prevTok = thisTok > 0 ? toks[thisTok-1] : toks[thisTok];
        if(prevTok.type === "punctuation.member"){
            let members = findType(session,toks[thisTok-2].value).children.filter(c=>c.type == 'function' || c.type == 'property');
            keywords = {}
            for(let m of members){
                keywords[m.name] = m.type;
            }
        }
        if(prevTok){
            let words = [];
                for(let k in keywords){
                    let v = k.replace(/\'/g,'');
                    if (v.lastIndexOf(prefix,0) == 0){
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
    }
};

function findType (session,identifier) {
    if(session.$struct){
        for (let r of session.$struct){
            let node = dfs(r,{name: identifier, type: 'property'});
            if(node != null){
                return dfs(r,{name: node.kType, type: 'class'});
            } else {
                return null;
            }
        }
    }
}

function dfs(root, query){
    if (root.children && root.children.length > 0){
        let props = Object.keys(query);
        for (let child of root.children) {
            let found = 0;
            for (let prop of props) {
                if (child[prop] == query[prop]) {
                    found++;
                }
            }
            if (found == props.length) {
                return child;
            }
            let n = dfs(child, query);
            if (n == null){
                continue;
            } else{
                return n;
            }
        }
    }
        return null;
}

function initEditor () {
    var aceEditor = ace.edit('editor');
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
    lang.setCompleters();
    lang.addCompleter(kCompleter);
    return aceEditor;
}

export {initEditor};