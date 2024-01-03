// Generated from DecSol.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecSolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, NUMBER=41, DIGIT=42, DAY=43, MONTH=44, YEAR=45, HOURS=46, 
		MINUTES=47, SECONDS=48, LOGICALOPERATOR=49, CONDITIONALOPERATOR=50, NAME=51, 
		WS=52;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_contract = 2, RULE_transaction = 3, 
		RULE_transactionType = 4, RULE_deposit = 5, RULE_withdraw = 6, RULE_swap = 7, 
		RULE_transfer = 8, RULE_service = 9, RULE_event = 10, RULE_emit = 11, 
		RULE_bid = 12, RULE_asset = 13, RULE_assetType = 14, RULE_on = 15, RULE_condition = 16, 
		RULE_finalcondition = 17, RULE_assetCondition = 18, RULE_timeCondition = 19, 
		RULE_dateCondition = 20, RULE_assetName = 21, RULE_transactionName = 22, 
		RULE_address = 23, RULE_val = 24, RULE_tokenID = 25, RULE_eventName = 26, 
		RULE_contractName = 27, RULE_amount = 28, RULE_wallet = 29, RULE_serviceName = 30, 
		RULE_time = 31, RULE_date = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "contract", "transaction", "transactionType", 
			"deposit", "withdraw", "swap", "transfer", "service", "event", "emit", 
			"bid", "asset", "assetType", "on", "condition", "finalcondition", "assetCondition", 
			"timeCondition", "dateCondition", "assetName", "transactionName", "address", 
			"val", "tokenID", "eventName", "contractName", "amount", "wallet", "serviceName", 
			"time", "date"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'contract'", "'accepts offers'", "'transaction'", 
			"'in'", "'that'", "'deposits'", "'withdraws'", "'swaps'", "'transfers'", 
			"'buys'", "'value'", "'from wallet'", "'into wallet'", "'token'", "'with'", 
			"'amount'", "'to wallet'", "'service'", "'with amount'", "'every'", "'days'", 
			"'event'", "'in contract'", "'('", "','", "')'", "'and emits'", "'bid'", 
			"'on'", "'for'", "'asset'", "'wallet'", "'nft'", "'oracle'", "'not'", 
			"'time'", "'date'", "':'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMBER", "DIGIT", "DAY", "MONTH", "YEAR", 
			"HOURS", "MINUTES", "SECONDS", "LOGICALOPERATOR", "CONDITIONALOPERATOR", 
			"NAME", "WS"
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

	@Override
	public String getGrammarFileName() { return "DecSol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecSolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				expression();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
		public ContractContext contract() {
			return getRuleContext(ContractContext.class,0);
		}
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TransactionContext transaction() {
			return getRuleContext(TransactionContext.class,0);
		}
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(72);
				contract();
				}
				break;
			case T__31:
				{
				setState(73);
				asset();
				}
				break;
			case T__3:
				{
				setState(74);
				transaction();
				}
				break;
			case T__28:
				{
				setState(75);
				bid();
				}
				break;
			case T__22:
				{
				setState(76);
				event();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ContractContext extends ParserRuleContext {
		public ContractNameContext contractName() {
			return getRuleContext(ContractNameContext.class,0);
		}
		public ContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterContract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitContract(this);
		}
	}

	public final ContractContext contract() throws RecognitionException {
		ContractContext _localctx = new ContractContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contract);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__1);
			setState(80);
			contractName();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(81);
				match(T__2);
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

	public static class TransactionContext extends ParserRuleContext {
		public TransactionNameContext transactionName() {
			return getRuleContext(TransactionNameContext.class,0);
		}
		public ContractNameContext contractName() {
			return getRuleContext(ContractNameContext.class,0);
		}
		public TransactionTypeContext transactionType() {
			return getRuleContext(TransactionTypeContext.class,0);
		}
		public EmitContext emit() {
			return getRuleContext(EmitContext.class,0);
		}
		public OnContext on() {
			return getRuleContext(OnContext.class,0);
		}
		public TransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTransaction(this);
		}
	}

	public final TransactionContext transaction() throws RecognitionException {
		TransactionContext _localctx = new TransactionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__3);
			setState(85);
			transactionName();
			setState(86);
			match(T__4);
			setState(87);
			contractName();
			setState(88);
			match(T__5);
			setState(89);
			transactionType();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(90);
				emit();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(93);
				on();
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

	public static class TransactionTypeContext extends ParserRuleContext {
		public DepositContext deposit() {
			return getRuleContext(DepositContext.class,0);
		}
		public WithdrawContext withdraw() {
			return getRuleContext(WithdrawContext.class,0);
		}
		public SwapContext swap() {
			return getRuleContext(SwapContext.class,0);
		}
		public TransferContext transfer() {
			return getRuleContext(TransferContext.class,0);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public TransactionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTransactionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTransactionType(this);
		}
	}

	public final TransactionTypeContext transactionType() throws RecognitionException {
		TransactionTypeContext _localctx = new TransactionTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transactionType);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(96);
				match(T__6);
				setState(97);
				deposit();
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(98);
				match(T__7);
				setState(99);
				withdraw();
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(100);
				match(T__8);
				setState(101);
				swap();
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(102);
				match(T__9);
				setState(103);
				transfer();
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(104);
				match(T__10);
				setState(105);
				service();
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

	public static class DepositContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public DepositContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deposit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterDeposit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitDeposit(this);
		}
	}

	public final DepositContext deposit() throws RecognitionException {
		DepositContext _localctx = new DepositContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deposit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__11);
			setState(109);
			val();
			setState(110);
			match(T__12);
			setState(111);
			address();
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

	public static class WithdrawContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public WithdrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withdraw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterWithdraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitWithdraw(this);
		}
	}

	public final WithdrawContext withdraw() throws RecognitionException {
		WithdrawContext _localctx = new WithdrawContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_withdraw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			val();
			setState(115);
			match(T__13);
			setState(116);
			address();
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

	public static class SwapContext extends ParserRuleContext {
		public TokenIDContext tokenID() {
			return getRuleContext(TokenIDContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public SwapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterSwap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitSwap(this);
		}
	}

	public final SwapContext swap() throws RecognitionException {
		SwapContext _localctx = new SwapContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_swap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__14);
			setState(119);
			tokenID();
			setState(120);
			match(T__15);
			setState(121);
			val();
			setState(122);
			match(T__12);
			setState(123);
			address();
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

	public static class TransferContext extends ParserRuleContext {
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public WalletContext wallet() {
			return getRuleContext(WalletContext.class,0);
		}
		public TransferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transfer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTransfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTransfer(this);
		}
	}

	public final TransferContext transfer() throws RecognitionException {
		TransferContext _localctx = new TransferContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transfer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__16);
			setState(126);
			amount();
			setState(127);
			match(T__17);
			setState(128);
			wallet();
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

	public static class ServiceContext extends ParserRuleContext {
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DecSolParser.NUMBER, 0); }
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitService(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_service);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__18);
			setState(131);
			serviceName();
			setState(132);
			match(T__19);
			setState(133);
			amount();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(134);
				match(T__20);
				setState(135);
				match(NUMBER);
				setState(136);
				match(T__21);
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

	public static class EventContext extends ParserRuleContext {
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public ContractNameContext contractName() {
			return getRuleContext(ContractNameContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(DecSolParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DecSolParser.NAME, i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__22);
			setState(140);
			eventName();
			setState(141);
			match(T__23);
			setState(142);
			contractName();
			setState(143);
			match(T__24);
			setState(144);
			match(NAME);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(145);
				match(T__25);
				setState(146);
				match(NAME);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__26);
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

	public static class EmitContext extends ParserRuleContext {
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(DecSolParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DecSolParser.NAME, i);
		}
		public EmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterEmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitEmit(this);
		}
	}

	public final EmitContext emit() throws RecognitionException {
		EmitContext _localctx = new EmitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_emit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__27);
			setState(155);
			eventName();
			setState(156);
			match(T__24);
			setState(157);
			match(NAME);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(158);
				match(T__25);
				setState(159);
				match(NAME);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__26);
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

	public static class BidContext extends ParserRuleContext {
		public ContractNameContext contractName() {
			return getRuleContext(ContractNameContext.class,0);
		}
		public AssetNameContext assetName() {
			return getRuleContext(AssetNameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DecSolParser.NUMBER, 0); }
		public BidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterBid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitBid(this);
		}
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__28);
			setState(168);
			match(T__4);
			setState(169);
			contractName();
			setState(170);
			match(T__29);
			setState(171);
			assetName();
			setState(172);
			match(T__30);
			setState(173);
			match(NUMBER);
			setState(174);
			match(T__21);
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

	public static class AssetContext extends ParserRuleContext {
		public AssetTypeContext assetType() {
			return getRuleContext(AssetTypeContext.class,0);
		}
		public AssetNameContext assetName() {
			return getRuleContext(AssetNameContext.class,0);
		}
		public ContractNameContext contractName() {
			return getRuleContext(ContractNameContext.class,0);
		}
		public AssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAsset(this);
		}
	}

	public final AssetContext asset() throws RecognitionException {
		AssetContext _localctx = new AssetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__31);
			setState(177);
			assetType();
			setState(178);
			assetName();
			setState(179);
			match(T__4);
			setState(180);
			contractName();
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

	public static class AssetTypeContext extends ParserRuleContext {
		public AssetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAssetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAssetType(this);
		}
	}

	public final AssetTypeContext assetType() throws RecognitionException {
		AssetTypeContext _localctx = new AssetTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assetType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class OnContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitOn(this);
		}
	}

	public final OnContext on() throws RecognitionException {
		OnContext _localctx = new OnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_on);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__29);
			setState(185);
			condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<FinalconditionContext> finalcondition() {
			return getRuleContexts(FinalconditionContext.class);
		}
		public FinalconditionContext finalcondition(int i) {
			return getRuleContext(FinalconditionContext.class,i);
		}
		public List<TerminalNode> LOGICALOPERATOR() { return getTokens(DecSolParser.LOGICALOPERATOR); }
		public TerminalNode LOGICALOPERATOR(int i) {
			return getToken(DecSolParser.LOGICALOPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			finalcondition();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(188);
				match(LOGICALOPERATOR);
				setState(189);
				finalcondition();
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

	public static class FinalconditionContext extends ParserRuleContext {
		public AssetConditionContext assetCondition() {
			return getRuleContext(AssetConditionContext.class,0);
		}
		public TimeConditionContext timeCondition() {
			return getRuleContext(TimeConditionContext.class,0);
		}
		public DateConditionContext dateCondition() {
			return getRuleContext(DateConditionContext.class,0);
		}
		public FinalconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterFinalcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitFinalcondition(this);
		}
	}

	public final FinalconditionContext finalcondition() throws RecognitionException {
		FinalconditionContext _localctx = new FinalconditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_finalcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(195);
				match(T__35);
				}
			}

			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(198);
				assetCondition();
				}
				break;
			case T__36:
				{
				setState(199);
				timeCondition();
				}
				break;
			case T__37:
				{
				setState(200);
				dateCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssetConditionContext extends ParserRuleContext {
		public AssetNameContext assetName() {
			return getRuleContext(AssetNameContext.class,0);
		}
		public TerminalNode CONDITIONALOPERATOR() { return getToken(DecSolParser.CONDITIONALOPERATOR, 0); }
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(DecSolParser.NUMBER, 0); }
		public AssetConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAssetCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAssetCondition(this);
		}
	}

	public final AssetConditionContext assetCondition() throws RecognitionException {
		AssetConditionContext _localctx = new AssetConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assetCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			assetName();
			setState(204);
			match(CONDITIONALOPERATOR);
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NAME) ) {
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

	public static class TimeConditionContext extends ParserRuleContext {
		public TerminalNode CONDITIONALOPERATOR() { return getToken(DecSolParser.CONDITIONALOPERATOR, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TimeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTimeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTimeCondition(this);
		}
	}

	public final TimeConditionContext timeCondition() throws RecognitionException {
		TimeConditionContext _localctx = new TimeConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_timeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__36);
			setState(208);
			match(CONDITIONALOPERATOR);
			setState(209);
			time();
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

	public static class DateConditionContext extends ParserRuleContext {
		public TerminalNode CONDITIONALOPERATOR() { return getToken(DecSolParser.CONDITIONALOPERATOR, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DateConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterDateCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitDateCondition(this);
		}
	}

	public final DateConditionContext dateCondition() throws RecognitionException {
		DateConditionContext _localctx = new DateConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dateCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__37);
			setState(212);
			match(CONDITIONALOPERATOR);
			setState(213);
			date();
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

	public static class AssetNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public AssetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAssetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAssetName(this);
		}
	}

	public final AssetNameContext assetName() throws RecognitionException {
		AssetNameContext _localctx = new AssetNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NAME);
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

	public static class TransactionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public TransactionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTransactionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTransactionName(this);
		}
	}

	public final TransactionNameContext transactionName() throws RecognitionException {
		TransactionNameContext _localctx = new TransactionNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_transactionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NAME);
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

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(NAME);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(NAME);
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

	public static class TokenIDContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public TokenIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTokenID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTokenID(this);
		}
	}

	public final TokenIDContext tokenID() throws RecognitionException {
		TokenIDContext _localctx = new TokenIDContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tokenID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(NAME);
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

	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitEventName(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NAME);
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

	public static class ContractNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public ContractNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterContractName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitContractName(this);
		}
	}

	public final ContractNameContext contractName() throws RecognitionException {
		ContractNameContext _localctx = new ContractNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_contractName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(NAME);
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

	public static class AmountContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitAmount(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(NAME);
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

	public static class WalletContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public WalletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wallet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterWallet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitWallet(this);
		}
	}

	public final WalletContext wallet() throws RecognitionException {
		WalletContext _localctx = new WalletContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_wallet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NAME);
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

	public static class ServiceNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DecSolParser.NAME, 0); }
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterServiceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitServiceName(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(NAME);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode HOURS() { return getToken(DecSolParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(DecSolParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(DecSolParser.SECONDS, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(HOURS);
			setState(236);
			match(T__38);
			setState(237);
			match(MINUTES);
			setState(238);
			match(T__38);
			setState(239);
			match(SECONDS);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(DecSolParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(DecSolParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(DecSolParser.YEAR, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecSolListener ) ((DecSolListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(DAY);
			setState(242);
			match(T__39);
			setState(243);
			match(MONTH);
			setState(244);
			match(T__39);
			setState(245);
			match(YEAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\5\5a\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00a3\n\r\f\r\16\r\u00a6\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\7\22\u00c1\n\22\f\22\16\22\u00c4\13\22\3\23"+
		"\5\23\u00c7\n\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\4\3\2#%\4\2++\65\65\2\u00eb"+
		"\2E\3\2\2\2\4I\3\2\2\2\6Q\3\2\2\2\bV\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16"+
		"s\3\2\2\2\20x\3\2\2\2\22\177\3\2\2\2\24\u0084\3\2\2\2\26\u008d\3\2\2\2"+
		"\30\u009c\3\2\2\2\32\u00a9\3\2\2\2\34\u00b2\3\2\2\2\36\u00b8\3\2\2\2 "+
		"\u00ba\3\2\2\2\"\u00bd\3\2\2\2$\u00c6\3\2\2\2&\u00cd\3\2\2\2(\u00d1\3"+
		"\2\2\2*\u00d5\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60\u00dd\3\2\2\2\62"+
		"\u00df\3\2\2\2\64\u00e1\3\2\2\2\66\u00e3\3\2\2\28\u00e5\3\2\2\2:\u00e7"+
		"\3\2\2\2<\u00e9\3\2\2\2>\u00eb\3\2\2\2@\u00ed\3\2\2\2B\u00f3\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IO\7\3\2\2"+
		"JP\5\6\4\2KP\5\34\17\2LP\5\b\5\2MP\5\32\16\2NP\5\26\f\2OJ\3\2\2\2OK\3"+
		"\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QR\7\4\2\2RT\58\35\2SU"+
		"\7\5\2\2TS\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VW\7\6\2\2WX\5.\30\2XY\7\7\2\2"+
		"YZ\58\35\2Z[\7\b\2\2[]\5\n\6\2\\^\5\30\r\2]\\\3\2\2\2]^\3\2\2\2^`\3\2"+
		"\2\2_a\5 \21\2`_\3\2\2\2`a\3\2\2\2a\t\3\2\2\2bc\7\t\2\2cm\5\f\7\2de\7"+
		"\n\2\2em\5\16\b\2fg\7\13\2\2gm\5\20\t\2hi\7\f\2\2im\5\22\n\2jk\7\r\2\2"+
		"km\5\24\13\2lb\3\2\2\2ld\3\2\2\2lf\3\2\2\2lh\3\2\2\2lj\3\2\2\2m\13\3\2"+
		"\2\2no\7\16\2\2op\5\62\32\2pq\7\17\2\2qr\5\60\31\2r\r\3\2\2\2st\7\16\2"+
		"\2tu\5\62\32\2uv\7\20\2\2vw\5\60\31\2w\17\3\2\2\2xy\7\21\2\2yz\5\64\33"+
		"\2z{\7\22\2\2{|\5\62\32\2|}\7\17\2\2}~\5\60\31\2~\21\3\2\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0081\5:\36\2\u0081\u0082\7\24\2\2\u0082\u0083\5<\37\2"+
		"\u0083\23\3\2\2\2\u0084\u0085\7\25\2\2\u0085\u0086\5> \2\u0086\u0087\7"+
		"\26\2\2\u0087\u008b\5:\36\2\u0088\u0089\7\27\2\2\u0089\u008a\7+\2\2\u008a"+
		"\u008c\7\30\2\2\u008b\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2"+
		"\2\u008d\u008e\7\31\2\2\u008e\u008f\5\66\34\2\u008f\u0090\7\32\2\2\u0090"+
		"\u0091\58\35\2\u0091\u0092\7\33\2\2\u0092\u0097\7\65\2\2\u0093\u0094\7"+
		"\34\2\2\u0094\u0096\7\65\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7\35\2\2\u009b\27\3\2\2\2\u009c\u009d\7\36\2\2\u009d"+
		"\u009e\5\66\34\2\u009e\u009f\7\33\2\2\u009f\u00a4\7\65\2\2\u00a0\u00a1"+
		"\7\34\2\2\u00a1\u00a3\7\65\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\37\2\2\u00aa"+
		"\u00ab\7\7\2\2\u00ab\u00ac\58\35\2\u00ac\u00ad\7 \2\2\u00ad\u00ae\5,\27"+
		"\2\u00ae\u00af\7!\2\2\u00af\u00b0\7+\2\2\u00b0\u00b1\7\30\2\2\u00b1\33"+
		"\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\5,\27\2"+
		"\u00b5\u00b6\7\7\2\2\u00b6\u00b7\58\35\2\u00b7\35\3\2\2\2\u00b8\u00b9"+
		"\t\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\5\"\22\2\u00bc"+
		"!\3\2\2\2\u00bd\u00c2\5$\23\2\u00be\u00bf\7\63\2\2\u00bf\u00c1\5$\23\2"+
		"\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7&\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00cc\5&\24\2\u00c9"+
		"\u00cc\5(\25\2\u00ca\u00cc\5*\26\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc%\3\2\2\2\u00cd\u00ce\5,\27\2\u00ce\u00cf"+
		"\7\64\2\2\u00cf\u00d0\t\3\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7\'\2\2\u00d2"+
		"\u00d3\7\64\2\2\u00d3\u00d4\5@!\2\u00d4)\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6"+
		"\u00d7\7\64\2\2\u00d7\u00d8\5B\"\2\u00d8+\3\2\2\2\u00d9\u00da\7\65\2\2"+
		"\u00da-\3\2\2\2\u00db\u00dc\7\65\2\2\u00dc/\3\2\2\2\u00dd\u00de\7\65\2"+
		"\2\u00de\61\3\2\2\2\u00df\u00e0\7\65\2\2\u00e0\63\3\2\2\2\u00e1\u00e2"+
		"\7\65\2\2\u00e2\65\3\2\2\2\u00e3\u00e4\7\65\2\2\u00e4\67\3\2\2\2\u00e5"+
		"\u00e6\7\65\2\2\u00e69\3\2\2\2\u00e7\u00e8\7\65\2\2\u00e8;\3\2\2\2\u00e9"+
		"\u00ea\7\65\2\2\u00ea=\3\2\2\2\u00eb\u00ec\7\65\2\2\u00ec?\3\2\2\2\u00ed"+
		"\u00ee\7\60\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7"+
		")\2\2\u00f1\u00f2\7\62\2\2\u00f2A\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5"+
		"\7*\2\2\u00f5\u00f6\7.\2\2\u00f6\u00f7\7*\2\2\u00f7\u00f8\7/\2\2\u00f8"+
		"C\3\2\2\2\16GOT]`l\u008b\u0097\u00a4\u00c2\u00c6\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}