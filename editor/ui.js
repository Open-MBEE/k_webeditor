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
    var treeData = {name: 'Main',
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
                const tojsTree = (n=>{n.active = false; n.children = n.children.map(tojsTree); n.toggled = true; return n;});
                var nTree = data.tree.tree.map(tojsTree);
                kTreeInstance.data = treeData.children = nTree;
            } catch (e){
                console.log(e);
            }
        })
    });

}

export {init}