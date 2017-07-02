// Generated from Chat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatLexer extends Lexer {
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
		Identifier=91, StringLiteral=92, WhiteSpaces=93, UnexpectedCharacter=94;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "IdentifierWithDot", "RegularExpressionLiteral", "LineTerminator", 
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
		"UnexpectedCharacter", "DoubleStringCharacter", "SingleStringCharacter", 
		"EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", 
		"SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "LineContinuation", 
		"LineTerminatorSequence", "DecimalDigit", "HexDigit", "OctalDigit", "DecimalIntegerLiteral", 
		"ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", 
		"UnicodeCombiningMark", "UnicodeDigit", "UnicodeConnectorPunctuation", 
		"ZWNJ", "ZWJ", "RegularExpressionBody", "RegularExpressionFlags", "RegularExpressionFirstChar", 
		"RegularExpressionChar", "RegularExpressionNonTerminator", "RegularExpressionBackslashSequence", 
		"RegularExpressionClass", "RegularExpressionClassChar"
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
		"UnexpectedCharacter"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u0347\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3\u0108\n\3\f\3\16\3\u010b\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01a3"+
		"\n\67\38\38\38\78\u01a8\n8\f8\168\u01ab\138\38\58\u01ae\n8\38\38\68\u01b2"+
		"\n8\r8\168\u01b3\38\58\u01b7\n8\38\38\58\u01bb\n8\58\u01bd\n8\39\39\3"+
		"9\69\u01c2\n9\r9\169\u01c3\3:\3:\6:\u01c8\n:\r:\16:\u01c9\3;\3;\3;\3;"+
		"\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>"+
		"\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C"+
		"\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M"+
		"\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V"+
		"\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\7\\\u0297\n\\\f\\\16\\"+
		"\u029a\13\\\3]\3]\7]\u029e\n]\f]\16]\u02a1\13]\3]\3]\3]\7]\u02a6\n]\f"+
		"]\16]\u02a9\13]\3]\5]\u02ac\n]\3^\6^\u02af\n^\r^\16^\u02b0\3^\3^\3_\3"+
		"_\3`\3`\3`\3`\5`\u02bb\n`\3a\3a\3a\3a\5a\u02c1\na\3b\3b\3b\3b\5b\u02c7"+
		"\nb\3c\3c\5c\u02cb\nc\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3g\3g\3h\3h"+
		"\3h\5h\u02de\nh\3i\3i\3i\3j\3j\3j\5j\u02e6\nj\3k\3k\3l\3l\3m\3m\3n\3n"+
		"\3n\7n\u02f1\nn\fn\16n\u02f4\13n\5n\u02f6\nn\3o\3o\5o\u02fa\no\3o\6o\u02fd"+
		"\no\ro\16o\u02fe\3p\3p\3p\3p\5p\u0305\np\3q\3q\3q\3q\3q\3q\5q\u030d\n"+
		"q\3r\5r\u0310\nr\3s\5s\u0313\ns\3t\5t\u0316\nt\3u\5u\u0319\nu\3v\3v\3"+
		"w\3w\3x\3x\7x\u0321\nx\fx\16x\u0324\13x\3y\7y\u0327\ny\fy\16y\u032a\13"+
		"y\3z\3z\3z\5z\u032f\nz\3{\3{\3{\5{\u0334\n{\3|\3|\3}\3}\3}\3~\3~\7~\u033d"+
		"\n~\f~\16~\u0340\13~\3~\3~\3\177\3\177\5\177\u0346\n\177\2\2\u0080\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2"+
		"\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9\2\u00db"+
		"\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\u00ed"+
		"\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7\2\u00f9\2\u00fb\2\u00fd\2\3\2"+
		"\30\5\2\f\f\17\17\u202a\u202b\4\2ZZzz\6\2\13\13\r\16\"\"\u00a2\u00a2\6"+
		"\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$$))^^ddhhppttvvxx\16\2\f\f\17"+
		"\17$$))\62;^^ddhhppttvxzz\4\2wwzz\3\2\62;\5\2\62;CHch\3\2\629\3\2\63;"+
		"\4\2GGgg\4\2--//\4\2&&aa\u0104\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc"+
		"\u00c2\u00d8\u00da\u00f8\u00fa\u0221\u0224\u0235\u0252\u02af\u02b2\u02ba"+
		"\u02bd\u02c3\u02d2\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388"+
		"\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03d9\u03dc\u03f5"+
		"\u0402\u0483\u048e\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2\u04f7\u04fa\u04fb"+
		"\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c"+
		"\u0642\u064c\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06fc\u06fe\u0712\u0712"+
		"\u0714\u072e\u0782\u07a7\u0907\u093b\u093f\u093f\u0952\u0952\u095a\u0963"+
		"\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb"+
		"\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a"+
		"\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60"+
		"\u0a74\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2"+
		"\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae2\u0b07\u0b0e"+
		"\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38\u0b3b\u0b3f\u0b3f"+
		"\u0b5e\u0b5f\u0b61\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c"+
		"\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb"+
		"\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63"+
		"\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0ce0\u0ce0"+
		"\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63"+
		"\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32"+
		"\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c"+
		"\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9"+
		"\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ec8\u0ec8\u0ede\u0edf"+
		"\u0f02\u0f02\u0f42\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c"+
		"\u1052\u1057\u10a2\u10c7\u10d2\u10f8\u1102\u115b\u1161\u11a4\u11aa\u11fb"+
		"\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f\u1252\u1258\u125a\u125a"+
		"\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2"+
		"\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8"+
		"\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317\u131a\u1320\u1322\u1348"+
		"\u134a\u135c\u13a2\u13f6\u1403\u1678\u1683\u169c\u16a2\u16ec\u1782\u17b5"+
		"\u1822\u1879\u1882\u18aa\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f"+
		"\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f"+
		"\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce"+
		"\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2081\u2081"+
		"\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211b\u211f\u2126\u2126"+
		"\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133\u2135\u213b\u2162\u2185"+
		"\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303c\u3043\u3096\u309f\u30a0"+
		"\u30a3\u30fc\u30fe\u3100\u3107\u312e\u3133\u3190\u31a2\u31b9\u3402\u3402"+
		"\u4db7\u4db7\u4e02\u4e02\u9fa7\u9fa7\ua002\ua48e\uac02\uac02\ud7a5\ud7a5"+
		"\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38"+
		"\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f"+
		"\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74\ufe76\ufe76\ufe78\ufefe"+
		"\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9"+
		"\uffdc\uffdef\2\u0302\u0350\u0362\u0364\u0485\u0488\u0593\u05a3\u05a5"+
		"\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c6\u064d\u0657\u0672"+
		"\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u0713\u0713\u0732"+
		"\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f\u0953\u0956\u0964"+
		"\u0965\u0983\u0985\u09be\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4"+
		"\u09e5\u0a04\u0a04\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a72"+
		"\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0b03"+
		"\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b84"+
		"\u0b85\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0c03\u0c05\u0c40"+
		"\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c84\u0c85\u0cc0\u0cc6\u0cc8"+
		"\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c"+
		"\u0d4f\u0d59\u0d59\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda"+
		"\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0eb3\u0eb3\u0eb6"+
		"\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0f1a\u0f1b\u0f37\u0f37\u0f39\u0f39\u0f3b"+
		"\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99\u0f9b\u0fbe\u0fc8"+
		"\u0fc8\u102e\u1034\u1038\u103b\u1058\u105b\u17b6\u17d5\u18ab\u18ab\u20d2"+
		"\u20de\u20e3\u20e3\u302c\u3031\u309b\u309c\ufb20\ufb20\ufe22\ufe25\26"+
		"\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8"+
		"\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52"+
		"\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u136b\u1373\u17e2\u17eb\u1812"+
		"\u181b\uff12\uff1b\t\2aa\u2041\u2042\u30fd\u30fd\ufe35\ufe36\ufe4f\ufe51"+
		"\uff41\uff41\uff67\uff67\b\2\f\f\17\17,,\61\61]^\u202a\u202b\7\2\f\f\17"+
		"\17\61\61]^\u202a\u202b\6\2\f\f\17\17^_\u202a\u202b\2\u0354\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\3\u00ff\3\2\2\2\5\u0104\3\2\2\2\7\u010c\3\2\2\2\t\u0111"+
		"\3\2\2\2\13\u0115\3\2\2\2\r\u0117\3\2\2\2\17\u0119\3\2\2\2\21\u011b\3"+
		"\2\2\2\23\u011d\3\2\2\2\25\u011f\3\2\2\2\27\u0121\3\2\2\2\31\u0123\3\2"+
		"\2\2\33\u0125\3\2\2\2\35\u0127\3\2\2\2\37\u0129\3\2\2\2!\u012b\3\2\2\2"+
		"#\u012d\3\2\2\2%\u0130\3\2\2\2\'\u0133\3\2\2\2)\u0135\3\2\2\2+\u0137\3"+
		"\2\2\2-\u0139\3\2\2\2/\u013b\3\2\2\2\61\u013d\3\2\2\2\63\u013f\3\2\2\2"+
		"\65\u0141\3\2\2\2\67\u0144\3\2\2\29\u0147\3\2\2\2;\u014b\3\2\2\2=\u014d"+
		"\3\2\2\2?\u014f\3\2\2\2A\u0152\3\2\2\2C\u0155\3\2\2\2E\u0158\3\2\2\2G"+
		"\u015b\3\2\2\2I\u015f\3\2\2\2K\u0163\3\2\2\2M\u0165\3\2\2\2O\u0167\3\2"+
		"\2\2Q\u0169\3\2\2\2S\u016c\3\2\2\2U\u016f\3\2\2\2W\u0172\3\2\2\2Y\u0175"+
		"\3\2\2\2[\u0178\3\2\2\2]\u017b\3\2\2\2_\u017e\3\2\2\2a\u0182\3\2\2\2c"+
		"\u0186\3\2\2\2e\u018b\3\2\2\2g\u018e\3\2\2\2i\u0191\3\2\2\2k\u0194\3\2"+
		"\2\2m\u01a2\3\2\2\2o\u01bc\3\2\2\2q\u01be\3\2\2\2s\u01c5\3\2\2\2u\u01cb"+
		"\3\2\2\2w\u01d1\3\2\2\2y\u01d4\3\2\2\2{\u01df\3\2\2\2}\u01e6\3\2\2\2\177"+
		"\u01eb\3\2\2\2\u0081\u01f0\3\2\2\2\u0083\u01f4\3\2\2\2\u0085\u01f8\3\2"+
		"\2\2\u0087\u01fe\3\2\2\2\u0089\u0206\3\2\2\2\u008b\u020d\3\2\2\2\u008d"+
		"\u0212\3\2\2\2\u008f\u021b\3\2\2\2\u0091\u021f\3\2\2\2\u0093\u0226\3\2"+
		"\2\2\u0095\u022c\3\2\2\2\u0097\u0235\3\2\2\2\u0099\u023e\3\2\2\2\u009b"+
		"\u0243\3\2\2\2\u009d\u0248\3\2\2\2\u009f\u0250\3\2\2\2\u00a1\u0253\3\2"+
		"\2\2\u00a3\u0259\3\2\2\2\u00a5\u0260\3\2\2\2\u00a7\u0263\3\2\2\2\u00a9"+
		"\u0267\3\2\2\2\u00ab\u026d\3\2\2\2\u00ad\u0272\3\2\2\2\u00af\u027a\3\2"+
		"\2\2\u00b1\u0280\3\2\2\2\u00b3\u0286\3\2\2\2\u00b5\u028d\3\2\2\2\u00b7"+
		"\u0294\3\2\2\2\u00b9\u02ab\3\2\2\2\u00bb\u02ae\3\2\2\2\u00bd\u02b4\3\2"+
		"\2\2\u00bf\u02ba\3\2\2\2\u00c1\u02c0\3\2\2\2\u00c3\u02c6\3\2\2\2\u00c5"+
		"\u02ca\3\2\2\2\u00c7\u02cc\3\2\2\2\u00c9\u02d0\3\2\2\2\u00cb\u02d6\3\2"+
		"\2\2\u00cd\u02d8\3\2\2\2\u00cf\u02dd\3\2\2\2\u00d1\u02df\3\2\2\2\u00d3"+
		"\u02e5\3\2\2\2\u00d5\u02e7\3\2\2\2\u00d7\u02e9\3\2\2\2\u00d9\u02eb\3\2"+
		"\2\2\u00db\u02f5\3\2\2\2\u00dd\u02f7\3\2\2\2\u00df\u0304\3\2\2\2\u00e1"+
		"\u030c\3\2\2\2\u00e3\u030f\3\2\2\2\u00e5\u0312\3\2\2\2\u00e7\u0315\3\2"+
		"\2\2\u00e9\u0318\3\2\2\2\u00eb\u031a\3\2\2\2\u00ed\u031c\3\2\2\2\u00ef"+
		"\u031e\3\2\2\2\u00f1\u0328\3\2\2\2\u00f3\u032e\3\2\2\2\u00f5\u0333\3\2"+
		"\2\2\u00f7\u0335\3\2\2\2\u00f9\u0337\3\2\2\2\u00fb\u033a\3\2\2\2\u00fd"+
		"\u0345\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2"+
		"\2\u0102\u0103\7g\2\2\u0103\4\3\2\2\2\u0104\u0109\5\u00b7\\\2\u0105\u0106"+
		"\7\60\2\2\u0106\u0108\5\u00b7\\\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\6\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\5\u00efx\2\u010e\u010f\7\61"+
		"\2\2\u010f\u0110\5\u00f1y\2\u0110\b\3\2\2\2\u0111\u0112\t\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b\5\2\2\u0114\n\3\2\2\2\u0115\u0116\7]\2\2"+
		"\u0116\f\3\2\2\2\u0117\u0118\7_\2\2\u0118\16\3\2\2\2\u0119\u011a\7*\2"+
		"\2\u011a\20\3\2\2\2\u011b\u011c\7+\2\2\u011c\22\3\2\2\2\u011d\u011e\7"+
		"}\2\2\u011e\24\3\2\2\2\u011f\u0120\7\177\2\2\u0120\26\3\2\2\2\u0121\u0122"+
		"\7=\2\2\u0122\30\3\2\2\2\u0123\u0124\7.\2\2\u0124\32\3\2\2\2\u0125\u0126"+
		"\7?\2\2\u0126\34\3\2\2\2\u0127\u0128\7A\2\2\u0128\36\3\2\2\2\u0129\u012a"+
		"\7<\2\2\u012a \3\2\2\2\u012b\u012c\7\60\2\2\u012c\"\3\2\2\2\u012d\u012e"+
		"\7-\2\2\u012e\u012f\7-\2\2\u012f$\3\2\2\2\u0130\u0131\7/\2\2\u0131\u0132"+
		"\7/\2\2\u0132&\3\2\2\2\u0133\u0134\7-\2\2\u0134(\3\2\2\2\u0135\u0136\7"+
		"/\2\2\u0136*\3\2\2\2\u0137\u0138\7\u0080\2\2\u0138,\3\2\2\2\u0139\u013a"+
		"\7#\2\2\u013a.\3\2\2\2\u013b\u013c\7,\2\2\u013c\60\3\2\2\2\u013d\u013e"+
		"\7\61\2\2\u013e\62\3\2\2\2\u013f\u0140\7\'\2\2\u0140\64\3\2\2\2\u0141"+
		"\u0142\7@\2\2\u0142\u0143\7@\2\2\u0143\66\3\2\2\2\u0144\u0145\7>\2\2\u0145"+
		"\u0146\7>\2\2\u01468\3\2\2\2\u0147\u0148\7@\2\2\u0148\u0149\7@\2\2\u0149"+
		"\u014a\7@\2\2\u014a:\3\2\2\2\u014b\u014c\7>\2\2\u014c<\3\2\2\2\u014d\u014e"+
		"\7@\2\2\u014e>\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151@\3"+
		"\2\2\2\u0152\u0153\7@\2\2\u0153\u0154\7?\2\2\u0154B\3\2\2\2\u0155\u0156"+
		"\7?\2\2\u0156\u0157\7?\2\2\u0157D\3\2\2\2\u0158\u0159\7#\2\2\u0159\u015a"+
		"\7?\2\2\u015aF\3\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015d\u015e"+
		"\7?\2\2\u015eH\3\2\2\2\u015f\u0160\7#\2\2\u0160\u0161\7?\2\2\u0161\u0162"+
		"\7?\2\2\u0162J\3\2\2\2\u0163\u0164\7(\2\2\u0164L\3\2\2\2\u0165\u0166\7"+
		"`\2\2\u0166N\3\2\2\2\u0167\u0168\7~\2\2\u0168P\3\2\2\2\u0169\u016a\7("+
		"\2\2\u016a\u016b\7(\2\2\u016bR\3\2\2\2\u016c\u016d\7~\2\2\u016d\u016e"+
		"\7~\2\2\u016eT\3\2\2\2\u016f\u0170\7,\2\2\u0170\u0171\7?\2\2\u0171V\3"+
		"\2\2\2\u0172\u0173\7\61\2\2\u0173\u0174\7?\2\2\u0174X\3\2\2\2\u0175\u0176"+
		"\7\'\2\2\u0176\u0177\7?\2\2\u0177Z\3\2\2\2\u0178\u0179\7-\2\2\u0179\u017a"+
		"\7?\2\2\u017a\\\3\2\2\2\u017b\u017c\7/\2\2\u017c\u017d\7?\2\2\u017d^\3"+
		"\2\2\2\u017e\u017f\7>\2\2\u017f\u0180\7>\2\2\u0180\u0181\7?\2\2\u0181"+
		"`\3\2\2\2\u0182\u0183\7@\2\2\u0183\u0184\7@\2\2\u0184\u0185\7?\2\2\u0185"+
		"b\3\2\2\2\u0186\u0187\7@\2\2\u0187\u0188\7@\2\2\u0188\u0189\7@\2\2\u0189"+
		"\u018a\7?\2\2\u018ad\3\2\2\2\u018b\u018c\7(\2\2\u018c\u018d\7?\2\2\u018d"+
		"f\3\2\2\2\u018e\u018f\7`\2\2\u018f\u0190\7?\2\2\u0190h\3\2\2\2\u0191\u0192"+
		"\7~\2\2\u0192\u0193\7?\2\2\u0193j\3\2\2\2\u0194\u0195\7p\2\2\u0195\u0196"+
		"\7w\2\2\u0196\u0197\7n\2\2\u0197\u0198\7n\2\2\u0198l\3\2\2\2\u0199\u019a"+
		"\7v\2\2\u019a\u019b\7t\2\2\u019b\u019c\7w\2\2\u019c\u01a3\7g\2\2\u019d"+
		"\u019e\7h\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7u\2\2"+
		"\u01a1\u01a3\7g\2\2\u01a2\u0199\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3n\3\2"+
		"\2\2\u01a4\u01a5\5\u00dbn\2\u01a5\u01a9\7\60\2\2\u01a6\u01a8\5\u00d5k"+
		"\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\5\u00ddo"+
		"\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01bd\3\2\2\2\u01af\u01b1"+
		"\7\60\2\2\u01b0\u01b2\5\u00d5k\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2"+
		"\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b7"+
		"\5\u00ddo\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bd\3\2\2"+
		"\2\u01b8\u01ba\5\u00dbn\2\u01b9\u01bb\5\u00ddo\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01a4\3\2\2\2\u01bc\u01af\3\2"+
		"\2\2\u01bc\u01b8\3\2\2\2\u01bdp\3\2\2\2\u01be\u01bf\7\62\2\2\u01bf\u01c1"+
		"\t\3\2\2\u01c0\u01c2\5\u00d7l\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4r\3\2\2\2\u01c5\u01c7"+
		"\7\62\2\2\u01c6\u01c8\5\u00d9m\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2"+
		"\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01cat\3\2\2\2\u01cb\u01cc"+
		"\7d\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7c\2\2\u01cf"+
		"\u01d0\7m\2\2\u01d0v\3\2\2\2\u01d1\u01d2\7f\2\2\u01d2\u01d3\7q\2\2\u01d3"+
		"x\3\2\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7\7u\2\2\u01d7"+
		"\u01d8\7v\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7p\2\2\u01da\u01db\7e\2\2"+
		"\u01db\u01dc\7g\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7h\2\2\u01dez\3\2\2"+
		"\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7{\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3"+
		"\7g\2\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7h\2\2\u01e5|\3\2\2\2\u01e6\u01e7"+
		"\7e\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7u\2\2\u01e9\u01ea\7g\2\2\u01ea"+
		"~\3\2\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7n\2\2\u01ed\u01ee\7u\2\2\u01ee"+
		"\u01ef\7g\2\2\u01ef\u0080\3\2\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7g\2"+
		"\2\u01f2\u01f3\7y\2\2\u01f3\u0082\3\2\2\2\u01f4\u01f5\7x\2\2\u01f5\u01f6"+
		"\7c\2\2\u01f6\u01f7\7t\2\2\u01f7\u0084\3\2\2\2\u01f8\u01f9\7e\2\2\u01f9"+
		"\u01fa\7c\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7j\2\2"+
		"\u01fd\u0086\3\2\2\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7k\2\2\u0200\u0201"+
		"\7p\2\2\u0201\u0202\7c\2\2\u0202\u0203\7n\2\2\u0203\u0204\7n\2\2\u0204"+
		"\u0205\7{\2\2\u0205\u0088\3\2\2\2\u0206\u0207\7t\2\2\u0207\u0208\7g\2"+
		"\2\u0208\u0209\7v\2\2\u0209\u020a\7w\2\2\u020a\u020b\7t\2\2\u020b\u020c"+
		"\7p\2\2\u020c\u008a\3\2\2\2\u020d\u020e\7x\2\2\u020e\u020f\7q\2\2\u020f"+
		"\u0210\7k\2\2\u0210\u0211\7f\2\2\u0211\u008c\3\2\2\2\u0212\u0213\7e\2"+
		"\2\u0213\u0214\7q\2\2\u0214\u0215\7p\2\2\u0215\u0216\7v\2\2\u0216\u0217"+
		"\7k\2\2\u0217\u0218\7p\2\2\u0218\u0219\7w\2\2\u0219\u021a\7g\2\2\u021a"+
		"\u008e\3\2\2\2\u021b\u021c\7h\2\2\u021c\u021d\7q\2\2\u021d\u021e\7t\2"+
		"\2\u021e\u0090\3\2\2\2\u021f\u0220\7u\2\2\u0220\u0221\7y\2\2\u0221\u0222"+
		"\7k\2\2\u0222\u0223\7v\2\2\u0223\u0224\7e\2\2\u0224\u0225\7j\2\2\u0225"+
		"\u0092\3\2\2\2\u0226\u0227\7y\2\2\u0227\u0228\7j\2\2\u0228\u0229\7k\2"+
		"\2\u0229\u022a\7n\2\2\u022a\u022b\7g\2\2\u022b\u0094\3\2\2\2\u022c\u022d"+
		"\7f\2\2\u022d\u022e\7g\2\2\u022e\u022f\7d\2\2\u022f\u0230\7w\2\2\u0230"+
		"\u0231\7i\2\2\u0231\u0232\7i\2\2\u0232\u0233\7g\2\2\u0233\u0234\7t\2\2"+
		"\u0234\u0096\3\2\2\2\u0235\u0236\7h\2\2\u0236\u0237\7w\2\2\u0237\u0238"+
		"\7p\2\2\u0238\u0239\7e\2\2\u0239\u023a\7v\2\2\u023a\u023b\7k\2\2\u023b"+
		"\u023c\7q\2\2\u023c\u023d\7p\2\2\u023d\u0098\3\2\2\2\u023e\u023f\7v\2"+
		"\2\u023f\u0240\7j\2\2\u0240\u0241\7k\2\2\u0241\u0242\7u\2\2\u0242\u009a"+
		"\3\2\2\2\u0243\u0244\7y\2\2\u0244\u0245\7k\2\2\u0245\u0246\7v\2\2\u0246"+
		"\u0247\7j\2\2\u0247\u009c\3\2\2\2\u0248\u0249\7f\2\2\u0249\u024a\7g\2"+
		"\2\u024a\u024b\7h\2\2\u024b\u024c\7c\2\2\u024c\u024d\7w\2\2\u024d\u024e"+
		"\7n\2\2\u024e\u024f\7v\2\2\u024f\u009e\3\2\2\2\u0250\u0251\7k\2\2\u0251"+
		"\u0252\7h\2\2\u0252\u00a0\3\2\2\2\u0253\u0254\7v\2\2\u0254\u0255\7j\2"+
		"\2\u0255\u0256\7t\2\2\u0256\u0257\7q\2\2\u0257\u0258\7y\2\2\u0258\u00a2"+
		"\3\2\2\2\u0259\u025a\7f\2\2\u025a\u025b\7g\2\2\u025b\u025c\7n\2\2\u025c"+
		"\u025d\7g\2\2\u025d\u025e\7v\2\2\u025e\u025f\7g\2\2\u025f\u00a4\3\2\2"+
		"\2\u0260\u0261\7k\2\2\u0261\u0262\7p\2\2\u0262\u00a6\3\2\2\2\u0263\u0264"+
		"\7v\2\2\u0264\u0265\7t\2\2\u0265\u0266\7{\2\2\u0266\u00a8\3\2\2\2\u0267"+
		"\u0268\7e\2\2\u0268\u0269\7n\2\2\u0269\u026a\7c\2\2\u026a\u026b\7u\2\2"+
		"\u026b\u026c\7u\2\2\u026c\u00aa\3\2\2\2\u026d\u026e\7g\2\2\u026e\u026f"+
		"\7p\2\2\u026f\u0270\7w\2\2\u0270\u0271\7o\2\2\u0271\u00ac\3\2\2\2\u0272"+
		"\u0273\7g\2\2\u0273\u0274\7z\2\2\u0274\u0275\7v\2\2\u0275\u0276\7g\2\2"+
		"\u0276\u0277\7p\2\2\u0277\u0278\7f\2\2\u0278\u0279\7u\2\2\u0279\u00ae"+
		"\3\2\2\2\u027a\u027b\7u\2\2\u027b\u027c\7w\2\2\u027c\u027d\7r\2\2\u027d"+
		"\u027e\7g\2\2\u027e\u027f\7t\2\2\u027f\u00b0\3\2\2\2\u0280\u0281\7e\2"+
		"\2\u0281\u0282\7q\2\2\u0282\u0283\7p\2\2\u0283\u0284\7u\2\2\u0284\u0285"+
		"\7v\2\2\u0285\u00b2\3\2\2\2\u0286\u0287\7g\2\2\u0287\u0288\7z\2\2\u0288"+
		"\u0289\7r\2\2\u0289\u028a\7q\2\2\u028a\u028b\7t\2\2\u028b\u028c\7v\2\2"+
		"\u028c\u00b4\3\2\2\2\u028d\u028e\7k\2\2\u028e\u028f\7o\2\2\u028f\u0290"+
		"\7r\2\2\u0290\u0291\7q\2\2\u0291\u0292\7t\2\2\u0292\u0293\7v\2\2\u0293"+
		"\u00b6\3\2\2\2\u0294\u0298\5\u00dfp\2\u0295\u0297\5\u00e1q\2\u0296\u0295"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u00b8\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029f\7$\2\2\u029c\u029e\5\u00bf"+
		"`\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02ac\7$"+
		"\2\2\u02a3\u02a7\7)\2\2\u02a4\u02a6\5\u00c1a\2\u02a5\u02a4\3\2\2\2\u02a6"+
		"\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2"+
		"\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\7)\2\2\u02ab\u029b\3\2\2\2\u02ab"+
		"\u02a3\3\2\2\2\u02ac\u00ba\3\2\2\2\u02ad\u02af\t\4\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\b^\2\2\u02b3\u00bc\3\2\2\2\u02b4\u02b5\13\2"+
		"\2\2\u02b5\u00be\3\2\2\2\u02b6\u02bb\n\5\2\2\u02b7\u02b8\7^\2\2\u02b8"+
		"\u02bb\5\u00c3b\2\u02b9\u02bb\5\u00d1i\2\u02ba\u02b6\3\2\2\2\u02ba\u02b7"+
		"\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u00c0\3\2\2\2\u02bc\u02c1\n\6\2\2\u02bd"+
		"\u02be\7^\2\2\u02be\u02c1\5\u00c3b\2\u02bf\u02c1\5\u00d1i\2\u02c0\u02bc"+
		"\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u00c2\3\2\2\2\u02c2"+
		"\u02c7\5\u00c5c\2\u02c3\u02c7\7\62\2\2\u02c4\u02c7\5\u00c7d\2\u02c5\u02c7"+
		"\5\u00c9e\2\u02c6\u02c2\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2"+
		"\2\u02c6\u02c5\3\2\2\2\u02c7\u00c4\3\2\2\2\u02c8\u02cb\5\u00cbf\2\u02c9"+
		"\u02cb\5\u00cdg\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u00c6"+
		"\3\2\2\2\u02cc\u02cd\7z\2\2\u02cd\u02ce\5\u00d7l\2\u02ce\u02cf\5\u00d7"+
		"l\2\u02cf\u00c8\3\2\2\2\u02d0\u02d1\7w\2\2\u02d1\u02d2\5\u00d7l\2\u02d2"+
		"\u02d3\5\u00d7l\2\u02d3\u02d4\5\u00d7l\2\u02d4\u02d5\5\u00d7l\2\u02d5"+
		"\u00ca\3\2\2\2\u02d6\u02d7\t\7\2\2\u02d7\u00cc\3\2\2\2\u02d8\u02d9\n\b"+
		"\2\2\u02d9\u00ce\3\2\2\2\u02da\u02de\5\u00cbf\2\u02db\u02de\5\u00d5k\2"+
		"\u02dc\u02de\t\t\2\2\u02dd\u02da\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02dc"+
		"\3\2\2\2\u02de\u00d0\3\2\2\2\u02df\u02e0\7^\2\2\u02e0\u02e1\5\u00d3j\2"+
		"\u02e1\u00d2\3\2\2\2\u02e2\u02e3\7\17\2\2\u02e3\u02e6\7\f\2\2\u02e4\u02e6"+
		"\5\t\5\2\u02e5\u02e2\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u00d4\3\2\2\2\u02e7"+
		"\u02e8\t\n\2\2\u02e8\u00d6\3\2\2\2\u02e9\u02ea\t\13\2\2\u02ea\u00d8\3"+
		"\2\2\2\u02eb\u02ec\t\f\2\2\u02ec\u00da\3\2\2\2\u02ed\u02f6\7\62\2\2\u02ee"+
		"\u02f2\t\r\2\2\u02ef\u02f1\5\u00d5k\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4"+
		"\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02ed\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f6\u00dc\3\2"+
		"\2\2\u02f7\u02f9\t\16\2\2\u02f8\u02fa\t\17\2\2\u02f9\u02f8\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02fd\5\u00d5k\2\u02fc\u02fb"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u00de\3\2\2\2\u0300\u0305\5\u00e3r\2\u0301\u0305\t\20\2\2\u0302\u0303"+
		"\7^\2\2\u0303\u0305\5\u00c9e\2\u0304\u0300\3\2\2\2\u0304\u0301\3\2\2\2"+
		"\u0304\u0302\3\2\2\2\u0305\u00e0\3\2\2\2\u0306\u030d\5\u00dfp\2\u0307"+
		"\u030d\5\u00e5s\2\u0308\u030d\5\u00e7t\2\u0309\u030d\5\u00e9u\2\u030a"+
		"\u030d\5\u00ebv\2\u030b\u030d\5\u00edw\2\u030c\u0306\3\2\2\2\u030c\u0307"+
		"\3\2\2\2\u030c\u0308\3\2\2\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030b\3\2\2\2\u030d\u00e2\3\2\2\2\u030e\u0310\t\21\2\2\u030f\u030e\3"+
		"\2\2\2\u0310\u00e4\3\2\2\2\u0311\u0313\t\22\2\2\u0312\u0311\3\2\2\2\u0313"+
		"\u00e6\3\2\2\2\u0314\u0316\t\23\2\2\u0315\u0314\3\2\2\2\u0316\u00e8\3"+
		"\2\2\2\u0317\u0319\t\24\2\2\u0318\u0317\3\2\2\2\u0319\u00ea\3\2\2\2\u031a"+
		"\u031b\7\u200e\2\2\u031b\u00ec\3\2\2\2\u031c\u031d\7\u200f\2\2\u031d\u00ee"+
		"\3\2\2\2\u031e\u0322\5\u00f3z\2\u031f\u0321\5\u00f5{\2\u0320\u031f\3\2"+
		"\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u00f0\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0327\5\u00e1q\2\u0326\u0325"+
		"\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u00f2\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032f\n\25\2\2\u032c\u032f\5"+
		"\u00f9}\2\u032d\u032f\5\u00fb~\2\u032e\u032b\3\2\2\2\u032e\u032c\3\2\2"+
		"\2\u032e\u032d\3\2\2\2\u032f\u00f4\3\2\2\2\u0330\u0334\n\26\2\2\u0331"+
		"\u0334\5\u00f9}\2\u0332\u0334\5\u00fb~\2\u0333\u0330\3\2\2\2\u0333\u0331"+
		"\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u00f6\3\2\2\2\u0335\u0336\n\2\2\2\u0336"+
		"\u00f8\3\2\2\2\u0337\u0338\7^\2\2\u0338\u0339\5\u00f7|\2\u0339\u00fa\3"+
		"\2\2\2\u033a\u033e\7]\2\2\u033b\u033d\5\u00fd\177\2\u033c\u033b\3\2\2"+
		"\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341"+
		"\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\7_\2\2\u0342\u00fc\3\2\2\2\u0343"+
		"\u0346\n\27\2\2\u0344\u0346\5\u00f9}\2\u0345\u0343\3\2\2\2\u0345\u0344"+
		"\3\2\2\2\u0346\u00fe\3\2\2\2(\2\u0109\u01a2\u01a9\u01ad\u01b3\u01b6\u01ba"+
		"\u01bc\u01c3\u01c9\u0298\u029f\u02a7\u02ab\u02b0\u02ba\u02c0\u02c6\u02ca"+
		"\u02dd\u02e5\u02f2\u02f5\u02f9\u02fe\u0304\u030c\u030f\u0312\u0315\u0318"+
		"\u0322\u0328\u032e\u0333\u033e\u0345\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}