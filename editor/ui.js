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
                // const tojsTree = (n=>{n.active = false; n.children = n.children.map(tojsTree); n.toggled = true; return n;}).filter(n=>name.length > 0);
                const cardOut = (obj,nest) => {
                    var card = nest ? $('<div class="accordion"></div>') : $('<div class="ui styled accordion"></div>');
                    var cardTitle =  $(`<div class="active title"> <i class="chevron down icon"></i> Solution </div>`);
                    var cardContent = $(`<div class="active content" style=""></div>`);
                    var cardContent2 = $(`<div id="solutionDiv" style="height: 10rem;">${JSON.stringify(obj.result)}</div>`);
                    card.append(cardTitle);
                    card.append(cardContent.append(cardContent2));
                    return card;
                };
                // var nTree = data.tree.tree.map(tojsTree);
                $('#renderDiv').html(cardOut(data));
                var solEditor = window.aceEditor = ace.edit('solutionDiv');
                // var lang = ace.require("ace/ext/language_tools");
                // ace.config.setModuleUrl(
                //     'ace/mode/k-mode', './k-mode.js'
                // );
                // ace.config.setModuleUrl(
                //     'ace/worker/k-worker',
                //     './k-worker.js'
                // );
                solEditor.$blockScrolling = Infinity;
                solEditor.setTheme("ace/theme/twilight");
                solEditor.renderer.setShowGutter(true/false);
                solEditor.getSession().setMode('ace/mode/javascript');
                // kTreeInstance.data = treeData.children = nTree;
            } catch (e){
                console.log(e);
            }
        })
    });

    return {kTreeInstance};

}

export {init}