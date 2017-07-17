// Generated from c:\Users\afrivera\for_ub\git\MCR\public\keditor\parser\Model.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, Keyword=91, SUCHTHAT=92, IntegerLiteral=93, 
		RealLiteral=94, BooleanLiteral=95, NullLiteral=96, ThisLiteral=97, CharacterLiteral=98, 
		StringLiteral=99, Identifier=100, CommentBorder=101, COMMENT=102, LINE_COMMENT=103, 
		WS=104, SEP=105;
	public static final int
		RULE_model = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_annotationDeclaration = 3, RULE_annotation = 4, RULE_topDeclaration = 5, 
		RULE_entityDeclaration = 6, RULE_typeParameters = 7, RULE_typeParameter = 8, 
		RULE_typeBound = 9, RULE_extending = 10, RULE_block = 11, RULE_blockDeclaration = 12, 
		RULE_memberDeclaration = 13, RULE_typeDeclaration = 14, RULE_propertyDeclaration = 15, 
		RULE_propertyModifier = 16, RULE_functionDeclaration = 17, RULE_paramList = 18, 
		RULE_param = 19, RULE_functionSpecification = 20, RULE_constraint = 21, 
		RULE_multiplicity = 22, RULE_expressionOrStar = 23, RULE_type = 24, RULE_primitiveType = 25, 
		RULE_classIdentifier = 26, RULE_collectionKind = 27, RULE_typeArguments = 28, 
		RULE_expression = 29, RULE_argumentList = 30, RULE_positionalArgumentList = 31, 
		RULE_namedArgumentList = 32, RULE_namedArgument = 33, RULE_collectionOrType = 34, 
		RULE_rngBindingList = 35, RULE_rngBinding = 36, RULE_patternList = 37, 
		RULE_pattern = 38, RULE_identifierList = 39, RULE_expressionList = 40, 
		RULE_qualifiedName = 41, RULE_literal = 42;
	public static final String[] ruleNames = {
		"model", "packageDeclaration", "importDeclaration", "annotationDeclaration", 
		"annotation", "topDeclaration", "entityDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "extending", "block", "blockDeclaration", 
		"memberDeclaration", "typeDeclaration", "propertyDeclaration", "propertyModifier", 
		"functionDeclaration", "paramList", "param", "functionSpecification", 
		"constraint", "multiplicity", "expressionOrStar", "type", "primitiveType", 
		"classIdentifier", "collectionKind", "typeArguments", "expression", "argumentList", 
		"positionalArgumentList", "namedArgumentList", "namedArgument", "collectionOrType", 
		"rngBindingList", "rngBinding", "patternList", "pattern", "identifierList", 
		"expressionList", "qualifiedName", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'import'", "'.'", "'*'", "'annotation'", "':'", "'@'", 
		"'('", "')'", "'class'", "'assoc'", "'{'", "'}'", "'['", "','", "']'", 
		"'+'", "'extends'", "'type'", "'='", "':='", "'part'", "'var'", "'val'", 
		"'ordered'", "'unique'", "'source'", "'target'", "'fun'", "'pre'", "'post'", 
		"'req'", "'->'", "'{|'", "'|}'", "'Bool'", "'Char'", "'Int'", "'Real'", 
		"'String'", "'Unit'", "'Class'", "'Set'", "'Bag'", "'Seq'", "'Tuple'", 
		"'!'", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'in'", 
		"'..'", "'|'", "'/'", "'%'", "'inter'", "'\\'", "'++'", "'#'", "'^'", 
		"'-'", "'union'", "'<='", "'>='", "'<'", "'>'", "'!='", "'isin'", "'!isin'", 
		"'subset'", "'psubset'", "'&&'", "'||'", "'=>'", "'<=>'", "'is'", "'as'", 
		"'assert'", "'~'", "'forall'", "'exists'", "'continue'", "'break'", "'return'", 
		"'$result'", "'::'", "'_'", null, "':-'", null, null, null, "'null'", 
		"'this'", null, null, null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Keyword", "SUCHTHAT", "IntegerLiteral", 
		"RealLiteral", "BooleanLiteral", "NullLiteral", "ThisLiteral", "CharacterLiteral", 
		"StringLiteral", "Identifier", "CommentBorder", "COMMENT", "LINE_COMMENT", 
		"WS", "SEP"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<AnnotationDeclarationContext> annotationDeclaration() {
			return getRuleContexts(AnnotationDeclarationContext.class);
		}
		public AnnotationDeclarationContext annotationDeclaration(int i) {
			return getRuleContext(AnnotationDeclarationContext.class,i);
		}
		public List<TopDeclarationContext> topDeclaration() {
			return getRuleContexts(TopDeclarationContext.class);
		}
		public TopDeclarationContext topDeclaration(int i) {
			return getRuleContext(TopDeclarationContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(86);
				packageDeclaration();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(89);
				importDeclaration();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(95);
				annotationDeclaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__80 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (RealLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (ThisLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(101);
				topDeclaration();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(113);
			qualifiedName();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(114);
				match(T__2);
				setState(115);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__4);
			setState(119);
			match(Identifier);
			setState(120);
			match(T__5);
			setState(121);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__6);
			setState(124);
			match(Identifier);
			setState(125);
			match(T__7);
			setState(126);
			expression(0);
			setState(127);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopDeclarationContext extends ParserRuleContext {
		public EntityDeclarationContext entityDeclaration() {
			return getRuleContext(EntityDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDeclaration; }
	}

	public final TopDeclarationContext topDeclaration() throws RecognitionException {
		TopDeclarationContext _localctx = new TopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topDeclaration);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					annotation();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				entityDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(136);
					annotation();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public TerminalNode Keyword() { return getToken(ModelParser.Keyword, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EntityDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDeclaration; }
	}

	public final EntityDeclarationContext entityDeclaration() throws RecognitionException {
		EntityDeclarationContext _localctx = new EntityDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entityDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Keyword) {
				{
				setState(146);
				match(Keyword);
				}
			}

			setState(149);
			match(Identifier);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(150);
				typeParameters();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(153);
				extending();
				}
			}

			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				match(T__11);
				setState(157);
				block();
				setState(158);
				match(T__12);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__13);
			setState(163);
			typeParameter();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(164);
				match(T__14);
				setState(165);
				typeParameter();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Identifier);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(174);
				match(T__5);
				setState(175);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			type(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(179);
				match(T__16);
				setState(180);
				type(0);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendingContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ExtendingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extending; }
	}

	public final ExtendingContext extending() throws RecognitionException {
		ExtendingContext _localctx = new ExtendingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__17);
			setState(187);
			type(0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(188);
				match(T__14);
				setState(189);
				type(0);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockDeclarationContext> blockDeclaration() {
			return getRuleContexts(BlockDeclarationContext.class);
		}
		public BlockDeclarationContext blockDeclaration(int i) {
			return getRuleContext(BlockDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__80 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (RealLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (ThisLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(195);
				blockDeclaration();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(201);
				annotation();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			memberDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				typeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				propertyDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				constraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__18);
			setState(217);
			match(Identifier);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__19) {
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(218);
					typeParameters();
					}
				}

				setState(221);
				match(T__19);
				setState(222);
				type(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<PropertyModifierContext> propertyModifier() {
			return getRuleContexts(PropertyModifierContext.class);
		}
		public PropertyModifierContext propertyModifier(int i) {
			return getRuleContext(PropertyModifierContext.class,i);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				{
				setState(225);
				propertyModifier();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(Identifier);
			setState(232);
			match(T__5);
			setState(233);
			type(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(234);
				multiplicity();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModifierContext extends ParserRuleContext {
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionSpecificationContext> functionSpecification() {
			return getRuleContexts(FunctionSpecificationContext.class);
		}
		public FunctionSpecificationContext functionSpecification(int i) {
			return getRuleContext(FunctionSpecificationContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__28);
			setState(244);
			match(Identifier);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(245);
				typeParameters();
				}
			}

			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(248);
				match(T__7);
				setState(249);
				paramList();
				setState(250);
				match(T__8);
				}
				break;
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(254);
				match(T__5);
				setState(255);
				type(0);
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(258);
				functionSpecification();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(264);
				match(T__11);
				setState(265);
				block();
				setState(266);
				match(T__12);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			param();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(271);
				match(T__14);
				setState(272);
				param();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Identifier);
			setState(279);
			match(T__5);
			setState(280);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecificationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecification; }
	}

	public final FunctionSpecificationContext functionSpecification() throws RecognitionException {
		FunctionSpecificationContext _localctx = new FunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionSpecification);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__29);
				setState(283);
				expression(0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__30);
				setState(285);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__31);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(289);
				match(Identifier);
				setState(290);
				match(T__5);
				}
				break;
			}
			setState(293);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicityContext extends ParserRuleContext {
		public List<ExpressionOrStarContext> expressionOrStar() {
			return getRuleContexts(ExpressionOrStarContext.class);
		}
		public ExpressionOrStarContext expressionOrStar(int i) {
			return getRuleContext(ExpressionOrStarContext.class,i);
		}
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__13);
			setState(296);
			expressionOrStar();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(297);
				match(T__14);
				setState(298);
				expressionOrStar();
				}
			}

			setState(301);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOrStarContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOrStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrStar; }
	}

	public final ExpressionOrStarContext expressionOrStar() throws RecognitionException {
		ExpressionOrStarContext _localctx = new ExpressionOrStarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionOrStar);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__11:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__52:
			case T__63:
			case T__80:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__89:
			case IntegerLiteral:
			case RealLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				expression(0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubTypeContext extends TypeContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class IdentTypeContext extends TypeContext {
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class FuncTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FuncTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class CartesianTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public CartesianTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class PrimTypeContext extends TypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ParenTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParenTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(308);
				primitiveType();
				}
				break;
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				classIdentifier();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(310);
					typeArguments();
					}
					break;
				}
				}
				break;
			case T__7:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(T__7);
				setState(314);
				type(0);
				setState(315);
				match(T__8);
				}
				break;
			case T__33:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(T__33);
				setState(318);
				match(Identifier);
				setState(319);
				match(T__5);
				setState(320);
				type(0);
				setState(321);
				match(SUCHTHAT);
				setState(322);
				expression(0);
				setState(323);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(327);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(328);
						match(T__32);
						setState(329);
						type(4);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(330);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(333); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(331);
								match(T__3);
								setState(332);
								type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(335); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassIdentifierContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classIdentifier);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				qualifiedName();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__41);
				}
				break;
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				collectionKind();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionKindContext extends ParserRuleContext {
		public CollectionKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionKind; }
	}

	public final CollectionKindContext collectionKind() throws RecognitionException {
		CollectionKindContext _localctx = new CollectionKindContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_collectionKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__13);
			setState(352);
			type(0);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(353);
				match(T__14);
				setState(354);
				type(0);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralExpContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExistsExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SetEnumExpContext extends ExpressionContext {
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SetEnumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BreakExpContext extends ExpressionContext {
		public BreakExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrevExpContext extends ExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrevExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BlockExpContext extends ExpressionContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinOp2ExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinOp2ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TupleExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class WhileExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhileExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SetRngExpContext extends ExpressionContext {
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetRngExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IfExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NegExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AppExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AppExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeCheckExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeCheckExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IFFExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IFFExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SetCompExpContext extends ExpressionContext {
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public SetCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ResultExpContext extends ExpressionContext {
		public ResultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssertExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LambdaExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinOp1ExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinOp1ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ForallExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinOp3ExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinOp3ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentExpContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DotExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public DotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ForExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueExpContext extends ExpressionContext {
		public ContinueExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeCastExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeCastExpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(363);
				match(T__7);
				setState(364);
				expression(0);
				setState(365);
				match(T__8);
				}
				break;
			case 2:
				{
				_localctx = new TupleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(T__45);
				setState(368);
				match(T__7);
				setState(369);
				expression(0);
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(370);
					match(T__14);
					setState(371);
					expression(0);
					}
					}
					setState(374); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__14 );
				setState(376);
				match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(Identifier);
				}
				break;
			case 5:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(T__46);
				setState(381);
				expression(27);
				}
				break;
			case 6:
				{
				_localctx = new BlockExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(T__11);
				setState(383);
				block();
				setState(384);
				match(T__12);
				}
				break;
			case 7:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386);
				match(T__47);
				setState(387);
				expression(0);
				setState(388);
				match(T__48);
				setState(389);
				expression(0);
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(390);
					match(T__49);
					setState(391);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				match(T__50);
				setState(395);
				expression(0);
				setState(396);
				match(T__51);
				setState(397);
				expression(24);
				}
				break;
			case 9:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				match(T__52);
				setState(400);
				pattern(0);
				setState(401);
				match(T__53);
				setState(402);
				expression(0);
				setState(403);
				match(T__51);
				setState(404);
				expression(23);
				}
				break;
			case 10:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				collectionKind();
				setState(407);
				match(T__11);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__80 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (RealLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (ThisLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(408);
					expressionList();
					}
				}

				setState(411);
				match(T__12);
				}
				break;
			case 11:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				collectionKind();
				setState(414);
				match(T__11);
				setState(415);
				expression(0);
				setState(416);
				match(T__54);
				setState(417);
				expression(0);
				setState(418);
				match(T__12);
				}
				break;
			case 12:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				collectionKind();
				setState(421);
				match(T__11);
				setState(422);
				expression(0);
				setState(423);
				match(T__55);
				setState(424);
				rngBindingList();
				setState(425);
				match(SUCHTHAT);
				setState(426);
				expression(0);
				setState(427);
				match(T__12);
				}
				break;
			case 13:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				match(T__80);
				setState(430);
				match(T__7);
				setState(431);
				expression(0);
				setState(432);
				match(T__8);
				}
				break;
			case 14:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(434);
				match(T__63);
				setState(435);
				expression(9);
				}
				break;
			case 15:
				{
				_localctx = new PrevExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(436);
				qualifiedName();
				setState(437);
				match(T__81);
				}
				break;
			case 16:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				match(T__82);
				setState(440);
				rngBindingList();
				setState(441);
				match(SUCHTHAT);
				setState(442);
				expression(7);
				}
				break;
			case 17:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(444);
				match(T__83);
				setState(445);
				rngBindingList();
				setState(446);
				match(SUCHTHAT);
				setState(447);
				expression(6);
				}
				break;
			case 18:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				pattern(0);
				setState(450);
				match(T__32);
				setState(451);
				expression(5);
				}
				break;
			case 19:
				{
				_localctx = new ContinueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(453);
				match(T__84);
				}
				break;
			case 20:
				{
				_localctx = new BreakExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(454);
				match(T__85);
				}
				break;
			case 21:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455);
				match(T__86);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(456);
					expression(0);
					}
					break;
				}
				}
				break;
			case 22:
				{
				_localctx = new ResultExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(459);
				match(T__87);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(463);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(464);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(466);
						_la = _input.LA(1);
						if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__63 - 17)) | (1L << (T__64 - 17)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(469);
						_la = _input.LA(1);
						if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__65 - 20)) | (1L << (T__66 - 20)) | (1L << (T__67 - 20)) | (1L << (T__68 - 20)) | (1L << (T__69 - 20)) | (1L << (T__70 - 20)) | (1L << (T__71 - 20)) | (1L << (T__72 - 20)) | (1L << (T__73 - 20)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(470);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(472);
						match(T__74);
						setState(473);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(475);
						match(T__75);
						setState(476);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(478);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__77) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(479);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(481);
						match(T__20);
						setState(482);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(484);
						match(T__2);
						setState(485);
						match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(487);
						match(T__7);
						setState(489);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__80 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (RealLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (ThisLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(488);
							argumentList();
							}
						}

						setState(491);
						match(T__8);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(493);
						match(T__78);
						setState(494);
						type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(495);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(496);
						match(T__79);
						setState(497);
						type(0);
						}
						break;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PosArgListContext extends ArgumentListContext {
		public PositionalArgumentListContext positionalArgumentList() {
			return getRuleContext(PositionalArgumentListContext.class,0);
		}
		public PosArgListContext(ArgumentListContext ctx) { copyFrom(ctx); }
	}
	public static class NamedArgListContext extends ArgumentListContext {
		public NamedArgumentListContext namedArgumentList() {
			return getRuleContext(NamedArgumentListContext.class,0);
		}
		public NamedArgListContext(ArgumentListContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentList);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new PosArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				positionalArgumentList();
				}
				break;
			case 2:
				_localctx = new NamedArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				namedArgumentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionalArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PositionalArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArgumentList; }
	}

	public final PositionalArgumentListContext positionalArgumentList() throws RecognitionException {
		PositionalArgumentListContext _localctx = new PositionalArgumentListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			expression(0);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(508);
				match(T__14);
				setState(509);
				expression(0);
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentListContext extends ParserRuleContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public NamedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgumentList; }
	}

	public final NamedArgumentListContext namedArgumentList() throws RecognitionException {
		NamedArgumentListContext _localctx = new NamedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			namedArgument();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(516);
				match(T__14);
				setState(517);
				namedArgument();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(Identifier);
			setState(524);
			match(T__88);
			setState(525);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionOrTypeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CollectionOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionOrType; }
	}

	public final CollectionOrTypeContext collectionOrType() throws RecognitionException {
		CollectionOrTypeContext _localctx = new CollectionOrTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_collectionOrType);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RngBindingListContext extends ParserRuleContext {
		public List<RngBindingContext> rngBinding() {
			return getRuleContexts(RngBindingContext.class);
		}
		public RngBindingContext rngBinding(int i) {
			return getRuleContext(RngBindingContext.class,i);
		}
		public RngBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rngBindingList; }
	}

	public final RngBindingListContext rngBindingList() throws RecognitionException {
		RngBindingListContext _localctx = new RngBindingListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			rngBinding();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(532);
				match(T__14);
				setState(533);
				rngBinding();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RngBindingContext extends ParserRuleContext {
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public CollectionOrTypeContext collectionOrType() {
			return getRuleContext(CollectionOrTypeContext.class,0);
		}
		public RngBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rngBinding; }
	}

	public final RngBindingContext rngBinding() throws RecognitionException {
		RngBindingContext _localctx = new RngBindingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			patternList();
			setState(540);
			match(T__5);
			setState(541);
			collectionOrType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternList; }
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			pattern(0);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(544);
				match(T__14);
				setState(545);
				pattern(0);
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralPatternContext extends PatternContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPatternContext(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class DontCarePatternContext extends PatternContext {
		public DontCarePatternContext(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class IdentPatternContext extends PatternContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentPatternContext(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class CartesianPatternContext extends PatternContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public CartesianPatternContext(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class TypedPatternContext extends PatternContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedPatternContext(PatternContext ctx) { copyFrom(ctx); }
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case RealLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(552);
				literal();
				}
				break;
			case T__89:
				{
				_localctx = new DontCarePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				match(T__89);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(554);
				match(Identifier);
				}
				break;
			case T__7:
				{
				_localctx = new CartesianPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555);
				match(T__7);
				setState(556);
				pattern(0);
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(557);
					match(T__14);
					setState(558);
					pattern(0);
					}
					}
					setState(561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__14 );
				setState(563);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypedPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(567);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(568);
					match(T__5);
					setState(569);
					type(0);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Identifier);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(576);
				match(T__14);
				setState(577);
				match(Identifier);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			expression(0);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(584);
				match(T__14);
				setState(585);
				expression(0);
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Identifier);
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(592);
					match(T__2);
					setState(593);
					match(Identifier);
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(ModelParser.RealLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ModelParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ModelParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ModelParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(ModelParser.NullLiteral, 0); }
		public TerminalNode ThisLiteral() { return getToken(ModelParser.ThisLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (IntegerLiteral - 93)) | (1L << (RealLiteral - 93)) | (1L << (BooleanLiteral - 93)) | (1L << (NullLiteral - 93)) | (1L << (ThisLiteral - 93)) | (1L << (CharacterLiteral - 93)) | (1L << (StringLiteral - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 38:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 29);
		case 10:
			return precpred(_ctx, 28);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u025c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\5\2Z\n\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\2\7\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"w\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0085\n\7\f"+
		"\7\16\7\u0088\13\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7\5\7\u0092"+
		"\n\7\3\b\3\b\5\b\u0096\n\b\3\b\3\b\5\b\u009a\n\b\3\b\5\b\u009d\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\7\13\u00b8\n\13"+
		"\f\13\16\13\u00bb\13\13\3\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13"+
		"\f\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r\3\16\7\16\u00cd\n\16\f\16\16"+
		"\16\u00d0\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20"+
		"\3\20\3\20\5\20\u00de\n\20\3\20\3\20\5\20\u00e2\n\20\3\21\7\21\u00e5\n"+
		"\21\f\21\16\21\u00e8\13\21\3\21\3\21\3\21\3\21\5\21\u00ee\n\21\3\21\3"+
		"\21\5\21\u00f2\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u00f9\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ff\n\23\3\23\3\23\5\23\u0103\n\23\3\23\7\23\u0106\n"+
		"\23\f\23\16\23\u0109\13\23\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3\24\3"+
		"\24\3\24\7\24\u0114\n\24\f\24\16\24\u0117\13\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\5\26\u0121\n\26\3\27\3\27\3\27\5\27\u0126\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u012e\n\30\3\30\3\30\3\31\3\31\5\31\u0134"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u013a\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0148\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\6\32\u0150\n\32\r\32\16\32\u0151\7\32\u0154\n\32\f\32\16\32\u0157"+
		"\13\32\3\33\3\33\3\34\3\34\3\34\5\34\u015e\n\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\7\36\u0166\n\36\f\36\16\36\u0169\13\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u0177\n\37\r\37\16\37\u0178"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u018b\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u019c\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01cc\n\37\3\37\5\37\u01cf\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u01ec\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u01f5\n\37\f\37\16\37\u01f8\13\37\3 \3 \5 \u01fc\n \3"+
		"!\3!\3!\7!\u0201\n!\f!\16!\u0204\13!\3\"\3\"\3\"\7\"\u0209\n\"\f\"\16"+
		"\"\u020c\13\"\3#\3#\3#\3#\3$\3$\5$\u0214\n$\3%\3%\3%\7%\u0219\n%\f%\16"+
		"%\u021c\13%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u0225\n\'\f\'\16\'\u0228\13\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\6(\u0232\n(\r(\16(\u0233\3(\3(\5(\u0238\n(\3"+
		"(\3(\3(\7(\u023d\n(\f(\16(\u0240\13(\3)\3)\3)\7)\u0245\n)\f)\16)\u0248"+
		"\13)\3*\3*\3*\7*\u024d\n*\f*\16*\u0250\13*\3+\3+\3+\7+\u0255\n+\f+\16"+
		"+\u0258\13+\3,\3,\3,\2\5\62<N-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\f\4\2\f\rff\3\2\26\27\3\2\30\36"+
		"\3\2&+\3\2-/\4\2\6\6;A\4\2\23\23BC\4\2\26\26DL\3\2OP\3\2_e\2\u0292\2Y"+
		"\3\2\2\2\4o\3\2\2\2\6r\3\2\2\2\bx\3\2\2\2\n}\3\2\2\2\f\u0091\3\2\2\2\16"+
		"\u0093\3\2\2\2\20\u00a4\3\2\2\2\22\u00af\3\2\2\2\24\u00b4\3\2\2\2\26\u00bc"+
		"\3\2\2\2\30\u00c8\3\2\2\2\32\u00ce\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3"+
		"\2\2\2 \u00e6\3\2\2\2\"\u00f3\3\2\2\2$\u00f5\3\2\2\2&\u0110\3\2\2\2(\u0118"+
		"\3\2\2\2*\u0120\3\2\2\2,\u0122\3\2\2\2.\u0129\3\2\2\2\60\u0133\3\2\2\2"+
		"\62\u0147\3\2\2\2\64\u0158\3\2\2\2\66\u015d\3\2\2\28\u015f\3\2\2\2:\u0161"+
		"\3\2\2\2<\u01ce\3\2\2\2>\u01fb\3\2\2\2@\u01fd\3\2\2\2B\u0205\3\2\2\2D"+
		"\u020d\3\2\2\2F\u0213\3\2\2\2H\u0215\3\2\2\2J\u021d\3\2\2\2L\u0221\3\2"+
		"\2\2N\u0237\3\2\2\2P\u0241\3\2\2\2R\u0249\3\2\2\2T\u0251\3\2\2\2V\u0259"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[]\5\6\4\2\\[\3\2\2\2"+
		"]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5\b\5\2ba\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ej\3\2\2\2fd\3\2\2\2gi\5\f\7\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\2\2\3n\3\3\2"+
		"\2\2op\7\3\2\2pq\5T+\2q\5\3\2\2\2rs\7\4\2\2sv\5T+\2tu\7\5\2\2uw\7\6\2"+
		"\2vt\3\2\2\2vw\3\2\2\2w\7\3\2\2\2xy\7\7\2\2yz\7f\2\2z{\7\b\2\2{|\5\62"+
		"\32\2|\t\3\2\2\2}~\7\t\2\2~\177\7f\2\2\177\u0080\7\n\2\2\u0080\u0081\5"+
		"<\37\2\u0081\u0082\7\13\2\2\u0082\13\3\2\2\2\u0083\u0085\5\n\6\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0092\5\16\b\2\u008a"+
		"\u008c\5\n\6\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\5\34\17\2\u0091\u0086\3\2\2\2\u0091\u008d\3\2\2\2\u0092\r\3\2\2"+
		"\2\u0093\u0095\t\2\2\2\u0094\u0096\7]\2\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7f\2\2\u0098\u009a\5\20\t\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\26"+
		"\f\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a2\3\2\2\2\u009e"+
		"\u009f\7\16\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7\17\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4"+
		"\u00a5\7\20\2\2\u00a5\u00aa\5\22\n\2\u00a6\u00a7\7\21\2\2\u00a7\u00a9"+
		"\5\22\n\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7\22\2\2\u00ae\21\3\2\2\2\u00af\u00b2\7f\2\2\u00b0\u00b1\7\b\2\2\u00b1"+
		"\u00b3\5\24\13\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2"+
		"\2\2\u00b4\u00b9\5\62\32\2\u00b5\u00b6\7\23\2\2\u00b6\u00b8\5\62\32\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd"+
		"\u00c2\5\62\32\2\u00be\u00bf\7\21\2\2\u00bf\u00c1\5\62\32\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\27\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5\n\6\2\u00cc\u00cb\3\2\2"+
		"\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\34\17\2\u00d2\33\3\2\2\2\u00d3"+
		"\u00d9\5\36\20\2\u00d4\u00d9\5 \21\2\u00d5\u00d9\5$\23\2\u00d6\u00d9\5"+
		",\27\2\u00d7\u00d9\5<\37\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\35\3\2\2"+
		"\2\u00da\u00db\7\25\2\2\u00db\u00e1\7f\2\2\u00dc\u00de\5\20\t\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\26"+
		"\2\2\u00e0\u00e2\5\62\32\2\u00e1\u00dd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2"+
		"\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00ed\5\62\32\2"+
		"\u00ec\u00ee\5.\30\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f2\5<\37\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f4\t\4\2\2\u00f4#\3\2\2\2\u00f5"+
		"\u00f6\7\37\2\2\u00f6\u00f8\7f\2\2\u00f7\u00f9\5\20\t\2\u00f8\u00f7\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00fb\7\n\2\2\u00fb"+
		"\u00fc\5&\24\2\u00fc\u00fd\7\13\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\7\b\2\2\u0101"+
		"\u0103\5\62\32\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0107\3"+
		"\2\2\2\u0104\u0106\5*\26\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010b\7\16\2\2\u010b\u010c\5\30\r\2\u010c\u010d\7\17\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010f\3\2\2\2\u010f%\3\2\2\2"+
		"\u0110\u0115\5(\25\2\u0111\u0112\7\21\2\2\u0112\u0114\5(\25\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\'\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7f\2\2\u0119\u011a\7\b\2\2"+
		"\u011a\u011b\5\62\32\2\u011b)\3\2\2\2\u011c\u011d\7 \2\2\u011d\u0121\5"+
		"<\37\2\u011e\u011f\7!\2\2\u011f\u0121\5<\37\2\u0120\u011c\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121+\3\2\2\2\u0122\u0125\7\"\2\2\u0123\u0124\7f\2\2\u0124"+
		"\u0126\7\b\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\5<\37\2\u0128-\3\2\2\2\u0129\u012a\7\20\2\2\u012a\u012d"+
		"\5\60\31\2\u012b\u012c\7\21\2\2\u012c\u012e\5\60\31\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\22\2\2\u0130"+
		"/\3\2\2\2\u0131\u0134\5<\37\2\u0132\u0134\7\6\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\61\3\2\2\2\u0135\u0136\b\32\1\2\u0136\u0148"+
		"\5\64\33\2\u0137\u0139\5\66\34\2\u0138\u013a\5:\36\2\u0139\u0138\3\2\2"+
		"\2\u0139\u013a\3\2\2\2\u013a\u0148\3\2\2\2\u013b\u013c\7\n\2\2\u013c\u013d"+
		"\5\62\32\2\u013d\u013e\7\13\2\2\u013e\u0148\3\2\2\2\u013f\u0140\7$\2\2"+
		"\u0140\u0141\7f\2\2\u0141\u0142\7\b\2\2\u0142\u0143\5\62\32\2\u0143\u0144"+
		"\7^\2\2\u0144\u0145\5<\37\2\u0145\u0146\7%\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0135\3\2\2\2\u0147\u0137\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013f\3\2"+
		"\2\2\u0148\u0155\3\2\2\2\u0149\u014a\f\5\2\2\u014a\u014b\7#\2\2\u014b"+
		"\u0154\5\62\32\6\u014c\u014f\f\6\2\2\u014d\u014e\7\6\2\2\u014e\u0150\5"+
		"\62\32\2\u014f\u014d\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014c\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\63\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\t\5\2\2\u0159\65\3\2\2\2\u015a"+
		"\u015e\5T+\2\u015b\u015e\7,\2\2\u015c\u015e\58\35\2\u015d\u015a\3\2\2"+
		"\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\67\3\2\2\2\u015f\u0160"+
		"\t\6\2\2\u01609\3\2\2\2\u0161\u0162\7\20\2\2\u0162\u0167\5\62\32\2\u0163"+
		"\u0164\7\21\2\2\u0164\u0166\5\62\32\2\u0165\u0163\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016b\7\22\2\2\u016b;\3\2\2\2\u016c\u016d\b\37\1"+
		"\2\u016d\u016e\7\n\2\2\u016e\u016f\5<\37\2\u016f\u0170\7\13\2\2\u0170"+
		"\u01cf\3\2\2\2\u0171\u0172\7\60\2\2\u0172\u0173\7\n\2\2\u0173\u0176\5"+
		"<\37\2\u0174\u0175\7\21\2\2\u0175\u0177\5<\37\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\7\13\2\2\u017b\u01cf\3\2\2\2\u017c\u01cf\5V,\2\u017d"+
		"\u01cf\7f\2\2\u017e\u017f\7\61\2\2\u017f\u01cf\5<\37\35\u0180\u0181\7"+
		"\16\2\2\u0181\u0182\5\30\r\2\u0182\u0183\7\17\2\2\u0183\u01cf\3\2\2\2"+
		"\u0184\u0185\7\62\2\2\u0185\u0186\5<\37\2\u0186\u0187\7\63\2\2\u0187\u018a"+
		"\5<\37\2\u0188\u0189\7\64\2\2\u0189\u018b\5<\37\2\u018a\u0188\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u01cf\3\2\2\2\u018c\u018d\7\65\2\2\u018d\u018e"+
		"\5<\37\2\u018e\u018f\7\66\2\2\u018f\u0190\5<\37\32\u0190\u01cf\3\2\2\2"+
		"\u0191\u0192\7\67\2\2\u0192\u0193\5N(\2\u0193\u0194\78\2\2\u0194\u0195"+
		"\5<\37\2\u0195\u0196\7\66\2\2\u0196\u0197\5<\37\31\u0197\u01cf\3\2\2\2"+
		"\u0198\u0199\58\35\2\u0199\u019b\7\16\2\2\u019a\u019c\5R*\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\17\2\2"+
		"\u019e\u01cf\3\2\2\2\u019f\u01a0\58\35\2\u01a0\u01a1\7\16\2\2\u01a1\u01a2"+
		"\5<\37\2\u01a2\u01a3\79\2\2\u01a3\u01a4\5<\37\2\u01a4\u01a5\7\17\2\2\u01a5"+
		"\u01cf\3\2\2\2\u01a6\u01a7\58\35\2\u01a7\u01a8\7\16\2\2\u01a8\u01a9\5"+
		"<\37\2\u01a9\u01aa\7:\2\2\u01aa\u01ab\5H%\2\u01ab\u01ac\7^\2\2\u01ac\u01ad"+
		"\5<\37\2\u01ad\u01ae\7\17\2\2\u01ae\u01cf\3\2\2\2\u01af\u01b0\7S\2\2\u01b0"+
		"\u01b1\7\n\2\2\u01b1\u01b2\5<\37\2\u01b2\u01b3\7\13\2\2\u01b3\u01cf\3"+
		"\2\2\2\u01b4\u01b5\7B\2\2\u01b5\u01cf\5<\37\13\u01b6\u01b7\5T+\2\u01b7"+
		"\u01b8\7T\2\2\u01b8\u01cf\3\2\2\2\u01b9\u01ba\7U\2\2\u01ba\u01bb\5H%\2"+
		"\u01bb\u01bc\7^\2\2\u01bc\u01bd\5<\37\t\u01bd\u01cf\3\2\2\2\u01be\u01bf"+
		"\7V\2\2\u01bf\u01c0\5H%\2\u01c0\u01c1\7^\2\2\u01c1\u01c2\5<\37\b\u01c2"+
		"\u01cf\3\2\2\2\u01c3\u01c4\5N(\2\u01c4\u01c5\7#\2\2\u01c5\u01c6\5<\37"+
		"\7\u01c6\u01cf\3\2\2\2\u01c7\u01cf\7W\2\2\u01c8\u01cf\7X\2\2\u01c9\u01cb"+
		"\7Y\2\2\u01ca\u01cc\5<\37\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cf\3\2\2\2\u01cd\u01cf\7Z\2\2\u01ce\u016c\3\2\2\2\u01ce\u0171\3\2"+
		"\2\2\u01ce\u017c\3\2\2\2\u01ce\u017d\3\2\2\2\u01ce\u017e\3\2\2\2\u01ce"+
		"\u0180\3\2\2\2\u01ce\u0184\3\2\2\2\u01ce\u018c\3\2\2\2\u01ce\u0191\3\2"+
		"\2\2\u01ce\u0198\3\2\2\2\u01ce\u019f\3\2\2\2\u01ce\u01a6\3\2\2\2\u01ce"+
		"\u01af\3\2\2\2\u01ce\u01b4\3\2\2\2\u01ce\u01b6\3\2\2\2\u01ce\u01b9\3\2"+
		"\2\2\u01ce\u01be\3\2\2\2\u01ce\u01c3\3\2\2\2\u01ce\u01c7\3\2\2\2\u01ce"+
		"\u01c8\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01f6\3\2"+
		"\2\2\u01d0\u01d1\f\25\2\2\u01d1\u01d2\t\7\2\2\u01d2\u01f5\5<\37\26\u01d3"+
		"\u01d4\f\24\2\2\u01d4\u01d5\t\b\2\2\u01d5\u01f5\5<\37\25\u01d6\u01d7\f"+
		"\23\2\2\u01d7\u01d8\t\t\2\2\u01d8\u01f5\5<\37\24\u01d9\u01da\f\22\2\2"+
		"\u01da\u01db\7M\2\2\u01db\u01f5\5<\37\23\u01dc\u01dd\f\21\2\2\u01dd\u01de"+
		"\7N\2\2\u01de\u01f5\5<\37\22\u01df\u01e0\f\20\2\2\u01e0\u01e1\t\n\2\2"+
		"\u01e1\u01f5\5<\37\21\u01e2\u01e3\f\17\2\2\u01e3\u01e4\7\27\2\2\u01e4"+
		"\u01f5\5<\37\20\u01e5\u01e6\f\37\2\2\u01e6\u01e7\7\5\2\2\u01e7\u01f5\7"+
		"f\2\2\u01e8\u01e9\f\36\2\2\u01e9\u01eb\7\n\2\2\u01ea\u01ec\5> \2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f5\7\13"+
		"\2\2\u01ee\u01ef\f\16\2\2\u01ef\u01f0\7Q\2\2\u01f0\u01f5\5\62\32\2\u01f1"+
		"\u01f2\f\r\2\2\u01f2\u01f3\7R\2\2\u01f3\u01f5\5\62\32\2\u01f4\u01d0\3"+
		"\2\2\2\u01f4\u01d3\3\2\2\2\u01f4\u01d6\3\2\2\2\u01f4\u01d9\3\2\2\2\u01f4"+
		"\u01dc\3\2\2\2\u01f4\u01df\3\2\2\2\u01f4\u01e2\3\2\2\2\u01f4\u01e5\3\2"+
		"\2\2\u01f4\u01e8\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7=\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f9\u01fc\5@!\2\u01fa\u01fc\5B\"\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc?\3\2\2\2\u01fd\u0202\5<\37\2\u01fe"+
		"\u01ff\7\21\2\2\u01ff\u0201\5<\37\2\u0200\u01fe\3\2\2\2\u0201\u0204\3"+
		"\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203A\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0205\u020a\5D#\2\u0206\u0207\7\21\2\2\u0207\u0209\5D#\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020bC\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7f\2\2\u020e\u020f"+
		"\7[\2\2\u020f\u0210\5<\37\2\u0210E\3\2\2\2\u0211\u0214\5<\37\2\u0212\u0214"+
		"\5\62\32\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214G\3\2\2\2\u0215"+
		"\u021a\5J&\2\u0216\u0217\7\21\2\2\u0217\u0219\5J&\2\u0218\u0216\3\2\2"+
		"\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021bI"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\5L\'\2\u021e\u021f\7\b\2\2\u021f"+
		"\u0220\5F$\2\u0220K\3\2\2\2\u0221\u0226\5N(\2\u0222\u0223\7\21\2\2\u0223"+
		"\u0225\5N(\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227M\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a"+
		"\b(\1\2\u022a\u0238\5V,\2\u022b\u0238\7\\\2\2\u022c\u0238\7f\2\2\u022d"+
		"\u022e\7\n\2\2\u022e\u0231\5N(\2\u022f\u0230\7\21\2\2\u0230\u0232\5N("+
		"\2\u0231\u022f\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\13\2\2\u0236\u0238\3\2\2\2"+
		"\u0237\u0229\3\2\2\2\u0237\u022b\3\2\2\2\u0237\u022c\3\2\2\2\u0237\u022d"+
		"\3\2\2\2\u0238\u023e\3\2\2\2\u0239\u023a\f\3\2\2\u023a\u023b\7\b\2\2\u023b"+
		"\u023d\5\62\32\2\u023c\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3"+
		"\2\2\2\u023e\u023f\3\2\2\2\u023fO\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0246"+
		"\7f\2\2\u0242\u0243\7\21\2\2\u0243\u0245\7f\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247Q\3\2\2\2"+
		"\u0248\u0246\3\2\2\2\u0249\u024e\5<\37\2\u024a\u024b\7\21\2\2\u024b\u024d"+
		"\5<\37\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024fS\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0256\7f\2\2\u0252"+
		"\u0253\7\5\2\2\u0253\u0255\7f\2\2\u0254\u0252\3\2\2\2\u0255\u0258\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257U\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025a\t\13\2\2\u025aW\3\2\2\2?Y^djv\u0086\u008d\u0091\u0095"+
		"\u0099\u009c\u00a2\u00aa\u00b2\u00b9\u00c2\u00c8\u00ce\u00d8\u00dd\u00e1"+
		"\u00e6\u00ed\u00f1\u00f8\u00fe\u0102\u0107\u010e\u0115\u0120\u0125\u012d"+
		"\u0133\u0139\u0147\u0151\u0153\u0155\u015d\u0167\u0178\u018a\u019b\u01cb"+
		"\u01ce\u01eb\u01f4\u01f6\u01fb\u0202\u020a\u0213\u021a\u0226\u0233\u0237"+
		"\u023e\u0246\u024e\u0256";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}