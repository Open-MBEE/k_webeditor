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
         $.post('/solve/solve',{value: editor.getValue()} , function (data){
           $('#solution').html(JSON.stringify(data));
         }) 
    });
