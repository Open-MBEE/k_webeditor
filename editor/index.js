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
           $('#consoleContent code').html(data);
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