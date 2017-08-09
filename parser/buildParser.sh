antlrPath='/home/afrivera/git/Klang/src/grammar'
grammarPath='.'
java -jar ${antlrPath}/antlr-4.7-complete.jar -Dlanguage=JavaScript  -o ${HOME}/git/k_webeditor/parser/ ${grammarPath}/Model.g4
