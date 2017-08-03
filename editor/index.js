import ReactDom from 'react-dom';
import React from 'react';
import KTree from './tree.jsx';

var aceEditor = ace.edit('editor');
ace.require("ace/ext/language_tools");
aceEditor.setTheme("ace/theme/twilight");
aceEditor.getSession().setMode('ace/mode/k-mode');
aceEditor.setOption("showPrintMargin", false);
aceEditor.setOptions({
    enableBasicAutocompletion: true,
    // enableLiveAutocompletion: true
});

class KTreeDOM {
    constructor(data, container){
        this._container = container;
        this._data = data;
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

function toggleConsole(){
    $('#consoleTitle div i.up').toggleClass('down');
    $('#editor').toggleClass('collapsed');
    $('#console').toggleClass('collapsed');
    $('#consoleContent').toggleClass('visible');
}

$('.ui.accordion').accordion('refresh');

$('#consoleTitle').on('click', toggleConsole);

var treeData = {name: 'Main',
    toggled: true,
    children: [],
};

var kTreeInstance = new KTreeDOM(treeData, document.getElementById('containmentTree'));


$('#send').on('click', function (){
    $.post('/solve/solve',{value: aceEditor.getValue()} , function (data){
        $('#consoleContent pre').html(data.errors.join(''));
        try{
            JSON.parse(JSON.stringify(data.tree));
            kTreeInstance.data = data.tree.tree;
        } catch (e){
            console.log(e);
        }
    })
});
