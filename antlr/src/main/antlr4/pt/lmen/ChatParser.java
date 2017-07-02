// Generated from Chat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IdentifierWithDot=2, RegularExpressionLiteral=3, LineTerminator=4, 
		OpenBracket=5, CloseBracket=6, OpenParen=7, CloseParen=8, OpenBrace=9, 
		CloseBrace=10, SemiColon=11, Comma=12, Assign=13, QuestionMark=14, Colon=15, 
		Dot=16, PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, BitNot=21, Not=22, 
		Multiply=23, Divide=24, Modulus=25, RightShiftArithmetic=26, LeftShiftArithmetic=27, 
		RightShiftLogical=28, LessThan=29, MoreThan=30, LessThanEquals=31, GreaterThanEquals=32, 
		Equals=33, NotEquals=34, IdentityEquals=35, IdentityNotEquals=36, BitAnd=37, 
		BitXOr=38, BitOr=39, And=40, Or=41, MultiplyAssign=42, DivideAssign=43, 
		ModulusAssign=44, PlusAssign=45, MinusAssign=46, LeftShiftArithmeticAssign=47, 
		RightShiftArithmeticAssign=48, RightShiftLogicalAssign=49, BitAndAssign=50, 
		BitXorAssign=51, BitOrAssign=52, NullLiteral=53, BooleanLiteral=54, DecimalLiteral=55, 
		HexIntegerLiteral=56, OctalIntegerLiteral=57, Break=58, Do=59, Instanceof=60, 
		Typeof=61, Case=62, Else=63, New=64, Var=65, Catch=66, Finally=67, Return=68, 
		Void=69, Continue=70, For=71, Switch=72, While=73, Debugger=74, Function=75, 
		This=76, With=77, Default=78, If=79, Throw=80, Delete=81, In=82, Try=83, 
		Class=84, Enum=85, Extends=86, Super=87, Const=88, Export=89, Import=90, 
		Identifier=91, StringLiteral=92, WhiteSpaces=93, UnexpectedCharacter=94, 
		Implements=95, Let=96, Private=97, Public=98, Interface=99, Package=100, 
		Protected=101, Static=102, Yield=103;
	public static final int
		RULE_expressionStatement = 0, RULE_arrayLiteral = 1, RULE_elementList = 2, 
		RULE_elision = 3, RULE_objectLiteral = 4, RULE_propertyNameAndValueList = 5, 
		RULE_propertyAssignment = 6, RULE_propertyName = 7, RULE_propertySetParameterList = 8, 
		RULE_arguments = 9, RULE_argumentList = 10, RULE_expressionSequence = 11, 
		RULE_singleExpression = 12, RULE_literal = 13, RULE_numericLiteral = 14, 
		RULE_aa = 15, RULE_tyu = 16, RULE_identifierName = 17, RULE_reservedWord = 18, 
		RULE_keyword = 19, RULE_futureReservedWord = 20, RULE_eos = 21, RULE_eof = 22;
	public static final String[] ruleNames = {
		"expressionStatement", "arrayLiteral", "elementList", "elision", "objectLiteral", 
		"propertyNameAndValueList", "propertyAssignment", "propertyName", "propertySetParameterList", 
		"arguments", "argumentList", "expressionSequence", "singleExpression", 
		"literal", "numericLiteral", "aa", "tyu", "identifierName", "reservedWord", 
		"keyword", "futureReservedWord", "eos", "eof"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", 
		"';'", "','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
		"'>>>='", "'&='", "'^='", "'|='", "'null'", null, null, null, null, "'break'", 
		"'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", 
		"'catch'", "'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
		"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
		"'if'", "'throw'", "'delete'", "'in'", "'try'", "'class'", "'enum'", "'extends'", 
		"'super'", "'const'", "'export'", "'import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IdentifierWithDot", "RegularExpressionLiteral", "LineTerminator", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
		"Divide", "Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
		"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
		"For", "Switch", "While", "Debugger", "Function", "This", "With", "Default", 
		"If", "Throw", "Delete", "In", "Try", "Class", "Enum", "Extends", "Super", 
		"Const", "Export", "Import", "Identifier", "StringLiteral", "WhiteSpaces", 
		"UnexpectedCharacter", "Implements", "Let", "Private", "Public", "Interface", 
		"Package", "Protected", "Static", "Yield"
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
	public String getGrammarFileName() { return "Chat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionStatementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			singleExpression(0);
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(OpenBracket);
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(49);
				elementList();
				}
				break;
			}
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(52);
				match(Comma);
				}
				break;
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(55);
				elision();
				}
			}

			setState(58);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(60);
				elision();
				}
			}

			setState(63);
			singleExpression(0);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(Comma);
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(65);
						elision();
						}
					}

					setState(68);
					singleExpression(0);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ElisionContext extends ParserRuleContext {
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitElision(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				match(Comma);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objectLiteral);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(OpenBrace);
				setState(80);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(OpenBrace);
				setState(82);
				propertyNameAndValueList();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(83);
					match(Comma);
					}
				}

				setState(86);
				match(CloseBrace);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitPropertyNameAndValueList(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			propertyAssignment();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(Comma);
					setState(92);
					propertyAssignment();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitPropertyExpressionAssignment(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propertyAssignment);
		try {
			_localctx = new PropertyExpressionAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			propertyName();
			setState(99);
			match(Colon);
			setState(100);
			singleExpression(0);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ChatParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyName);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IdentifierWithDot:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				numericLiteral();
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

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ChatParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitPropertySetParameterList(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Identifier);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(OpenParen);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IdentifierWithDot) | (1L << RegularExpressionLiteral) | (1L << OpenParen) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || _la==StringLiteral) {
				{
				setState(110);
				argumentList();
				}
			}

			setState(113);
			match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			singleExpression(0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(116);
				match(Comma);
				setState(117);
				singleExpression(0);
				}
				}
				setState(122);
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			singleExpression(0);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(124);
				match(Comma);
				setState(125);
				singleExpression(0);
				}
				}
				setState(130);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitRelationalExpression(this);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLiteralExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitNotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitBitOrExpression(this);
		}
	}
	public static class IdentifierNameExpressionContext extends SingleExpressionContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public IdentifierNameExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterIdentifierNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitIdentifierNameExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(ChatParser.Equals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitBitShiftExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(Not);
				setState(133);
				singleExpression(15);
				}
				break;
			case IdentifierWithDot:
				{
				_localctx = new IdentifierNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				identifierName();
				}
				break;
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				literal();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(OpenParen);
				setState(137);
				singleExpression(0);
				setState(138);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(142);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(143);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						singleExpression(15);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(145);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(146);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						singleExpression(14);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(148);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(149);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						singleExpression(13);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(151);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						singleExpression(12);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(154);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(155);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						singleExpression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(157);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(158);
						match(BitAnd);
						setState(159);
						singleExpression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(160);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(161);
						match(BitXOr);
						setState(162);
						singleExpression(9);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(164);
						match(BitOr);
						setState(165);
						singleExpression(8);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(166);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						match(And);
						setState(168);
						singleExpression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(Or);
						setState(171);
						singleExpression(6);
						}
						break;
					case 11:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						match(QuestionMark);
						setState(174);
						singleExpression(0);
						setState(175);
						match(Colon);
						setState(176);
						singleExpression(5);
						}
						break;
					case 12:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(178);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(179);
						match(OpenBracket);
						setState(180);
						expressionSequence();
						setState(181);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ChatParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ChatParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ChatParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(ChatParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ChatParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ChatParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ChatParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0)) ) {
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

	public static class AaContext extends ParserRuleContext {
		public TyuContext tyu() {
			return getRuleContext(TyuContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aa);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				tyu();
				}
				break;
			case EOF:
			case IdentifierWithDot:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IdentifierWithDot) {
					{
					setState(195);
					identifierName();
					}
				}

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

	public static class TyuContext extends ParserRuleContext {
		public TyuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterTyu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitTyu(this);
		}
	}

	public final TyuContext tyu() throws RecognitionException {
		TyuContext _localctx = new TyuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tyu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__0);
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode IdentifierWithDot() { return getToken(ChatParser.IdentifierWithDot, 0); }
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifierName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IdentifierWithDot);
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ChatParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ChatParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reservedWord);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				keyword();
				}
				break;
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ChatParser.Break, 0); }
		public TerminalNode Do() { return getToken(ChatParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ChatParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ChatParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ChatParser.Case, 0); }
		public TerminalNode Else() { return getToken(ChatParser.Else, 0); }
		public TerminalNode New() { return getToken(ChatParser.New, 0); }
		public TerminalNode Var() { return getToken(ChatParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ChatParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ChatParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ChatParser.Return, 0); }
		public TerminalNode Void() { return getToken(ChatParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ChatParser.Continue, 0); }
		public TerminalNode For() { return getToken(ChatParser.For, 0); }
		public TerminalNode Switch() { return getToken(ChatParser.Switch, 0); }
		public TerminalNode While() { return getToken(ChatParser.While, 0); }
		public TerminalNode Debugger() { return getToken(ChatParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(ChatParser.Function, 0); }
		public TerminalNode This() { return getToken(ChatParser.This, 0); }
		public TerminalNode With() { return getToken(ChatParser.With, 0); }
		public TerminalNode Default() { return getToken(ChatParser.Default, 0); }
		public TerminalNode If() { return getToken(ChatParser.If, 0); }
		public TerminalNode Throw() { return getToken(ChatParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ChatParser.Delete, 0); }
		public TerminalNode In() { return getToken(ChatParser.In, 0); }
		public TerminalNode Try() { return getToken(ChatParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (Break - 58)) | (1L << (Do - 58)) | (1L << (Instanceof - 58)) | (1L << (Typeof - 58)) | (1L << (Case - 58)) | (1L << (Else - 58)) | (1L << (New - 58)) | (1L << (Var - 58)) | (1L << (Catch - 58)) | (1L << (Finally - 58)) | (1L << (Return - 58)) | (1L << (Void - 58)) | (1L << (Continue - 58)) | (1L << (For - 58)) | (1L << (Switch - 58)) | (1L << (While - 58)) | (1L << (Debugger - 58)) | (1L << (Function - 58)) | (1L << (This - 58)) | (1L << (With - 58)) | (1L << (Default - 58)) | (1L << (If - 58)) | (1L << (Throw - 58)) | (1L << (Delete - 58)) | (1L << (In - 58)) | (1L << (Try - 58)))) != 0)) ) {
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

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ChatParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ChatParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ChatParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ChatParser.Super, 0); }
		public TerminalNode Const() { return getToken(ChatParser.Const, 0); }
		public TerminalNode Export() { return getToken(ChatParser.Export, 0); }
		public TerminalNode Import() { return getToken(ChatParser.Import, 0); }
		public TerminalNode Implements() { return getToken(ChatParser.Implements, 0); }
		public TerminalNode Let() { return getToken(ChatParser.Let, 0); }
		public TerminalNode Private() { return getToken(ChatParser.Private, 0); }
		public TerminalNode Public() { return getToken(ChatParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ChatParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ChatParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ChatParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ChatParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ChatParser.Yield, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterFutureReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitFutureReservedWord(this);
		}
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_futureReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (Class - 84)) | (1L << (Enum - 84)) | (1L << (Extends - 84)) | (1L << (Super - 84)) | (1L << (Const - 84)) | (1L << (Export - 84)) | (1L << (Import - 84)) | (1L << (Implements - 84)) | (1L << (Let - 84)) | (1L << (Private - 84)) | (1L << (Public - 84)) | (1L << (Interface - 84)) | (1L << (Package - 84)) | (1L << (Protected - 84)) | (1L << (Static - 84)) | (1L << (Yield - 84)))) != 0)) ) {
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ChatParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ChatParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ChatParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\5\3\65\n\3\3\3\5\38\n\3\3\3\5\3;\n\3\3\3\3\3\3\4\5\4@\n\4\3\4\3"+
		"\4\3\4\5\4E\n\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\6\5N\n\5\r\5\16\5O\3\6"+
		"\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\7\7`\n\7\f\7\16"+
		"\7c\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\13\3\13\5\13r"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\r\3\r\3\r\7\r\u0081"+
		"\n\r\f\r\16\r\u0084\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u008f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16\3\17\3\17\5\17\u00c1"+
		"\n\17\3\20\3\20\3\21\3\21\5\21\u00c7\n\21\5\21\u00c9\n\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\5\24\u00d2\n\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\2\3\32\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\2\r\3\2\31\33\3\2\25\26\3\2\34\36\3\2\37\"\3\2#&\5\2\5\5\678^^\3"+
		"\29;\3\2\678\3\2<U\4\2V\\ai\3\3\r\r\2\u00e7\2\60\3\2\2\2\4\62\3\2\2\2"+
		"\6?\3\2\2\2\bM\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16d\3\2\2\2\20k\3\2\2\2"+
		"\22m\3\2\2\2\24o\3\2\2\2\26u\3\2\2\2\30}\3\2\2\2\32\u008e\3\2\2\2\34\u00c0"+
		"\3\2\2\2\36\u00c2\3\2\2\2 \u00c8\3\2\2\2\"\u00ca\3\2\2\2$\u00cc\3\2\2"+
		"\2&\u00d1\3\2\2\2(\u00d3\3\2\2\2*\u00d5\3\2\2\2,\u00d7\3\2\2\2.\u00d9"+
		"\3\2\2\2\60\61\5\32\16\2\61\3\3\2\2\2\62\64\7\7\2\2\63\65\5\6\4\2\64\63"+
		"\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\7\16\2\2\67\66\3\2\2\2\678\3"+
		"\2\2\28:\3\2\2\29;\5\b\5\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\b\2\2=\5"+
		"\3\2\2\2>@\5\b\5\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AI\5\32\16\2BD\7\16\2"+
		"\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\5\32\16\2GB\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LN\7\16\2\2ML\3\2\2\2NO\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QR\7\13\2\2R[\7\f\2\2ST\7\13\2\2"+
		"TV\5\f\7\2UW\7\16\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\f\2\2Y[\3\2\2"+
		"\2ZQ\3\2\2\2ZS\3\2\2\2[\13\3\2\2\2\\a\5\16\b\2]^\7\16\2\2^`\5\16\b\2_"+
		"]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2de\5\20\t"+
		"\2ef\7\21\2\2fg\5\32\16\2g\17\3\2\2\2hl\5$\23\2il\7^\2\2jl\5\36\20\2k"+
		"h\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\21\3\2\2\2mn\7]\2\2n\23\3\2\2\2oq\7\t\2"+
		"\2pr\5\26\f\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\n\2\2t\25\3\2\2\2uz\5"+
		"\32\16\2vw\7\16\2\2wy\5\32\16\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\27\3\2\2\2|z\3\2\2\2}\u0082\5\32\16\2~\177\7\16\2\2\177\u0081\5\32"+
		"\16\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\31\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\16\1\2\u0086"+
		"\u0087\7\30\2\2\u0087\u008f\5\32\16\21\u0088\u008f\5$\23\2\u0089\u008f"+
		"\5\34\17\2\u008a\u008b\7\t\2\2\u008b\u008c\5\32\16\2\u008c\u008d\7\n\2"+
		"\2\u008d\u008f\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008f\u00bb\3\2\2\2\u0090\u0091\f\20\2\2"+
		"\u0091\u0092\t\2\2\2\u0092\u00ba\5\32\16\21\u0093\u0094\f\17\2\2\u0094"+
		"\u0095\t\3\2\2\u0095\u00ba\5\32\16\20\u0096\u0097\f\16\2\2\u0097\u0098"+
		"\t\4\2\2\u0098\u00ba\5\32\16\17\u0099\u009a\f\r\2\2\u009a\u009b\t\5\2"+
		"\2\u009b\u00ba\5\32\16\16\u009c\u009d\f\f\2\2\u009d\u009e\t\6\2\2\u009e"+
		"\u00ba\5\32\16\r\u009f\u00a0\f\13\2\2\u00a0\u00a1\7\'\2\2\u00a1\u00ba"+
		"\5\32\16\f\u00a2\u00a3\f\n\2\2\u00a3\u00a4\7(\2\2\u00a4\u00ba\5\32\16"+
		"\13\u00a5\u00a6\f\t\2\2\u00a6\u00a7\7)\2\2\u00a7\u00ba\5\32\16\n\u00a8"+
		"\u00a9\f\b\2\2\u00a9\u00aa\7*\2\2\u00aa\u00ba\5\32\16\t\u00ab\u00ac\f"+
		"\7\2\2\u00ac\u00ad\7+\2\2\u00ad\u00ba\5\32\16\b\u00ae\u00af\f\6\2\2\u00af"+
		"\u00b0\7\20\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3"+
		"\5\32\16\7\u00b3\u00ba\3\2\2\2\u00b4\u00b5\f\22\2\2\u00b5\u00b6\7\7\2"+
		"\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\b\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u0090\3\2\2\2\u00b9\u0093\3\2\2\2\u00b9\u0096\3\2\2\2\u00b9\u0099\3\2"+
		"\2\2\u00b9\u009c\3\2\2\2\u00b9\u009f\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9"+
		"\u00a5\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00ae\3\2"+
		"\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\t\7\2"+
		"\2\u00bf\u00c1\5\36\20\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\35\3\2\2\2\u00c2\u00c3\t\b\2\2\u00c3\37\3\2\2\2\u00c4\u00c9\5\"\22\2"+
		"\u00c5\u00c7\5$\23\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9!\3\2\2\2\u00ca"+
		"\u00cb\7\3\2\2\u00cb#\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd%\3\2\2\2\u00ce"+
		"\u00d2\5(\25\2\u00cf\u00d2\5*\26\2\u00d0\u00d2\t\t\2\2\u00d1\u00ce\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\'\3\2\2\2\u00d3\u00d4"+
		"\t\n\2\2\u00d4)\3\2\2\2\u00d5\u00d6\t\13\2\2\u00d6+\3\2\2\2\u00d7\u00d8"+
		"\t\f\2\2\u00d8-\3\2\2\2\u00d9\u00da\7\2\2\3\u00da/\3\2\2\2\27\64\67:?"+
		"DIOVZakqz\u0082\u008e\u00b9\u00bb\u00c0\u00c6\u00c8\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}