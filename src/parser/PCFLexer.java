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
		ID=11, LIT=12, OPFirst=13, OPLast=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LET", "IN", "IFZ", "THEN", "ELSE", "FUN", "ARROW", 
			"ID", "LIT", "OPFirst", "OPLast", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'let'", "'in'", "'ifz'", "'then'", "'else'", 
			"'fun'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LET", "IN", "IFZ", "THEN", "ELSE", "FUN", "ARROW", 
			"ID", "LIT", "OPFirst", "OPLast", "WS"
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
		"\u0004\u0000\u000f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nD\b\n\n\n\f\nG\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bL\b\u000b\n\u000b\f\u000bO\t\u000b"+
		"\u0003\u000bQ\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004"+
		"\u000eX\b\u000e\u000b\u000e\f\u000eY\u0001\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0007\u0001\u0000az\u0003\u000009AZaz\u0001\u0000"+
		"19\u0001\u000009\u0002\u0000**//\u0002\u0000++--\u0003\u0000\t\n\r\r "+
		" `\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001"+
		"\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000"+
		"\u0000\t)\u0001\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r0\u0001"+
		"\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000"+
		"\u0000\u0013>\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017"+
		"P\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001bT\u0001"+
		"\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001f \u0005=\u0000"+
		"\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\u0004\u0001"+
		"\u0000\u0000\u0000#$\u0005)\u0000\u0000$\u0006\u0001\u0000\u0000\u0000"+
		"%&\u0005l\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005t\u0000\u0000(\b\u0001"+
		"\u0000\u0000\u0000)*\u0005i\u0000\u0000*+\u0005n\u0000\u0000+\n\u0001"+
		"\u0000\u0000\u0000,-\u0005i\u0000\u0000-.\u0005f\u0000\u0000./\u0005z"+
		"\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005t\u0000\u000012\u0005h"+
		"\u0000\u000023\u0005e\u0000\u000034\u0005n\u0000\u00004\u000e\u0001\u0000"+
		"\u0000\u000056\u0005e\u0000\u000067\u0005l\u0000\u000078\u0005s\u0000"+
		"\u000089\u0005e\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005f\u0000"+
		"\u0000;<\u0005u\u0000\u0000<=\u0005n\u0000\u0000=\u0012\u0001\u0000\u0000"+
		"\u0000>?\u0005-\u0000\u0000?@\u0005>\u0000\u0000@\u0014\u0001\u0000\u0000"+
		"\u0000AE\u0007\u0000\u0000\u0000BD\u0007\u0001\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HQ\u00050\u0000\u0000IM\u0007\u0002\u0000\u0000JL\u0007\u0003\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000"+
		"Q\u0018\u0001\u0000\u0000\u0000RS\u0007\u0004\u0000\u0000S\u001a\u0001"+
		"\u0000\u0000\u0000TU\u0007\u0005\u0000\u0000U\u001c\u0001\u0000\u0000"+
		"\u0000VX\u0007\u0006\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0006\u000e\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000\u0005\u0000EMPY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}