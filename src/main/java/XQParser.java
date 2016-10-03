// Generated from XQParser.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSECURL=34, EQUALITY=26, DOUBLESLASH=4, WHERE=11, STAR=19, DOC=2, OPENSQ=23, 
		OPENBRACKET=5, FOR=9, SATISFIES=29, OPENCURL=33, DOUBLEDOT=21, NOT=17, 
		ID=36, AND=15, SINGLESLASH=3, VARNAME=38, EMPTY=30, CLOSEBRACKET=6, AT=22, 
		QUOTE=1, WS=35, IN=13, COMMA=7, IS=14, SOME=28, TXT=8, CLOSETAG=32, EQUAL=25, 
		OR=16, ASSIGN=27, RETURN=12, STRINGCONST=37, CLOSESQ=24, OPENTAG=31, EQ=18, 
		DOT=20, LET=10;
	public static final String[] tokenNames = {
		"<INVALID>", "QUOTE", "DOC", "'/'", "'//'", "'('", "')'", "','", "'text()'", 
		"FOR", "LET", "WHERE", "RETURN", "IN", "IS", "AND", "OR", "NOT", "EQ", 
		"'*'", "'.'", "'..'", "'@'", "'['", "']'", "'='", "'=='", "':='", "SOME", 
		"SATISFIES", "EMPTY", "OPENTAG", "'>'", "'{'", "'}'", "WS", "ID", "STRINGCONST", 
		"VARNAME"
	};
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_forClause = 3, RULE_letClause = 4, 
		RULE_whereClause = 5, RULE_returnClause = 6, RULE_cond = 7, RULE_xq = 8;
	public static final String[] ruleNames = {
		"ap", "rp", "f", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "xq"
	};

	@Override
	public String getGrammarFileName() { return "XQParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApDoubleSlashContext extends ApContext {
		public Token FILENAME;
		public TerminalNode STRINGCONST() { return getToken(XQParser.STRINGCONST, 0); }
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public TerminalNode DOC() { return getToken(XQParser.DOC, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(XQParser.DOUBLESLASH, 0); }
		public ApDoubleSlashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterApDoubleSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitApDoubleSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitApDoubleSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApSlashContext extends ApContext {
		public Token FILENAME;
		public TerminalNode STRINGCONST() { return getToken(XQParser.STRINGCONST, 0); }
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public TerminalNode DOC() { return getToken(XQParser.DOC, 0); }
		public TerminalNode SINGLESLASH() { return getToken(XQParser.SINGLESLASH, 0); }
		public ApSlashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterApSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitApSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitApSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApSlashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18); match(DOC);
				setState(19); match(OPENBRACKET);
				setState(20); ((ApSlashContext)_localctx).FILENAME = match(STRINGCONST);
				setState(21); match(CLOSEBRACKET);
				setState(22); match(SINGLESLASH);
				setState(23); rp(0);
				}
				break;

			case 2:
				_localctx = new ApDoubleSlashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24); match(DOC);
				setState(25); match(OPENBRACKET);
				setState(26); ((ApDoubleSlashContext)_localctx).FILENAME = match(STRINGCONST);
				setState(27); match(CLOSEBRACKET);
				setState(28); match(DOUBLESLASH);
				setState(29); rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RpParentContext extends RpContext {
		public TerminalNode DOUBLEDOT() { return getToken(XQParser.DOUBLEDOT, 0); }
		public RpParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpCurrContext extends RpContext {
		public TerminalNode DOT() { return getToken(XQParser.DOT, 0); }
		public RpCurrContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpCurr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpCurr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpCurr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpStarContext extends RpContext {
		public TerminalNode STAR() { return getToken(XQParser.STAR, 0); }
		public RpStarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpAttributeContext extends RpContext {
		public TerminalNode ID() { return getToken(XQParser.ID, 0); }
		public TerminalNode AT() { return getToken(XQParser.AT, 0); }
		public RpAttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends RpContext {
		public TerminalNode CLOSESQ() { return getToken(XQParser.CLOSESQ, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode OPENSQ() { return getToken(XQParser.OPENSQ, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpDoubleSlashContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DOUBLESLASH() { return getToken(XQParser.DOUBLESLASH, 0); }
		public RpDoubleSlashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpDoubleSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpDoubleSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpDoubleSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpBracketContext extends RpContext {
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpBracketContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpTagnameContext extends RpContext {
		public TerminalNode ID() { return getToken(XQParser.ID, 0); }
		public RpTagnameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpTagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpTagname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpTagname(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpSlashContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SINGLESLASH() { return getToken(XQParser.SINGLESLASH, 0); }
		public RpSlashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpCommaContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public TerminalNode COMMA() { return getToken(XQParser.COMMA, 0); }
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpCommaContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpComma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpTxtContext extends RpContext {
		public TerminalNode TXT() { return getToken(XQParser.TXT, 0); }
		public RpTxtContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterRpTxt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitRpTxt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitRpTxt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagnameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33); match(ID);
				}
				break;
			case STAR:
				{
				_localctx = new RpStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34); match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new RpCurrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35); match(DOT);
				}
				break;
			case DOUBLEDOT:
				{
				_localctx = new RpParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36); match(DOUBLEDOT);
				}
				break;
			case TXT:
				{
				_localctx = new RpTxtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37); match(TXT);
				}
				break;
			case AT:
				{
				_localctx = new RpAttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(AT);
				setState(39); match(ID);
				}
				break;
			case OPENBRACKET:
				{
				_localctx = new RpBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40); match(OPENBRACKET);
				setState(41); rp(0);
				setState(42); match(CLOSEBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashContext(new RpContext(_parentctx, _parentState));
						((RpSlashContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47); match(SINGLESLASH);
						setState(48); ((RpSlashContext)_localctx).right = rp(5);
						}
						break;

					case 2:
						{
						_localctx = new RpDoubleSlashContext(new RpContext(_parentctx, _parentState));
						((RpDoubleSlashContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50); match(DOUBLESLASH);
						setState(51); ((RpDoubleSlashContext)_localctx).right = rp(4);
						}
						break;

					case 3:
						{
						_localctx = new RpCommaContext(new RpContext(_parentctx, _parentState));
						((RpCommaContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(53); match(COMMA);
						setState(54); ((RpCommaContext)_localctx).right = rp(2);
						}
						break;

					case 4:
						{
						_localctx = new RpFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(55);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(56); match(OPENSQ);
						setState(57); f(0);
						setState(58); match(CLOSESQ);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FEqualContext extends FContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQParser.EQUAL, 0); }
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public FEqualContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FNotContext extends FContext {
		public TerminalNode NOT() { return getToken(XQParser.NOT, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FNotContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FAndContext extends FContext {
		public FContext left;
		public FContext right;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQParser.AND, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FAndContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FIsContext extends FContext {
		public RpContext left;
		public RpContext right;
		public TerminalNode EQUALITY() { return getToken(XQParser.EQUALITY, 0); }
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(XQParser.IS, 0); }
		public FIsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FRpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FBracketContext extends FContext {
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FBracketContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FOrContext extends FContext {
		public FContext left;
		public FContext right;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode OR() { return getToken(XQParser.OR, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FOrContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterFOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitFOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitFOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66); match(NOT);
				setState(67); f(1);
				}
				break;

			case 2:
				{
				_localctx = new FRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); rp(0);
				}
				break;

			case 3:
				{
				_localctx = new FEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69); ((FEqualContext)_localctx).left = rp(0);
				setState(70); match(EQUAL);
				setState(71); ((FEqualContext)_localctx).right = rp(0);
				}
				break;

			case 4:
				{
				_localctx = new FEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73); ((FEqualContext)_localctx).left = rp(0);
				setState(74); match(EQ);
				setState(75); ((FEqualContext)_localctx).right = rp(0);
				}
				break;

			case 5:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77); ((FIsContext)_localctx).left = rp(0);
				setState(78); match(EQUALITY);
				setState(79); ((FIsContext)_localctx).right = rp(0);
				}
				break;

			case 6:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); ((FIsContext)_localctx).left = rp(0);
				setState(82); match(IS);
				setState(83); ((FIsContext)_localctx).right = rp(0);
				}
				break;

			case 7:
				{
				_localctx = new FBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); match(OPENBRACKET);
				setState(86); f(0);
				setState(87); match(CLOSEBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						((FAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92); match(AND);
						setState(93); ((FAndContext)_localctx).right = f(4);
						}
						break;

					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						((FOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(94);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(95); match(OR);
						setState(96); ((FOrContext)_localctx).right = f(3);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<TerminalNode> IN() { return getTokens(XQParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(XQParser.IN, i);
		}
		public TerminalNode FOR() { return getToken(XQParser.FOR, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQParser.COMMA); }
		public List<TerminalNode> VARNAME() { return getTokens(XQParser.VARNAME); }
		public TerminalNode COMMA(int i) {
			return getToken(XQParser.COMMA, i);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VARNAME(int i) {
			return getToken(XQParser.VARNAME, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(FOR);
			setState(103); match(VARNAME);
			setState(104); match(IN);
			setState(105); xq(0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106); match(COMMA);
				setState(107); match(VARNAME);
				setState(108); match(IN);
				setState(109); xq(0);
				}
				}
				setState(114);
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

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XQParser.LET, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(XQParser.ASSIGN); }
		public List<TerminalNode> COMMA() { return getTokens(XQParser.COMMA); }
		public TerminalNode ASSIGN(int i) {
			return getToken(XQParser.ASSIGN, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(XQParser.VARNAME); }
		public TerminalNode COMMA(int i) {
			return getToken(XQParser.COMMA, i);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VARNAME(int i) {
			return getToken(XQParser.VARNAME, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(LET);
			setState(116); match(VARNAME);
			setState(117); match(ASSIGN);
			setState(118); xq(0);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119); match(COMMA);
				setState(120); match(VARNAME);
				setState(121); match(ASSIGN);
				setState(122); xq(0);
				}
				}
				setState(127);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(WHERE);
			setState(129); cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(XQParser.RETURN, 0); }
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(RETURN);
			setState(132); xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(XQParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondBracketContext extends CondContext {
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondBracketContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEqualContext extends CondContext {
		public XqContext left;
		public XqContext right;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public TerminalNode EQUAL() { return getToken(XQParser.EQUAL, 0); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public CondEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEBracketContext extends CondContext {
		public TerminalNode EMPTY() { return getToken(XQParser.EMPTY, 0); }
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public CondEBracketContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondEBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondEBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondEBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public TerminalNode AND() { return getToken(XQParser.AND, 0); }
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public TerminalNode OR() { return getToken(XQParser.OR, 0); }
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIsContext extends CondContext {
		public XqContext left;
		public XqContext right;
		public TerminalNode EQUALITY() { return getToken(XQParser.EQUALITY, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public TerminalNode IS() { return getToken(XQParser.IS, 0); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
		public List<TerminalNode> IN() { return getTokens(XQParser.IN); }
		public TerminalNode SOME() { return getToken(XQParser.SOME, 0); }
		public TerminalNode IN(int i) {
			return getToken(XQParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQParser.COMMA); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> VARNAME() { return getTokens(XQParser.VARNAME); }
		public TerminalNode COMMA(int i) {
			return getToken(XQParser.COMMA, i);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(XQParser.SATISFIES, 0); }
		public TerminalNode VARNAME(int i) {
			return getToken(XQParser.VARNAME, i);
		}
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135); match(SOME);
				setState(136); match(VARNAME);
				setState(137); match(IN);
				setState(138); xq(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139); match(COMMA);
					setState(140); match(VARNAME);
					setState(141); match(IN);
					setState(142); xq(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148); match(SATISFIES);
				setState(149); cond(5);
				}
				break;

			case 2:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151); match(NOT);
				setState(152); cond(1);
				}
				break;

			case 3:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); ((CondEqualContext)_localctx).left = xq(0);
				setState(154); match(EQUAL);
				setState(155); ((CondEqualContext)_localctx).right = xq(0);
				}
				break;

			case 4:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157); ((CondEqualContext)_localctx).left = xq(0);
				setState(158); match(EQ);
				setState(159); ((CondEqualContext)_localctx).right = xq(0);
				}
				break;

			case 5:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); ((CondIsContext)_localctx).left = xq(0);
				setState(162); match(EQUALITY);
				setState(163); ((CondIsContext)_localctx).right = xq(0);
				}
				break;

			case 6:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); ((CondIsContext)_localctx).left = xq(0);
				setState(166); match(IS);
				setState(167); ((CondIsContext)_localctx).right = xq(0);
				}
				break;

			case 7:
				{
				_localctx = new CondEBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169); match(EMPTY);
				setState(170); match(OPENBRACKET);
				setState(171); xq(0);
				setState(172); match(CLOSEBRACKET);
				}
				break;

			case 8:
				{
				_localctx = new CondBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(OPENBRACKET);
				setState(175); cond(0);
				setState(176); match(CLOSEBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181); match(AND);
						setState(182); ((CondAndContext)_localctx).right = cond(4);
						}
						break;

					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184); match(OR);
						setState(185); ((CondOrContext)_localctx).right = cond(3);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqDoubleSlashContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode DOUBLESLASH() { return getToken(XQParser.DOUBLESLASH, 0); }
		public XqDoubleSlashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqDoubleSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqDoubleSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqDoubleSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqCommaContext extends XqContext {
		public XqContext left;
		public XqContext right;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public TerminalNode COMMA() { return getToken(XQParser.COMMA, 0); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XqCommaContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqComma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqBracketContext extends XqContext {
		public TerminalNode OPENBRACKET() { return getToken(XQParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(XQParser.CLOSEBRACKET, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqBracketContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqComplexContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public XqComplexContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqLetContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqSlashContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode SINGLESLASH() { return getToken(XQParser.SINGLESLASH, 0); }
		public XqSlashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqStrContext extends XqContext {
		public TerminalNode STRINGCONST() { return getToken(XQParser.STRINGCONST, 0); }
		public XqStrContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XqApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqVarContext extends XqContext {
		public TerminalNode VARNAME() { return getToken(XQParser.VARNAME, 0); }
		public XqVarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqTagsContext extends XqContext {
		public TerminalNode CLOSECURL() { return getToken(XQParser.CLOSECURL, 0); }
		public TerminalNode OPENCURL() { return getToken(XQParser.OPENCURL, 0); }
		public List<TerminalNode> CLOSETAG() { return getTokens(XQParser.CLOSETAG); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public List<TerminalNode> OPENTAG() { return getTokens(XQParser.OPENTAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(XQParser.CLOSETAG, i);
		}
		public TerminalNode OPENTAG(int i) {
			return getToken(XQParser.OPENTAG, i);
		}
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public XqTagsContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).enterXqTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQParserListener ) ((XQParserListener)listener).exitXqTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQParserVisitor ) return ((XQParserVisitor<? extends T>)visitor).visitXqTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			switch (_input.LA(1)) {
			case LET:
				{
				_localctx = new XqLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(192); letClause();
				setState(193); xq(1);
				}
				break;
			case VARNAME:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); match(VARNAME);
				}
				break;
			case STRINGCONST:
				{
				_localctx = new XqStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(STRINGCONST);
				}
				break;
			case DOC:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); ap();
				}
				break;
			case OPENBRACKET:
				{
				_localctx = new XqBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(OPENBRACKET);
				setState(199); xq(0);
				setState(200); match(CLOSEBRACKET);
				}
				break;
			case OPENTAG:
				{
				_localctx = new XqTagsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); match(OPENTAG);
				setState(203); match(ID);
				setState(204); match(CLOSETAG);
				setState(205); match(OPENCURL);
				setState(206); xq(0);
				setState(207); match(CLOSECURL);
				setState(208); match(OPENTAG);
				setState(209); match(ID);
				setState(210); match(CLOSETAG);
				}
				break;
			case FOR:
				{
				_localctx = new XqComplexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); forClause();
				setState(214);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(213); letClause();
					}
				}

				setState(217);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(216); whereClause();
					}
				}

				setState(219); returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new XqCommaContext(new XqContext(_parentctx, _parentState));
						((XqCommaContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(223);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(224); match(COMMA);
						setState(225); ((XqCommaContext)_localctx).right = xq(7);
						}
						break;

					case 2:
						{
						_localctx = new XqSlashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(227); match(SINGLESLASH);
						setState(228); rp(0);
						}
						break;

					case 3:
						{
						_localctx = new XqDoubleSlashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(229);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(230); match(DOUBLESLASH);
						setState(231); rp(0);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return rp_sempred((RpContext)_localctx, predIndex);

		case 2: return f_sempred((FContext)_localctx, predIndex);

		case 7: return cond_sempred((CondContext)_localctx, predIndex);

		case 8: return xq_sempred((XqContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);

		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 6);

		case 9: return precpred(_ctx, 5);

		case 10: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00d9\n\n\3\n\5\n\u00dc\n\n\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee\13\n\3\n\2\6\4\6\20\22"+
		"\13\2\4\6\b\n\f\16\20\22\2\2\u0110\2 \3\2\2\2\4.\3\2\2\2\6[\3\2\2\2\b"+
		"h\3\2\2\2\nu\3\2\2\2\f\u0082\3\2\2\2\16\u0085\3\2\2\2\20\u00b4\3\2\2\2"+
		"\22\u00df\3\2\2\2\24\25\7\4\2\2\25\26\7\7\2\2\26\27\7\'\2\2\27\30\7\b"+
		"\2\2\30\31\7\5\2\2\31!\5\4\3\2\32\33\7\4\2\2\33\34\7\7\2\2\34\35\7\'\2"+
		"\2\35\36\7\b\2\2\36\37\7\6\2\2\37!\5\4\3\2 \24\3\2\2\2 \32\3\2\2\2!\3"+
		"\3\2\2\2\"#\b\3\1\2#/\7&\2\2$/\7\25\2\2%/\7\26\2\2&/\7\27\2\2\'/\7\n\2"+
		"\2()\7\30\2\2)/\7&\2\2*+\7\7\2\2+,\5\4\3\2,-\7\b\2\2-/\3\2\2\2.\"\3\2"+
		"\2\2.$\3\2\2\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.*\3\2\2\2/@\3"+
		"\2\2\2\60\61\f\6\2\2\61\62\7\5\2\2\62?\5\4\3\7\63\64\f\5\2\2\64\65\7\6"+
		"\2\2\65?\5\4\3\6\66\67\f\3\2\2\678\7\t\2\28?\5\4\3\49:\f\4\2\2:;\7\31"+
		"\2\2;<\5\6\4\2<=\7\32\2\2=?\3\2\2\2>\60\3\2\2\2>\63\3\2\2\2>\66\3\2\2"+
		"\2>9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2B@\3\2\2\2CD\b\4"+
		"\1\2DE\7\23\2\2E\\\5\6\4\3F\\\5\4\3\2GH\5\4\3\2HI\7\33\2\2IJ\5\4\3\2J"+
		"\\\3\2\2\2KL\5\4\3\2LM\7\24\2\2MN\5\4\3\2N\\\3\2\2\2OP\5\4\3\2PQ\7\34"+
		"\2\2QR\5\4\3\2R\\\3\2\2\2ST\5\4\3\2TU\7\20\2\2UV\5\4\3\2V\\\3\2\2\2WX"+
		"\7\7\2\2XY\5\6\4\2YZ\7\b\2\2Z\\\3\2\2\2[C\3\2\2\2[F\3\2\2\2[G\3\2\2\2"+
		"[K\3\2\2\2[O\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\e\3\2\2\2]^\f\5\2\2^_\7\21\2"+
		"\2_d\5\6\4\6`a\f\4\2\2ab\7\22\2\2bd\5\6\4\5c]\3\2\2\2c`\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\7\13\2\2ij\7(\2\2jk\7"+
		"\17\2\2kr\5\22\n\2lm\7\t\2\2mn\7(\2\2no\7\17\2\2oq\5\22\n\2pl\3\2\2\2"+
		"qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tr\3\2\2\2uv\7\f\2\2vw\7(\2\2"+
		"wx\7\35\2\2x\177\5\22\n\2yz\7\t\2\2z{\7(\2\2{|\7\35\2\2|~\5\22\n\2}y\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\13\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\7\r\2\2\u0083\u0084\5\20\t\2\u0084\r\3"+
		"\2\2\2\u0085\u0086\7\16\2\2\u0086\u0087\5\22\n\2\u0087\17\3\2\2\2\u0088"+
		"\u0089\b\t\1\2\u0089\u008a\7\36\2\2\u008a\u008b\7(\2\2\u008b\u008c\7\17"+
		"\2\2\u008c\u0093\5\22\n\2\u008d\u008e\7\t\2\2\u008e\u008f\7(\2\2\u008f"+
		"\u0090\7\17\2\2\u0090\u0092\5\22\n\2\u0091\u008d\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\20\t\7\u0098\u00b5\3"+
		"\2\2\2\u0099\u009a\7\23\2\2\u009a\u00b5\5\20\t\3\u009b\u009c\5\22\n\2"+
		"\u009c\u009d\7\33\2\2\u009d\u009e\5\22\n\2\u009e\u00b5\3\2\2\2\u009f\u00a0"+
		"\5\22\n\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00b5\3\2\2"+
		"\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\5\22\n\2\u00a6"+
		"\u00b5\3\2\2\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\5"+
		"\22\n\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\7\7\2\2\u00ad"+
		"\u00ae\5\22\n\2\u00ae\u00af\7\b\2\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\7"+
		"\7\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7\b\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u0088\3\2\2\2\u00b4\u0099\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u009f\3\2"+
		"\2\2\u00b4\u00a3\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\7\21"+
		"\2\2\u00b8\u00bd\5\20\t\6\u00b9\u00ba\f\4\2\2\u00ba\u00bb\7\22\2\2\u00bb"+
		"\u00bd\5\20\t\5\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\21\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\n\1\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\5\22"+
		"\n\3\u00c4\u00e0\3\2\2\2\u00c5\u00e0\7(\2\2\u00c6\u00e0\7\'\2\2\u00c7"+
		"\u00e0\5\2\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\7"+
		"\b\2\2\u00cb\u00e0\3\2\2\2\u00cc\u00cd\7!\2\2\u00cd\u00ce\7&\2\2\u00ce"+
		"\u00cf\7\"\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2\7$"+
		"\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00e0"+
		"\3\2\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d9\5\n\6\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\5\f\7\2\u00db\u00da\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\5\16\b\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00c1\3\2\2\2\u00df\u00c5\3\2\2\2\u00df\u00c6\3\2"+
		"\2\2\u00df\u00c7\3\2\2\2\u00df\u00c8\3\2\2\2\u00df\u00cc\3\2\2\2\u00df"+
		"\u00d6\3\2\2\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\f\b\2\2\u00e2\u00e3\7\t"+
		"\2\2\u00e3\u00eb\5\22\n\t\u00e4\u00e5\f\7\2\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00eb\5\4\3\2\u00e7\u00e8\f\6\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\5\4"+
		"\3\2\u00ea\u00e1\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\23\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\24 .>@[cer\177\u0093\u00b4\u00bc\u00be\u00d8\u00db"+
		"\u00df\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}