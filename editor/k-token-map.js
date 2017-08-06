module.exports = {
  literals: {
    'keyword': ['fun', 'class',"req", "type", "package", "import", "annotation", "extends", "fun", "pre", "post", "is", "as", "match", "with", "assert", "$result", "case","source", "target", "var"],
    "keyword.control": ["while", "if", "for", "end", "forall", "do", "then", "else", "continue", "break", "return"],
    'keyword.operator': ['=', '-', '!', '*', '+', '!=', '&&', '||', '>', '<', '<=', '>=', "isin", "!isin", "subset", "psubset", "union", "inter", "in", "exists"],
    'paren.lparen': ['(', '{', '['],
    'paren.rparen': [')', '}', ']'],
    'punctuation.separator': [','],
    'punctuation.type': [':'],
    'punctuation.member': ['.'],
    'storage.type': ['Int', 'Real', 'String', 'Bool', 'Char', 'Class', 'Set', 'OSet', 'BAG']
  },
  symbols: {
    'variable.parameter': 'Identifier',
    'variable.language': 'ThisLiteral',
    'constant.numeric': ['IntegerLiteral', 'RealLiteral', 'OctalIntegerLiteral'],
    'string': 'StringLiteral',
    'comment': 'LINE_COMMENT',
    'comment.border': 'CommentBorder',
    'meta.ws': 'WS'
  }
};