// Generated from TypeExpression.g4 by ANTLR 4.13.0
package parser;

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUMBER=13, TEXT=14, ATTR=15, SUM=16, SUB=17, 
		MULT=18, DIV=19, OPREL=20, ID=21, VIRG=22, PF=23, AP=24, FP=25, BLANK=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "MULT", 
			"DIV", "OPREL", "ID", "VIRG", "PF", "AP", "FP", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'se'", "'entao'", 
			"'senao'", "'fimse'", "'leia'", "'escreva'", "'enquanto'", "'fimenquanto'", 
			null, null, "':='", "'+'", "'-'", "'*'", "'/'", null, null, "','", "'.'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "MULT", "DIV", "OPREL", 
			"ID", "VIRG", "PF", "AP", "FP", "BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
		
		public void verificaID(String idAtribuido) {
			Identifier id = symbolTable.get(idAtribuido);
			if (id == null){
				throw new RuntimeException("Semantic ERROR - Undeclared Identifier " + idAtribuido);
			}
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}
		
		public void runInterpreter(){
			program.run();
		}


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

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
		"\u0004\u0000\u001a\u00c3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\f\u008d\b\f\u000b\f\f\f\u008e\u0001\r\u0001\r\u0005\r\u0093\b\r\n\r\f"+
		"\r\u0096\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00af\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00b3\b\u0014"+
		"\n\u0014\f\u0014\u00b6\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001"+
		"\u0000\u0005\u0001\u000009\u0006\u0000\t\t !--09AZaz\u0001\u0000az\u0003"+
		"\u000009AZaz\u0003\u0000\t\n\r\r  \u00ca\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000"+
		"\u0000\u0000\u0003>\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000"+
		"\u0007O\u0001\u0000\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000bW\u0001"+
		"\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000fc\u0001\u0000\u0000"+
		"\u0000\u0011i\u0001\u0000\u0000\u0000\u0013n\u0001\u0000\u0000\u0000\u0015"+
		"v\u0001\u0000\u0000\u0000\u0017\u007f\u0001\u0000\u0000\u0000\u0019\u008c"+
		"\u0001\u0000\u0000\u0000\u001b\u0090\u0001\u0000\u0000\u0000\u001d\u0099"+
		"\u0001\u0000\u0000\u0000\u001f\u009c\u0001\u0000\u0000\u0000!\u009e\u0001"+
		"\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000"+
		"\u0000\'\u00ae\u0001\u0000\u0000\u0000)\u00b0\u0001\u0000\u0000\u0000"+
		"+\u00b7\u0001\u0000\u0000\u0000-\u00b9\u0001\u0000\u0000\u0000/\u00bb"+
		"\u0001\u0000\u0000\u00001\u00bd\u0001\u0000\u0000\u00003\u00bf\u0001\u0000"+
		"\u0000\u000056\u0005p\u0000\u000067\u0005r\u0000\u000078\u0005o\u0000"+
		"\u000089\u0005g\u0000\u00009:\u0005r\u0000\u0000:;\u0005a\u0000\u0000"+
		";<\u0005m\u0000\u0000<=\u0005a\u0000\u0000=\u0002\u0001\u0000\u0000\u0000"+
		">?\u0005f\u0000\u0000?@\u0005i\u0000\u0000@A\u0005m\u0000\u0000AB\u0005"+
		"p\u0000\u0000BC\u0005r\u0000\u0000CD\u0005o\u0000\u0000DE\u0005g\u0000"+
		"\u0000EF\u0005.\u0000\u0000F\u0004\u0001\u0000\u0000\u0000GH\u0005I\u0000"+
		"\u0000HI\u0005N\u0000\u0000IJ\u0005T\u0000\u0000JK\u0005E\u0000\u0000"+
		"KL\u0005G\u0000\u0000LM\u0005E\u0000\u0000MN\u0005R\u0000\u0000N\u0006"+
		"\u0001\u0000\u0000\u0000OP\u0005R\u0000\u0000PQ\u0005E\u0000\u0000QR\u0005"+
		"A\u0000\u0000RS\u0005L\u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005"+
		"s\u0000\u0000UV\u0005e\u0000\u0000V\n\u0001\u0000\u0000\u0000WX\u0005"+
		"e\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005o\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005s\u0000"+
		"\u0000^_\u0005e\u0000\u0000_`\u0005n\u0000\u0000`a\u0005a\u0000\u0000"+
		"ab\u0005o\u0000\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005f\u0000\u0000"+
		"de\u0005i\u0000\u0000ef\u0005m\u0000\u0000fg\u0005s\u0000\u0000gh\u0005"+
		"e\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005l\u0000\u0000jk\u0005"+
		"e\u0000\u0000kl\u0005i\u0000\u0000lm\u0005a\u0000\u0000m\u0012\u0001\u0000"+
		"\u0000\u0000no\u0005e\u0000\u0000op\u0005s\u0000\u0000pq\u0005c\u0000"+
		"\u0000qr\u0005r\u0000\u0000rs\u0005e\u0000\u0000st\u0005v\u0000\u0000"+
		"tu\u0005a\u0000\u0000u\u0014\u0001\u0000\u0000\u0000vw\u0005e\u0000\u0000"+
		"wx\u0005n\u0000\u0000xy\u0005q\u0000\u0000yz\u0005u\u0000\u0000z{\u0005"+
		"a\u0000\u0000{|\u0005n\u0000\u0000|}\u0005t\u0000\u0000}~\u0005o\u0000"+
		"\u0000~\u0016\u0001\u0000\u0000\u0000\u007f\u0080\u0005f\u0000\u0000\u0080"+
		"\u0081\u0005i\u0000\u0000\u0081\u0082\u0005m\u0000\u0000\u0082\u0083\u0005"+
		"e\u0000\u0000\u0083\u0084\u0005n\u0000\u0000\u0084\u0085\u0005q\u0000"+
		"\u0000\u0085\u0086\u0005u\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087"+
		"\u0088\u0005n\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089\u008a\u0005"+
		"o\u0000\u0000\u008a\u0018\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0000"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0094\u0005\"\u0000"+
		"\u0000\u0091\u0093\u0007\u0001\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000"+
		"\u0098\u001c\u0001\u0000\u0000\u0000\u0099\u009a\u0005:\u0000\u0000\u009a"+
		"\u009b\u0005=\u0000\u0000\u009b\u001e\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005+\u0000\u0000\u009d \u0001\u0000\u0000\u0000\u009e\u009f\u0005-"+
		"\u0000\u0000\u009f\"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005*\u0000"+
		"\u0000\u00a1$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005/\u0000\u0000\u00a3"+
		"&\u0001\u0000\u0000\u0000\u00a4\u00af\u0005>\u0000\u0000\u00a5\u00a6\u0005"+
		">\u0000\u0000\u00a6\u00af\u0005=\u0000\u0000\u00a7\u00af\u0005<\u0000"+
		"\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9\u00af\u0005=\u0000\u0000\u00aa"+
		"\u00ab\u0005=\u0000\u0000\u00ab\u00af\u0005=\u0000\u0000\u00ac\u00ad\u0005"+
		"<\u0000\u0000\u00ad\u00af\u0005>\u0000\u0000\u00ae\u00a4\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a5\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af(\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b4\u0007\u0002\u0000\u0000\u00b1\u00b3\u0007\u0003\u0000\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5*\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005,\u0000\u0000\u00b8,\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		".\u0000\u0000\u00ba.\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005(\u0000"+
		"\u0000\u00bc0\u0001\u0000\u0000\u0000\u00bd\u00be\u0005)\u0000\u0000\u00be"+
		"2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0004\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0019\u0000\u0000\u00c24\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u008e\u0092\u0094\u00ae\u00b2\u00b4\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}