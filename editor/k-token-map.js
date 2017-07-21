module.exports = {
  literals: {
    'keyword': ["req", "type", "package", "import", "annotation",
      "extends", "fun", "pre", "post", "is", "as", "match", "with", "assert", "$result", "case","source", "target"],
    "variable.language": ["this", "true", "false"],
    "keyword.control": ["while", "if", "for", "end", "forall", "do", "then", "else", "continue", "break", "return"],
    'keyword.operator': ['=', '-', '!', '*', '+', '!=', '&&', '||', '>', '<', '<=', '>=', "isin", "!isin", "subset", "psubset", "union", "inter", "in", "exists"],
    'paren.lparen': ['(', '{', '['],
    'paren.rparen': [')', '}', ']'],
    'punctuation.operator': [',', ';', '.'],
    'storage.type': ['fun', 'class', 'Int', 'Real', 'String', 'Bool', 'Char', 'Class', 'Set', 'OSet', 'BAG']
  },
  symbols: {
    'variable.parameter': 'Name',
    'storage.type': 'Type',
    'constant.numeric': ['IntegerLiteral', 'RealLiteral', 'OctalIntegerLiteral'],
    'string': 'StringLiteral',
    'comment': ['LINE_COMMENT'],
    'comment.border': 'CommentBorder'
  }
};