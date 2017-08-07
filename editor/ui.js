import ReactDOM from 'react-dom';
import React from 'react';
import KTree from './tree.jsx';

class KTreeDOM {
    constructor(data, container){
        this._container = container;
        this._data = data;
        this._render();
    }
    set data(data){
        this._data = data;
        this._render();
    }
    _render() {
        ReactDOM.render(React.createElement(KTree, {treeData: this._data}), this._container);
    }
    get container(){
        return this._container
    }
    destroy() {
        ReactDOM.unmountComponentAtNode(this._container);
    }
}




function init(){
    var treeData = {name: 'K',
        toggled: true,
        children: [],
    };
    var kTreeInstance = new KTreeDOM(treeData, document.getElementById('containmentTree'));
    function toggleConsole(){
        $('#consoleTitle div i.up').toggleClass('down');
        $('#editor').toggleClass('collapsed');
        $('#console').toggleClass('collapsed');
        $('#consoleContent').toggleClass('visible');
    }

    $('.ui.accordion').accordion('refresh');

    $('#consoleTitle').on('click', toggleConsole);
    $('#send').on('click', function (){
        $.post('/solve/solve',{value: window.aceEditor.getValue()} , function (data){
            $('#consoleContent pre').html(data.errors.join(''));
            try{
                JSON.parse(JSON.stringify(data.tree));
                const tojsTree = (n=>{n.active = false; n.children = n.children.map(tojsTree); n.toggled = true; return n;}).filter(n=>name.length > 0);
                const cardOut = (obj) => {
                    var card = nest ? $('<div class="accordion"></div>') : $('<div class="ui styled accordion"></div>');
                    var cardTitle =  $(`<div class="active title"> <i class="chevron down icon"></i> Solution </div>`);
                    var cardContent = $(`<div class="active content"></div>`);
                    var cardContent = $(`<div id="solutionDiv">${obj.solution}</div>`);
                    // let expressions = obj.children.filter(p=>isExpr(p)).map(stripReq).map(parseMath).map(toTex).map(toExprDOM);
                    // let subCard = obj.children.filter(isClass).map(p=>cardOut(p, true));
                    cardContent.append(expressions);
                    // cardContent.append(subCard);
                    card.append(cardTitle);
                    card.append(cardContent);
                    return card;
                };
                var nTree = data.tree.tree.map(tojsTree);
                $('#renderDiv').html(cardOut(data));
                var solEditor = window.aceEditor = ace.edit('solutionDiv');
                var lang = ace.require("ace/ext/language_tools");
                ace.config.setModuleUrl(
                    'ace/mode/k-mode', './k-mode.js'
                );
                ace.config.setModuleUrl(
                    'ace/worker/k-worker',
                    './k-worker.js'
                );
                solEditor.$blockScrolling = Infinity;
                solEditor.setTheme("ace/theme/twilight");
                solEditor.getSession().setMode('ace/mode/k-mode');
                kTreeInstance.data = treeData.children = nTree;
            } catch (e){
                console.log(e);
            }
        })
    });

    return {kTreeInstance};

}

export {init}