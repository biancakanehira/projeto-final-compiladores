// Generated from TypeExpression.g4 by ANTLR 4.4

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, NUMBER=13, TEXT=14, ATTR=15, SUM=16, SUB=17, 
		MULT=18, DIV=19, OPREL=20, ID=21, VIRG=22, PF=23, AP=24, FP=25, BLANK=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "MULT", 
		"DIV", "OPREL", "ID", "VIRG", "PF", "AP", "FP", "BLANK"
	};


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
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u008f\n\16\r\16\16\16\u0090\3\17"+
		"\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00b1\n\25\3\26\3\26\7\26\u00b5\n\26\f\26\16"+
		"\26\u00b8\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\3\2\7\3\2\62;\b\2\13\13\"#//\62;C\\c|\3\2c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5=\3"+
		"\2\2\2\7E\3\2\2\2\tH\3\2\2\2\13P\3\2\2\2\r\\\3\2\2\2\17e\3\2\2\2\21k\3"+
		"\2\2\2\23t\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0088\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u009b\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2"+
		"\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b9"+
		"\3\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2"+
		"\2\2\678\7h\2\289\7k\2\29:\7o\2\2:;\7u\2\2;<\7g\2\2<\4\3\2\2\2=>\7g\2"+
		"\2>?\7u\2\2?@\7e\2\2@A\7t\2\2AB\7g\2\2BC\7x\2\2CD\7c\2\2D\6\3\2\2\2EF"+
		"\7u\2\2FG\7g\2\2G\b\3\2\2\2HI\7K\2\2IJ\7P\2\2JK\7V\2\2KL\7G\2\2LM\7I\2"+
		"\2MN\7G\2\2NO\7T\2\2O\n\3\2\2\2PQ\7h\2\2QR\7k\2\2RS\7o\2\2ST\7g\2\2TU"+
		"\7p\2\2UV\7s\2\2VW\7w\2\2WX\7c\2\2XY\7p\2\2YZ\7v\2\2Z[\7q\2\2[\f\3\2\2"+
		"\2\\]\7g\2\2]^\7p\2\2^_\7s\2\2_`\7w\2\2`a\7c\2\2ab\7p\2\2bc\7v\2\2cd\7"+
		"q\2\2d\16\3\2\2\2ef\7u\2\2fg\7g\2\2gh\7p\2\2hi\7c\2\2ij\7q\2\2j\20\3\2"+
		"\2\2kl\7h\2\2lm\7k\2\2mn\7o\2\2no\7r\2\2op\7t\2\2pq\7q\2\2qr\7i\2\2rs"+
		"\7\60\2\2s\22\3\2\2\2tu\7g\2\2uv\7p\2\2vw\7v\2\2wx\7c\2\2xy\7q\2\2y\24"+
		"\3\2\2\2z{\7T\2\2{|\7G\2\2|}\7C\2\2}~\7N\2\2~\26\3\2\2\2\177\u0080\7r"+
		"\2\2\u0080\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7i\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7o\2\2\u0086\u0087\7c\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7g\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7c\2\2\u008c\32\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\34"+
		"\3\2\2\2\u0092\u0096\7$\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\7<\2\2\u009c\u009d\7?\2\2\u009d \3\2\2\2\u009e\u009f\7-\2\2\u009f\"\3"+
		"\2\2\2\u00a0\u00a1\7/\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3&\3\2"+
		"\2\2\u00a4\u00a5\7\61\2\2\u00a5(\3\2\2\2\u00a6\u00b1\7@\2\2\u00a7\u00a8"+
		"\7@\2\2\u00a8\u00b1\7?\2\2\u00a9\u00b1\7>\2\2\u00aa\u00ab\7>\2\2\u00ab"+
		"\u00b1\7?\2\2\u00ac\u00ad\7?\2\2\u00ad\u00b1\7?\2\2\u00ae\u00af\7>\2\2"+
		"\u00af\u00b1\7@\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00a9"+
		"\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b6\t\4\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7,\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba.\3\2\2\2\u00bb\u00bc"+
		"\7\60\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7*\2\2\u00be\62\3\2\2\2\u00bf\u00c0"+
		"\7+\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\b\33\2\2\u00c4\66\3\2\2\2\t\2\u0090\u0094\u0096\u00b0\u00b4\u00b6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}