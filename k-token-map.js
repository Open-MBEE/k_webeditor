module.exports = {
  literals: {
    'keyword': ["req","type","package","import","annotation",
    ,"forall","extends","fun","pre","post","is","as"
    ,"end","while","if","for","match",
    ,"forall","with","do","then","else","in","exists"
    ,"isin","!isin","subset","psubset","union","inter",
    ,"assert","continue","break","return","$result","case","this",
    ,"source","target"],
    'keyword.operator': ['=', '-', '!', '*', '+', '!=', '&&', '||'],
    'paren.lparen': ['(', '{', '['],
    'paren.rparen': [')', '}', ']'],
    'punctuation.operator': [',', ';', '.'],
    'storage.type': ['fun','class','Int', 'Real', 'String', 'Bool', 'Char', 'Class', 'Set', 'OSet', 'BAG']
    },
  symbols: {
    'keyword.other': 'Keyword',
    'constant.numeric': ['IntegerLiteral', 'RealLiteral', 'OctalIntegerLiteral'],
    'string': 'StringLiteral',
    'comment': ['LINE_COMMENT'],
    // 'comment.border': 'CommentBorder'
    }
};