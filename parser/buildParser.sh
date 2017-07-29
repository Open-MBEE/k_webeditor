
grammarPath=${HOME}/git/Klang/src/grammar
java -jar ${grammarPath}/antlr-4.7-complete.jar -Dlanguage=JavaScript  -o ${HOME}/git/k_webeditor/parser/ ${grammarPath}/Model.g4
