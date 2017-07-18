// Generated from Model.g4 by ANTLR 4.7
// jshint ignore: start
var antlr4 = require('antlr4/index');
var constraints;
// This class defines a complete listener for a parse tree produced by ModelParser.
function ModelListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

ModelListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
ModelListener.prototype.constructor = ModelListener;

// Enter a parse tree produced by ModelParser#model.
ModelListener.prototype.enterModel = function(ctx) {
};

// Exit a parse tree produced by ModelParser#model.
ModelListener.prototype.exitModel = function(ctx) {
};


// Enter a parse tree produced by ModelParser#packageDeclaration.
ModelListener.prototype.enterPackageDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#packageDeclaration.
ModelListener.prototype.exitPackageDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#importDeclaration.
ModelListener.prototype.enterImportDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#importDeclaration.
ModelListener.prototype.exitImportDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#annotationDeclaration.
ModelListener.prototype.enterAnnotationDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#annotationDeclaration.
ModelListener.prototype.exitAnnotationDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#annotation.
ModelListener.prototype.enterAnnotation = function(ctx) {
};

// Exit a parse tree produced by ModelParser#annotation.
ModelListener.prototype.exitAnnotation = function(ctx) {
};


// Enter a parse tree produced by ModelParser#topDeclaration.
ModelListener.prototype.enterTopDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#topDeclaration.
ModelListener.prototype.exitTopDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#entityDeclaration.
ModelListener.prototype.enterEntityDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#entityDeclaration.
ModelListener.prototype.exitEntityDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#typeParameters.
ModelListener.prototype.enterTypeParameters = function(ctx) {
};

// Exit a parse tree produced by ModelParser#typeParameters.
ModelListener.prototype.exitTypeParameters = function(ctx) {
};


// Enter a parse tree produced by ModelParser#typeParameter.
ModelListener.prototype.enterTypeParameter = function(ctx) {
};

// Exit a parse tree produced by ModelParser#typeParameter.
ModelListener.prototype.exitTypeParameter = function(ctx) {
};


// Enter a parse tree produced by ModelParser#typeBound.
ModelListener.prototype.enterTypeBound = function(ctx) {
};

// Exit a parse tree produced by ModelParser#typeBound.
ModelListener.prototype.exitTypeBound = function(ctx) {
};


// Enter a parse tree produced by ModelParser#extending.
ModelListener.prototype.enterExtending = function(ctx) {
};

// Exit a parse tree produced by ModelParser#extending.
ModelListener.prototype.exitExtending = function(ctx) {
};


// Enter a parse tree produced by ModelParser#block.
ModelListener.prototype.enterBlock = function(ctx) {
};

// Exit a parse tree produced by ModelParser#block.
ModelListener.prototype.exitBlock = function(ctx) {
};


// Enter a parse tree produced by ModelParser#blockDeclaration.
ModelListener.prototype.enterBlockDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#blockDeclaration.
ModelListener.prototype.exitBlockDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#memberDeclaration.
ModelListener.prototype.enterMemberDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#memberDeclaration.
ModelListener.prototype.exitMemberDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#typeDeclaration.
ModelListener.prototype.enterTypeDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#typeDeclaration.
ModelListener.prototype.exitTypeDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#propertyDeclaration.
ModelListener.prototype.enterPropertyDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#propertyDeclaration.
ModelListener.prototype.exitPropertyDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#propertyModifier.
ModelListener.prototype.enterPropertyModifier = function(ctx) {
};

// Exit a parse tree produced by ModelParser#propertyModifier.
ModelListener.prototype.exitPropertyModifier = function(ctx) {
};


// Enter a parse tree produced by ModelParser#functionDeclaration.
ModelListener.prototype.enterFunctionDeclaration = function(ctx) {
};

// Exit a parse tree produced by ModelParser#functionDeclaration.
ModelListener.prototype.exitFunctionDeclaration = function(ctx) {
};


// Enter a parse tree produced by ModelParser#paramList.
ModelListener.prototype.enterParamList = function(ctx) {
			console.log(ctx.getText());
};

// Exit a parse tree produced by ModelParser#paramList.
ModelListener.prototype.exitParamList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#param.
ModelListener.prototype.enterParam = function(ctx) {
};

// Exit a parse tree produced by ModelParser#param.
ModelListener.prototype.exitParam = function(ctx) {
};


// Enter a parse tree produced by ModelParser#functionSpecification.
ModelListener.prototype.enterFunctionSpecification = function(ctx) {
};

// Exit a parse tree produced by ModelParser#functionSpecification.
ModelListener.prototype.exitFunctionSpecification = function(ctx) {
};


// Enter a parse tree produced by ModelParser#constraint.
ModelListener.prototype.enterConstraint = function(ctx) {
};

// Exit a parse tree produced by ModelParser#constraint.
ModelListener.prototype.exitConstraint = function(ctx) {
};


// Enter a parse tree produced by ModelParser#multiplicity.
ModelListener.prototype.enterMultiplicity = function(ctx) {
};

// Exit a parse tree produced by ModelParser#multiplicity.
ModelListener.prototype.exitMultiplicity = function(ctx) {
};


// Enter a parse tree produced by ModelParser#expressionOrStar.
ModelListener.prototype.enterExpressionOrStar = function(ctx) {
};

// Exit a parse tree produced by ModelParser#expressionOrStar.
ModelListener.prototype.exitExpressionOrStar = function(ctx) {
};


// Enter a parse tree produced by ModelParser#SubType.
ModelListener.prototype.enterSubType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#SubType.
ModelListener.prototype.exitSubType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#IdentType.
ModelListener.prototype.enterIdentType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#IdentType.
ModelListener.prototype.exitIdentType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#FuncType.
ModelListener.prototype.enterFuncType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#FuncType.
ModelListener.prototype.exitFuncType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#CartesianType.
ModelListener.prototype.enterCartesianType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#CartesianType.
ModelListener.prototype.exitCartesianType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#PrimType.
ModelListener.prototype.enterPrimType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#PrimType.
ModelListener.prototype.exitPrimType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ParenType.
ModelListener.prototype.enterParenType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ParenType.
ModelListener.prototype.exitParenType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#primitiveType.
ModelListener.prototype.enterPrimitiveType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#primitiveType.
ModelListener.prototype.exitPrimitiveType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#classIdentifier.
ModelListener.prototype.enterClassIdentifier = function(ctx) {
};

// Exit a parse tree produced by ModelParser#classIdentifier.
ModelListener.prototype.exitClassIdentifier = function(ctx) {
};


// Enter a parse tree produced by ModelParser#collectionKind.
ModelListener.prototype.enterCollectionKind = function(ctx) {
};

// Exit a parse tree produced by ModelParser#collectionKind.
ModelListener.prototype.exitCollectionKind = function(ctx) {
};


// Enter a parse tree produced by ModelParser#typeArguments.
ModelListener.prototype.enterTypeArguments = function(ctx) {
};

// Exit a parse tree produced by ModelParser#typeArguments.
ModelListener.prototype.exitTypeArguments = function(ctx) {
};


// Enter a parse tree produced by ModelParser#LiteralExp.
ModelListener.prototype.enterLiteralExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#LiteralExp.
ModelListener.prototype.exitLiteralExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#NotExp.
ModelListener.prototype.enterNotExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#NotExp.
ModelListener.prototype.exitNotExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#AndExp.
ModelListener.prototype.enterAndExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#AndExp.
ModelListener.prototype.exitAndExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ExistsExp.
ModelListener.prototype.enterExistsExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ExistsExp.
ModelListener.prototype.exitExistsExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#SetEnumExp.
ModelListener.prototype.enterSetEnumExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#SetEnumExp.
ModelListener.prototype.exitSetEnumExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#BreakExp.
ModelListener.prototype.enterBreakExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#BreakExp.
ModelListener.prototype.exitBreakExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#PrevExp.
ModelListener.prototype.enterPrevExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#PrevExp.
ModelListener.prototype.exitPrevExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#BlockExp.
ModelListener.prototype.enterBlockExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#BlockExp.
ModelListener.prototype.exitBlockExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#BinOp2Exp.
ModelListener.prototype.enterBinOp2Exp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#BinOp2Exp.
ModelListener.prototype.exitBinOp2Exp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#TupleExp.
ModelListener.prototype.enterTupleExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#TupleExp.
ModelListener.prototype.exitTupleExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#WhileExp.
ModelListener.prototype.enterWhileExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#WhileExp.
ModelListener.prototype.exitWhileExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#SetRngExp.
ModelListener.prototype.enterSetRngExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#SetRngExp.
ModelListener.prototype.exitSetRngExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#IfExp.
ModelListener.prototype.enterIfExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#IfExp.
ModelListener.prototype.exitIfExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#NegExp.
ModelListener.prototype.enterNegExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#NegExp.
ModelListener.prototype.exitNegExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#OrExp.
ModelListener.prototype.enterOrExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#OrExp.
ModelListener.prototype.exitOrExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#AppExp.
ModelListener.prototype.enterAppExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#AppExp.
ModelListener.prototype.exitAppExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#TypeCheckExp.
ModelListener.prototype.enterTypeCheckExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#TypeCheckExp.
ModelListener.prototype.exitTypeCheckExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ReturnExp.
ModelListener.prototype.enterReturnExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ReturnExp.
ModelListener.prototype.exitReturnExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#IFFExp.
ModelListener.prototype.enterIFFExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#IFFExp.
ModelListener.prototype.exitIFFExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#SetCompExp.
ModelListener.prototype.enterSetCompExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#SetCompExp.
ModelListener.prototype.exitSetCompExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ResultExp.
ModelListener.prototype.enterResultExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ResultExp.
ModelListener.prototype.exitResultExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#AssertExp.
ModelListener.prototype.enterAssertExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#AssertExp.
ModelListener.prototype.exitAssertExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#LambdaExp.
ModelListener.prototype.enterLambdaExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#LambdaExp.
ModelListener.prototype.exitLambdaExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#BinOp1Exp.
ModelListener.prototype.enterBinOp1Exp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#BinOp1Exp.
ModelListener.prototype.exitBinOp1Exp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ForallExp.
ModelListener.prototype.enterForallExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ForallExp.
ModelListener.prototype.exitForallExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#BinOp3Exp.
ModelListener.prototype.enterBinOp3Exp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#BinOp3Exp.
ModelListener.prototype.exitBinOp3Exp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#IdentExp.
ModelListener.prototype.enterIdentExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#IdentExp.
ModelListener.prototype.exitIdentExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#DotExp.
ModelListener.prototype.enterDotExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#DotExp.
ModelListener.prototype.exitDotExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ForExp.
ModelListener.prototype.enterForExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ForExp.
ModelListener.prototype.exitForExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#AssignExp.
ModelListener.prototype.enterAssignExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#AssignExp.
ModelListener.prototype.exitAssignExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ContinueExp.
ModelListener.prototype.enterContinueExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ContinueExp.
ModelListener.prototype.exitContinueExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#ParenExp.
ModelListener.prototype.enterParenExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#ParenExp.
ModelListener.prototype.exitParenExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#TypeCastExp.
ModelListener.prototype.enterTypeCastExp = function(ctx) {
};

// Exit a parse tree produced by ModelParser#TypeCastExp.
ModelListener.prototype.exitTypeCastExp = function(ctx) {
};


// Enter a parse tree produced by ModelParser#PosArgList.
ModelListener.prototype.enterPosArgList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#PosArgList.
ModelListener.prototype.exitPosArgList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#NamedArgList.
ModelListener.prototype.enterNamedArgList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#NamedArgList.
ModelListener.prototype.exitNamedArgList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#positionalArgumentList.
ModelListener.prototype.enterPositionalArgumentList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#positionalArgumentList.
ModelListener.prototype.exitPositionalArgumentList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#namedArgumentList.
ModelListener.prototype.enterNamedArgumentList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#namedArgumentList.
ModelListener.prototype.exitNamedArgumentList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#namedArgument.
ModelListener.prototype.enterNamedArgument = function(ctx) {
};

// Exit a parse tree produced by ModelParser#namedArgument.
ModelListener.prototype.exitNamedArgument = function(ctx) {
};


// Enter a parse tree produced by ModelParser#collectionOrType.
ModelListener.prototype.enterCollectionOrType = function(ctx) {
};

// Exit a parse tree produced by ModelParser#collectionOrType.
ModelListener.prototype.exitCollectionOrType = function(ctx) {
};


// Enter a parse tree produced by ModelParser#rngBindingList.
ModelListener.prototype.enterRngBindingList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#rngBindingList.
ModelListener.prototype.exitRngBindingList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#rngBinding.
ModelListener.prototype.enterRngBinding = function(ctx) {
};

// Exit a parse tree produced by ModelParser#rngBinding.
ModelListener.prototype.exitRngBinding = function(ctx) {
};


// Enter a parse tree produced by ModelParser#patternList.
ModelListener.prototype.enterPatternList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#patternList.
ModelListener.prototype.exitPatternList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#LiteralPattern.
ModelListener.prototype.enterLiteralPattern = function(ctx) {
};

// Exit a parse tree produced by ModelParser#LiteralPattern.
ModelListener.prototype.exitLiteralPattern = function(ctx) {
};


// Enter a parse tree produced by ModelParser#DontCarePattern.
ModelListener.prototype.enterDontCarePattern = function(ctx) {
};

// Exit a parse tree produced by ModelParser#DontCarePattern.
ModelListener.prototype.exitDontCarePattern = function(ctx) {
};


// Enter a parse tree produced by ModelParser#IdentPattern.
ModelListener.prototype.enterIdentPattern = function(ctx) {
};

// Exit a parse tree produced by ModelParser#IdentPattern.
ModelListener.prototype.exitIdentPattern = function(ctx) {
};


// Enter a parse tree produced by ModelParser#CartesianPattern.
ModelListener.prototype.enterCartesianPattern = function(ctx) {
};

// Exit a parse tree produced by ModelParser#CartesianPattern.
ModelListener.prototype.exitCartesianPattern = function(ctx) {
};


// Enter a parse tree produced by ModelParser#TypedPattern.
ModelListener.prototype.enterTypedPattern = function(ctx) {
};

// Exit a parse tree produced by ModelParser#TypedPattern.
ModelListener.prototype.exitTypedPattern = function(ctx) {
};


// Enter a parse tree produced by ModelParser#identifierList.
ModelListener.prototype.enterIdentifierList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#identifierList.
ModelListener.prototype.exitIdentifierList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#expressionList.
ModelListener.prototype.enterExpressionList = function(ctx) {
};

// Exit a parse tree produced by ModelParser#expressionList.
ModelListener.prototype.exitExpressionList = function(ctx) {
};


// Enter a parse tree produced by ModelParser#qualifiedName.
ModelListener.prototype.enterQualifiedName = function(ctx) {
};

// Exit a parse tree produced by ModelParser#qualifiedName.
ModelListener.prototype.exitQualifiedName = function(ctx) {
};


// Enter a parse tree produced by ModelParser#literal.
ModelListener.prototype.enterLiteral = function(ctx) {
};

// Exit a parse tree produced by ModelParser#literal.
ModelListener.prototype.exitLiteral = function(ctx) {
};



exports.ModelListener = ModelListener;