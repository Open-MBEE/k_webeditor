import {init} from './ui.js';
import {initEditor} from './editor.js';
$( document ).ready(function (){
    var treeInstance = init();
    var editor = initEditor();
    editor.session.$tree = treeInstance.kTreeInstance;
});
