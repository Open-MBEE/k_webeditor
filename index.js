var editor = ace.edit('editor');
ace.require("ace/ext/language_tools");
editor.setTheme("ace/theme/monokai");
editor.getSession().setMode('ace/mode/k-mode');
editor.setOptions({
    enableBasicAutocompletion: true,
    // enableLiveAutocompletion: true
});
