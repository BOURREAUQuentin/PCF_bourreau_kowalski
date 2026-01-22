// Generated from /Users/quentinbourreau/Desktop/PCF_bourreau_kowalski/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LET=4, IN=5, IFZ=6, THEN=7, ELSE=8, FUN=9, ARROW=10, 
		FIX=11, ID=12, LIT=13, OPFirst=14, OPLast=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LET", "IN", "IFZ", "THEN", "ELSE", "FUN", "ARROW", 
			"FIX", "ID", "LIT", "OPFirst", "OPLast", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'let'", "'in'", "'ifz'", "'then'", "'else'", 
			"'fun'", "'->'", "'fix'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LET", "IN", "IFZ", "THEN", "ELSE", "FUN", "ARROW", 
			"FIX", "ID", "LIT", "OPFirst", "OPLast", "WS"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u0010c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000bJ\b\u000b\n\u000b\f\u000bM\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\fR\b\f\n\f\f\fU\t\f\u0003\fW\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f^\b\u000f\u000b"+
		"\u000f\f\u000f_\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010\u0001\u0000\u0007\u0001\u0000az\u0003\u000009AZaz\u0001\u0000"+
		"19\u0001\u000009\u0002\u0000**//\u0002\u0000++--\u0003\u0000\t\n\r\r "+
		" f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000"+
		"\u0000\u0007\'\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b"+
		".\u0001\u0000\u0000\u0000\r2\u0001\u0000\u0000\u0000\u000f7\u0001\u0000"+
		"\u0000\u0000\u0011<\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000"+
		"\u0015C\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019V"+
		"\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000"+
		"\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!\"\u0005=\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%&\u0005)\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005l\u0000"+
		"\u0000()\u0005e\u0000\u0000)*\u0005t\u0000\u0000*\b\u0001\u0000\u0000"+
		"\u0000+,\u0005i\u0000\u0000,-\u0005n\u0000\u0000-\n\u0001\u0000\u0000"+
		"\u0000./\u0005i\u0000\u0000/0\u0005f\u0000\u000001\u0005z\u0000\u0000"+
		"1\f\u0001\u0000\u0000\u000023\u0005t\u0000\u000034\u0005h\u0000\u0000"+
		"45\u0005e\u0000\u000056\u0005n\u0000\u00006\u000e\u0001\u0000\u0000\u0000"+
		"78\u0005e\u0000\u000089\u0005l\u0000\u00009:\u0005s\u0000\u0000:;\u0005"+
		"e\u0000\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0005f\u0000\u0000=>\u0005"+
		"u\u0000\u0000>?\u0005n\u0000\u0000?\u0012\u0001\u0000\u0000\u0000@A\u0005"+
		"-\u0000\u0000AB\u0005>\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005"+
		"f\u0000\u0000DE\u0005i\u0000\u0000EF\u0005x\u0000\u0000F\u0016\u0001\u0000"+
		"\u0000\u0000GK\u0007\u0000\u0000\u0000HJ\u0007\u0001\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NW\u00050\u0000\u0000OS\u0007\u0002\u0000\u0000PR\u0007\u0003"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VO\u0001\u0000\u0000"+
		"\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0007\u0004\u0000\u0000Y\u001c"+
		"\u0001\u0000\u0000\u0000Z[\u0007\u0005\u0000\u0000[\u001e\u0001\u0000"+
		"\u0000\u0000\\^\u0007\u0006\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ab\u0006\u000f\u0000\u0000b \u0001\u0000\u0000"+
		"\u0000\u0005\u0000KSV_\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}