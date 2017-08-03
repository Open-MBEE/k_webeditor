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


 $('#send').on('click', function (){
     console.log('clicker or something');
     $.post('/solve/solve',{value: aceEditor.getValue()} , function (data){
           $('#consoleContent pre').html(data.errors.join(''));
           try{
               JSON.parse(JSON.stringify(data.tree));
               treeData.children = data.tree.tree;
           } catch (e){
               console.log(e);
           }
         })
    });

function toggleConsole(){
    $('#consoleTitle div i.up').toggleClass('down')
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

const content = document.getElementById('containmentTree');
ReactDom.render(React.createElement(KTree, {treeData: treeData}), content);

