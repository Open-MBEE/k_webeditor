import ReactDom from 'react-dom';
import React from 'react';
import KTree from './tree.jsx';

var editor = ace.edit('editor');
ace.require("ace/ext/language_tools");
editor.setTheme("ace/theme/twilight");
editor.getSession().setMode('ace/mode/k-mode');
editor.setOption("showPrintMargin", false);
editor.setOptions({
    enableBasicAutocompletion: true,
    // enableLiveAutocompletion: true
});


 $('#send').on('click', function (){
     console.log('clicker or something');
         $.post('flipper.jpl.nasa.gov:8080/solve/solve',{value: editor.getValue()} , function (data){
           $('#consoleContent code').html(data.errors.join(''));
           try{
               JSON.parse(JSON.stringify(data.tree));
               treeData.children = data.tree;
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

