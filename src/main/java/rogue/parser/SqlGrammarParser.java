// Generated from SqlGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, SELECT=23, FROM=24, 
		WHERE=25, GROUP=26, BY=27, HAVING=28, ORDER=29, LIMIT=30, JOIN=31, ON=32, 
		RIGHT=33, LEFT=34, SKIPED=35, INNER=36, FULL=37, OUTER=38, CROSS=39, DESC=40, 
		ASC=41, AS=42, RANK=43, DENSE_RANK=44, ROW_NUMBER=45, NTILE=46, LEAD=47, 
		LAG=48, FIRST_VALUE=49, LAST_VALUE=50, NTH_VALUE=51, PERCENT_RANK=52, 
		CUME_DIST=53, OVER=54, PARTITION=55, ROWS=56, RANGE=57, GROUPS=58, UNBOUNDED=59, 
		PRECEDING=60, FOLLOWING=61, CURRENT=62, ROW=63, DISTINCT=64, WITH=65, 
		RECURSIVE=66, UNION=67, ALL=68, INTERSECT=69, EXCEPT=70, COUNT=71, SUM=72, 
		AVG=73, MIN=74, MAX=75, GROUP_CONCAT=76, AND=77, OR=78, NOT=79, LIKE=80, 
		ILIKE=81, SIMILAR=82, TO=83, IN=84, IS=85, NULL=86, TRUE=87, FALSE=88, 
		BETWEEN=89, CASE=90, WHEN=91, THEN=92, ELSE=93, END=94, FOR=95, UPDATE=96, 
		NOWAIT=97, USING=98, LOCKED=99, ID=100, STRING=101, INT=102, DOUBLE=103, 
		WS=104, LINE_COMMENT=105, MULTILINE_COMMENT=106;
	public static final int
		RULE_start = 0, RULE_dml = 1, RULE_select = 2, RULE_cte = 3, RULE_select_statement1 = 4, 
		RULE_select_statement2 = 5, RULE_selectItem = 6, RULE_windowFunction = 7, 
		RULE_frameClause = 8, RULE_frameBound = 9, RULE_tableExpression = 10, 
		RULE_tableReference = 11, RULE_join = 12, RULE_joinTypeSpec = 13, RULE_whereClause = 14, 
		RULE_groupByClause = 15, RULE_havingClause = 16, RULE_setOperation = 17, 
		RULE_orderByClause = 18, RULE_orderByItem = 19, RULE_limitClause = 20, 
		RULE_forUpdateClause = 21, RULE_expression = 22, RULE_caseExpression = 23, 
		RULE_functionCall = 24, RULE_columnReference = 25, RULE_literal = 26, 
		RULE_aggregationFunction = 27, RULE_windowOnlyFunction = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dml", "select", "cte", "select_statement1", "select_statement2", 
			"selectItem", "windowFunction", "frameClause", "frameBound", "tableExpression", 
			"tableReference", "join", "joinTypeSpec", "whereClause", "groupByClause", 
			"havingClause", "setOperation", "orderByClause", "orderByItem", "limitClause", 
			"forUpdateClause", "expression", "caseExpression", "functionCall", "columnReference", 
			"literal", "aggregationFunction", "windowOnlyFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "';'", "'OFFSET'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", "'<>'", "'~'", "'~*'", 
			"'!~'", "'!~*'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", "LIMIT", "JOIN", "ON", 
			"RIGHT", "LEFT", "SKIPED", "INNER", "FULL", "OUTER", "CROSS", "DESC", 
			"ASC", "AS", "RANK", "DENSE_RANK", "ROW_NUMBER", "NTILE", "LEAD", "LAG", 
			"FIRST_VALUE", "LAST_VALUE", "NTH_VALUE", "PERCENT_RANK", "CUME_DIST", 
			"OVER", "PARTITION", "ROWS", "RANGE", "GROUPS", "UNBOUNDED", "PRECEDING", 
			"FOLLOWING", "CURRENT", "ROW", "DISTINCT", "WITH", "RECURSIVE", "UNION", 
			"ALL", "INTERSECT", "EXCEPT", "COUNT", "SUM", "AVG", "MIN", "MAX", "GROUP_CONCAT", 
			"AND", "OR", "NOT", "LIKE", "ILIKE", "SIMILAR", "TO", "IN", "IS", "NULL", 
			"TRUE", "FALSE", "BETWEEN", "CASE", "WHEN", "THEN", "ELSE", "END", "FOR", 
			"UPDATE", "NOWAIT", "USING", "LOCKED", "ID", "STRING", "INT", "DOUBLE", 
			"WS", "LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "SqlGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public DmlContext dml() {
			return getRuleContext(DmlContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			dml();
			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DmlContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public DmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitDml(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			select();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlGrammarParser.WITH, 0); }
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public Select_statement2Context select_statement2() {
			return getRuleContext(Select_statement2Context.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlGrammarParser.RECURSIVE, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(WITH);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECURSIVE) {
					{
					setState(64);
					match(RECURSIVE);
					}
				}

				setState(67);
				cte();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(68);
					match(T__0);
					setState(69);
					cte();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				select_statement2();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				select_statement2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Token id;
		public TerminalNode AS() { return getToken(SqlGrammarParser.AS, 0); }
		public Select_statement1Context select_statement1() {
			return getRuleContext(Select_statement1Context.class,0);
		}
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((CteContext)_localctx).id = match(ID);
			setState(81);
			match(AS);
			setState(82);
			match(T__1);
			setState(83);
			select_statement1();
			setState(84);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statement1Context extends ParserRuleContext {
		public Token distinct;
		public SelectItemContext columns;
		public TableExpressionContext from;
		public JoinContext join;
		public List<JoinContext> joins = new ArrayList<JoinContext>();
		public WhereClauseContext where;
		public GroupByClauseContext groupBy;
		public HavingClauseContext having;
		public OrderByClauseContext orderBy;
		public SetOperationContext setOp;
		public LimitClauseContext limit;
		public ForUpdateClauseContext forUpdate;
		public TerminalNode SELECT() { return getToken(SqlGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlGrammarParser.FROM, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public List<Select_statement1Context> select_statement1() {
			return getRuleContexts(Select_statement1Context.class);
		}
		public Select_statement1Context select_statement1(int i) {
			return getRuleContext(Select_statement1Context.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(SqlGrammarParser.DISTINCT, 0); }
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SetOperationContext setOperation() {
			return getRuleContext(SetOperationContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public ForUpdateClauseContext forUpdateClause() {
			return getRuleContext(ForUpdateClauseContext.class,0);
		}
		public Select_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterSelect_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitSelect_statement1(this);
		}
	}

	public final Select_statement1Context select_statement1() throws RecognitionException {
		Select_statement1Context _localctx = new Select_statement1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_statement1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(SELECT);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(87);
				((Select_statement1Context)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(90);
			((Select_statement1Context)_localctx).columns = selectItem();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(91);
				match(T__0);
				setState(92);
				selectItem();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(FROM);
			setState(99);
			((Select_statement1Context)_localctx).from = tableExpression();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 783831531520L) != 0)) {
				{
				{
				setState(100);
				((Select_statement1Context)_localctx).join = join();
				((Select_statement1Context)_localctx).joins.add(((Select_statement1Context)_localctx).join);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(106);
				((Select_statement1Context)_localctx).where = whereClause();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(109);
				((Select_statement1Context)_localctx).groupBy = groupByClause();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(112);
				((Select_statement1Context)_localctx).having = havingClause();
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(115);
				((Select_statement1Context)_localctx).orderBy = orderByClause();
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 13L) != 0)) {
				{
				setState(118);
				((Select_statement1Context)_localctx).setOp = setOperation();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(121);
				((Select_statement1Context)_localctx).limit = limitClause();
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(124);
				((Select_statement1Context)_localctx).forUpdate = forUpdateClause();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					select_statement1();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statement2Context extends ParserRuleContext {
		public Token distinct;
		public SelectItemContext columns;
		public TableExpressionContext from;
		public JoinContext join;
		public List<JoinContext> joins = new ArrayList<JoinContext>();
		public WhereClauseContext where;
		public GroupByClauseContext groupBy;
		public HavingClauseContext having;
		public OrderByClauseContext orderBy;
		public SetOperationContext setOp;
		public LimitClauseContext limit;
		public ForUpdateClauseContext forUpdate;
		public TerminalNode SELECT() { return getToken(SqlGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlGrammarParser.FROM, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlGrammarParser.DISTINCT, 0); }
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SetOperationContext setOperation() {
			return getRuleContext(SetOperationContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public ForUpdateClauseContext forUpdateClause() {
			return getRuleContext(ForUpdateClauseContext.class,0);
		}
		public Select_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterSelect_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitSelect_statement2(this);
		}
	}

	public final Select_statement2Context select_statement2() throws RecognitionException {
		Select_statement2Context _localctx = new Select_statement2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SELECT);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(134);
				((Select_statement2Context)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(137);
			((Select_statement2Context)_localctx).columns = selectItem();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(138);
				match(T__0);
				setState(139);
				selectItem();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(FROM);
			setState(146);
			((Select_statement2Context)_localctx).from = tableExpression();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 783831531520L) != 0)) {
				{
				{
				setState(147);
				((Select_statement2Context)_localctx).join = join();
				((Select_statement2Context)_localctx).joins.add(((Select_statement2Context)_localctx).join);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(153);
				((Select_statement2Context)_localctx).where = whereClause();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(156);
				((Select_statement2Context)_localctx).groupBy = groupByClause();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(159);
				((Select_statement2Context)_localctx).having = havingClause();
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(162);
				((Select_statement2Context)_localctx).orderBy = orderByClause();
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 13L) != 0)) {
				{
				setState(165);
				((Select_statement2Context)_localctx).setOp = setOperation();
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(168);
				((Select_statement2Context)_localctx).limit = limitClause();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(171);
				((Select_statement2Context)_localctx).forUpdate = forUpdateClause();
				}
			}

			setState(174);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public Token alias;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public TerminalNode AS() { return getToken(SqlGrammarParser.AS, 0); }
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitSelectItem(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectItem);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				expression(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(177);
						match(AS);
						}
					}

					setState(180);
					((SelectItemContext)_localctx).alias = match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				windowFunction();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(184);
						match(AS);
						}
					}

					setState(187);
					((SelectItemContext)_localctx).alias = match(ID);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFunctionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> partitionExpr = new ArrayList<ExpressionContext>();
		public OrderByItemContext orderByItem;
		public List<OrderByItemContext> orderItems = new ArrayList<OrderByItemContext>();
		public TerminalNode OVER() { return getToken(SqlGrammarParser.OVER, 0); }
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public WindowOnlyFunctionContext windowOnlyFunction() {
			return getRuleContext(WindowOnlyFunctionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlGrammarParser.DISTINCT, 0); }
		public TerminalNode PARTITION() { return getToken(SqlGrammarParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlGrammarParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlGrammarParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlGrammarParser.ORDER, 0); }
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitWindowFunction(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case GROUP_CONCAT:
				{
				setState(192);
				aggregationFunction();
				}
				break;
			case RANK:
			case DENSE_RANK:
			case ROW_NUMBER:
			case NTILE:
			case LEAD:
			case LAG:
			case FIRST_VALUE:
			case LAST_VALUE:
			case NTH_VALUE:
			case PERCENT_RANK:
			case CUME_DIST:
				{
				setState(193);
				windowOnlyFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(196);
			match(T__1);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(197);
				match(DISTINCT);
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18005602416459844L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 8053817663L) != 0)) {
				{
				setState(200);
				((WindowFunctionContext)_localctx).expression = expression(0);
				((WindowFunctionContext)_localctx).args.add(((WindowFunctionContext)_localctx).expression);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(201);
					match(T__0);
					setState(202);
					((WindowFunctionContext)_localctx).expression = expression(0);
					((WindowFunctionContext)_localctx).args.add(((WindowFunctionContext)_localctx).expression);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(210);
			match(T__2);
			setState(211);
			match(OVER);
			setState(212);
			match(T__1);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(213);
				match(PARTITION);
				setState(214);
				match(BY);
				setState(215);
				((WindowFunctionContext)_localctx).expression = expression(0);
				((WindowFunctionContext)_localctx).partitionExpr.add(((WindowFunctionContext)_localctx).expression);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(216);
					match(T__0);
					setState(217);
					((WindowFunctionContext)_localctx).expression = expression(0);
					((WindowFunctionContext)_localctx).partitionExpr.add(((WindowFunctionContext)_localctx).expression);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(225);
				match(ORDER);
				setState(226);
				match(BY);
				setState(227);
				((WindowFunctionContext)_localctx).orderByItem = orderByItem();
				((WindowFunctionContext)_localctx).orderItems.add(((WindowFunctionContext)_localctx).orderByItem);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(228);
					match(T__0);
					setState(229);
					((WindowFunctionContext)_localctx).orderByItem = orderByItem();
					((WindowFunctionContext)_localctx).orderItems.add(((WindowFunctionContext)_localctx).orderByItem);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) {
				{
				setState(237);
				frameClause();
				}
			}

			setState(240);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FrameClauseContext extends ParserRuleContext {
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(SqlGrammarParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlGrammarParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(SqlGrammarParser.GROUPS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlGrammarParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlGrammarParser.AND, 0); }
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterFrameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitFrameClause(this);
		}
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_frameClause);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(BETWEEN);
				setState(246);
				frameBound();
				setState(247);
				match(AND);
				setState(248);
				frameBound();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SqlGrammarParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlGrammarParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlGrammarParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlGrammarParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlGrammarParser.ROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitFrameBound(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_frameBound);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(UNBOUNDED);
				setState(253);
				match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(UNBOUNDED);
				setState(255);
				match(FOLLOWING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(CURRENT);
				setState(257);
				match(ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				expression(0);
				setState(259);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				expression(0);
				setState(262);
				match(FOLLOWING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableExpressionContext extends ParserRuleContext {
		public Token alias;
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public TerminalNode AS() { return getToken(SqlGrammarParser.AS, 0); }
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitTableExpression(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			tableReference();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(267);
					match(AS);
					}
				}

				setState(270);
				((TableExpressionContext)_localctx).alias = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public Token alias;
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SqlGrammarParser.STRING, 0); }
		public Select_statement2Context select_statement2() {
			return getRuleContext(Select_statement2Context.class,0);
		}
		public TerminalNode AS() { return getToken(SqlGrammarParser.AS, 0); }
		public Select_statement1Context select_statement1() {
			return getRuleContext(Select_statement1Context.class,0);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitTableReference(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableReference);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__1);
				setState(276);
				select_statement2();
				setState(277);
				match(T__2);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(278);
						match(AS);
						}
					}

					setState(281);
					((TableReferenceContext)_localctx).alias = match(ID);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(T__1);
				setState(285);
				select_statement1();
				setState(286);
				match(T__2);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(287);
						match(AS);
						}
					}

					setState(290);
					((TableReferenceContext)_localctx).alias = match(ID);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinContext extends ParserRuleContext {
		public JoinTypeSpecContext joinType;
		public TableExpressionContext right;
		public ExpressionContext condition;
		public TerminalNode JOIN() { return getToken(SqlGrammarParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SqlGrammarParser.ON, 0); }
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JoinTypeSpecContext joinTypeSpec() {
			return getRuleContext(JoinTypeSpecContext.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 781684047872L) != 0)) {
				{
				setState(295);
				((JoinContext)_localctx).joinType = joinTypeSpec();
				}
			}

			setState(298);
			match(JOIN);
			setState(299);
			((JoinContext)_localctx).right = tableExpression();
			setState(300);
			match(ON);
			setState(301);
			((JoinContext)_localctx).condition = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeSpecContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(SqlGrammarParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(SqlGrammarParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(SqlGrammarParser.INNER, 0); }
		public TerminalNode FULL() { return getToken(SqlGrammarParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SqlGrammarParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(SqlGrammarParser.CROSS, 0); }
		public JoinTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterJoinTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitJoinTypeSpec(this);
		}
	}

	public final JoinTypeSpecContext joinTypeSpec() throws RecognitionException {
		JoinTypeSpecContext _localctx = new JoinTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_joinTypeSpec);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(LEFT);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(INNER);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(FULL);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(307);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(CROSS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode WHERE() { return getToken(SqlGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHERE);
			setState(314);
			((WhereClauseContext)_localctx).condition = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(SqlGrammarParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlGrammarParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(GROUP);
			setState(317);
			match(BY);
			setState(318);
			((GroupByClauseContext)_localctx).expression = expression(0);
			((GroupByClauseContext)_localctx).expressions.add(((GroupByClauseContext)_localctx).expression);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(319);
				match(T__0);
				setState(320);
				((GroupByClauseContext)_localctx).expression = expression(0);
				((GroupByClauseContext)_localctx).expressions.add(((GroupByClauseContext)_localctx).expression);
				}
				}
				setState(325);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode HAVING() { return getToken(SqlGrammarParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(HAVING);
			setState(327);
			((HavingClauseContext)_localctx).condition = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(SqlGrammarParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(SqlGrammarParser.ALL, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlGrammarParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlGrammarParser.EXCEPT, 0); }
		public SetOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitSetOperation(this);
		}
	}

	public final SetOperationContext setOperation() throws RecognitionException {
		SetOperationContext _localctx = new SetOperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_setOperation);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(UNION);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(330);
					match(ALL);
					}
				}

				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(EXCEPT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderByItemContext orderByItem;
		public List<OrderByItemContext> orderItems = new ArrayList<OrderByItemContext>();
		public TerminalNode ORDER() { return getToken(SqlGrammarParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlGrammarParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ORDER);
			setState(338);
			match(BY);
			setState(339);
			((OrderByClauseContext)_localctx).orderByItem = orderByItem();
			((OrderByClauseContext)_localctx).orderItems.add(((OrderByClauseContext)_localctx).orderByItem);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(340);
				match(T__0);
				setState(341);
				((OrderByClauseContext)_localctx).orderByItem = orderByItem();
				((OrderByClauseContext)_localctx).orderItems.add(((OrderByClauseContext)_localctx).orderByItem);
				}
				}
				setState(346);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlGrammarParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlGrammarParser.DESC, 0); }
		public TerminalNode USING() { return getToken(SqlGrammarParser.USING, 0); }
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitOrderByItem(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expression(0);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 288230376151711747L) != 0)) {
				{
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASC:
					{
					setState(348);
					match(ASC);
					}
					break;
				case DESC:
					{
					setState(349);
					match(DESC);
					}
					break;
				case USING:
					{
					setState(350);
					match(USING);
					setState(351);
					((OrderByItemContext)_localctx).operator = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public Token count;
		public Token offset;
		public TerminalNode LIMIT() { return getToken(SqlGrammarParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(SqlGrammarParser.ALL, 0); }
		public List<TerminalNode> INT() { return getTokens(SqlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SqlGrammarParser.INT, i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitLimitClause(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LIMIT);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(357);
				((LimitClauseContext)_localctx).count = match(INT);
				}
				break;
			case ALL:
				{
				setState(358);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==INT) {
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(361);
					match(T__4);
					}
				}

				setState(364);
				((LimitClauseContext)_localctx).offset = match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateClauseContext extends ParserRuleContext {
		public Token ID;
		public List<Token> tableList = new ArrayList<Token>();
		public TerminalNode FOR() { return getToken(SqlGrammarParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(SqlGrammarParser.UPDATE, 0); }
		public TerminalNode NOWAIT() { return getToken(SqlGrammarParser.NOWAIT, 0); }
		public TerminalNode SKIPED() { return getToken(SqlGrammarParser.SKIPED, 0); }
		public TerminalNode LOCKED() { return getToken(SqlGrammarParser.LOCKED, 0); }
		public List<TerminalNode> ID() { return getTokens(SqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlGrammarParser.ID, i);
		}
		public ForUpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterForUpdateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitForUpdateClause(this);
		}
	}

	public final ForUpdateClauseContext forUpdateClause() throws RecognitionException {
		ForUpdateClauseContext _localctx = new ForUpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forUpdateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(FOR);
			setState(368);
			match(UPDATE);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(369);
				((ForUpdateClauseContext)_localctx).ID = match(ID);
				((ForUpdateClauseContext)_localctx).tableList.add(((ForUpdateClauseContext)_localctx).ID);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(370);
					match(T__0);
					setState(371);
					((ForUpdateClauseContext)_localctx).ID = match(ID);
					((ForUpdateClauseContext)_localctx).tableList.add(((ForUpdateClauseContext)_localctx).ID);
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOWAIT:
				{
				setState(379);
				match(NOWAIT);
				}
				break;
			case SKIPED:
				{
				setState(380);
				match(SKIPED);
				setState(381);
				match(LOCKED);
				}
				break;
			case T__2:
			case T__3:
			case SELECT:
				break;
			default:
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext lower;
		public ExpressionContext upper;
		public Token inExpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlGrammarParser.NOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlGrammarParser.OR, 0); }
		public TerminalNode LIKE() { return getToken(SqlGrammarParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlGrammarParser.ILIKE, 0); }
		public TerminalNode SIMILAR() { return getToken(SqlGrammarParser.SIMILAR, 0); }
		public TerminalNode TO() { return getToken(SqlGrammarParser.TO, 0); }
		public TerminalNode IS() { return getToken(SqlGrammarParser.IS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlGrammarParser.BETWEEN, 0); }
		public TerminalNode IN() { return getToken(SqlGrammarParser.IN, 0); }
		public Select_statement1Context select_statement1() {
			return getRuleContext(Select_statement1Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(385);
				match(T__1);
				setState(386);
				expression(0);
				setState(387);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(389);
				match(NOT);
				setState(390);
				expression(14);
				}
				break;
			case 3:
				{
				setState(391);
				functionCall();
				}
				break;
			case 4:
				{
				setState(392);
				windowFunction();
				}
				break;
			case 5:
				{
				setState(393);
				columnReference();
				}
				break;
			case 6:
				{
				setState(394);
				literal();
				}
				break;
			case 7:
				{
				setState(395);
				caseExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(399);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(400);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(402);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(403);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(405);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4192256L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(406);
						((ExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(408);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(409);
						((ExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(410);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(415);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LIKE:
							{
							setState(411);
							match(LIKE);
							}
							break;
						case ILIKE:
							{
							setState(412);
							match(ILIKE);
							}
							break;
						case SIMILAR:
							{
							setState(413);
							match(SIMILAR);
							setState(414);
							match(TO);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(417);
						((ExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(419);
						((ExpressionContext)_localctx).op = match(IS);
						setState(421);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(420);
							match(NOT);
							}
							break;
						}
						setState(423);
						((ExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(424);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(425);
						((ExpressionContext)_localctx).op = match(BETWEEN);
						setState(426);
						((ExpressionContext)_localctx).lower = expression(0);
						setState(427);
						match(AND);
						setState(428);
						((ExpressionContext)_localctx).upper = expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(431);
						((ExpressionContext)_localctx).op = match(IN);
						setState(432);
						((ExpressionContext)_localctx).inExpr = match(T__1);
						setState(442);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SELECT:
							{
							setState(433);
							select_statement1();
							}
							break;
						case T__1:
						case T__5:
						case RANK:
						case DENSE_RANK:
						case ROW_NUMBER:
						case NTILE:
						case LEAD:
						case LAG:
						case FIRST_VALUE:
						case LAST_VALUE:
						case NTH_VALUE:
						case PERCENT_RANK:
						case CUME_DIST:
						case COUNT:
						case SUM:
						case AVG:
						case MIN:
						case MAX:
						case GROUP_CONCAT:
						case NOT:
						case NULL:
						case TRUE:
						case FALSE:
						case CASE:
						case ID:
						case STRING:
						case INT:
						case DOUBLE:
							{
							setState(434);
							expression(0);
							setState(439);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(435);
								match(T__0);
								setState(436);
								expression(0);
								}
								}
								setState(441);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(444);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public ExpressionContext caseExpr;
		public ExpressionContext expression;
		public List<ExpressionContext> whenExpr = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> thenExpr = new ArrayList<ExpressionContext>();
		public ExpressionContext elseExpr;
		public TerminalNode CASE() { return getToken(SqlGrammarParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlGrammarParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(SqlGrammarParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(SqlGrammarParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(SqlGrammarParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(SqlGrammarParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(SqlGrammarParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitCaseExpression(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(CASE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18005602416459844L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 8053817663L) != 0)) {
				{
				setState(452);
				((CaseExpressionContext)_localctx).caseExpr = expression(0);
				}
			}

			setState(460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(455);
				match(WHEN);
				setState(456);
				((CaseExpressionContext)_localctx).expression = expression(0);
				((CaseExpressionContext)_localctx).whenExpr.add(((CaseExpressionContext)_localctx).expression);
				setState(457);
				match(THEN);
				setState(458);
				((CaseExpressionContext)_localctx).expression = expression(0);
				((CaseExpressionContext)_localctx).thenExpr.add(((CaseExpressionContext)_localctx).expression);
				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(464);
				match(ELSE);
				setState(465);
				((CaseExpressionContext)_localctx).elseExpr = expression(0);
				}
			}

			setState(468);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public ExpressionContext arg;
		public TerminalNode ID() { return getToken(SqlGrammarParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(SqlGrammarParser.DISTINCT, 0); }
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				((FunctionCallContext)_localctx).name = match(ID);
				setState(471);
				match(T__1);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(472);
					match(DISTINCT);
					}
				}

				setState(475);
				((FunctionCallContext)_localctx).expression = expression(0);
				((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(476);
					match(T__0);
					setState(477);
					((FunctionCallContext)_localctx).expression = expression(0);
					((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(T__2);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case GROUP_CONCAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				aggregationFunction();
				setState(486);
				match(T__1);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(487);
					match(DISTINCT);
					}
				}

				setState(490);
				((FunctionCallContext)_localctx).arg = expression(0);
				setState(491);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends ParserRuleContext {
		public Token table;
		public Token column;
		public List<TerminalNode> ID() { return getTokens(SqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlGrammarParser.ID, i);
		}
		public ColumnReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitColumnReference(this);
		}
	}

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_columnReference);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(495);
					((ColumnReferenceContext)_localctx).table = match(ID);
					setState(496);
					match(T__21);
					}
					break;
				}
				setState(499);
				((ColumnReferenceContext)_localctx).column = match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SqlGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlGrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(SqlGrammarParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlGrammarParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlGrammarParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 229383L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SqlGrammarParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SqlGrammarParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SqlGrammarParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(SqlGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SqlGrammarParser.MAX, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(SqlGrammarParser.GROUP_CONCAT, 0); }
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitAggregationFunction(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 63L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class WindowOnlyFunctionContext extends ParserRuleContext {
		public TerminalNode RANK() { return getToken(SqlGrammarParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(SqlGrammarParser.DENSE_RANK, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SqlGrammarParser.ROW_NUMBER, 0); }
		public TerminalNode NTILE() { return getToken(SqlGrammarParser.NTILE, 0); }
		public TerminalNode LEAD() { return getToken(SqlGrammarParser.LEAD, 0); }
		public TerminalNode LAG() { return getToken(SqlGrammarParser.LAG, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlGrammarParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlGrammarParser.LAST_VALUE, 0); }
		public TerminalNode NTH_VALUE() { return getToken(SqlGrammarParser.NTH_VALUE, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(SqlGrammarParser.PERCENT_RANK, 0); }
		public TerminalNode CUME_DIST() { return getToken(SqlGrammarParser.CUME_DIST, 0); }
		public WindowOnlyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowOnlyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).enterWindowOnlyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlGrammarListener ) ((SqlGrammarListener)listener).exitWindowOnlyFunction(this);
		}
	}

	public final WindowOnlyFunctionContext windowOnlyFunction() throws RecognitionException {
		WindowOnlyFunctionContext _localctx = new WindowOnlyFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_windowOnlyFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 18005602416459776L) != 0)) ) {
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
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001j\u01fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004"+
		"\u0003\u0004l\b\u0004\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0004\u0003"+
		"\u0004r\b\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0004\u0003\u0004"+
		"x\b\u0004\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0004\u0003\u0004~\b"+
		"\u0004\u0001\u0004\u0005\u0004\u0081\b\u0004\n\u0004\f\u0004\u0084\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u008d\b\u0005\n\u0005\f\u0005\u0090\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0095\b\u0005\n\u0005\f\u0005"+
		"\u0098\t\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0005\u0003"+
		"\u0005\u009e\b\u0005\u0001\u0005\u0003\u0005\u00a1\b\u0005\u0001\u0005"+
		"\u0003\u0005\u00a4\b\u0005\u0001\u0005\u0003\u0005\u00a7\b\u0005\u0001"+
		"\u0005\u0003\u0005\u00aa\b\u0005\u0001\u0005\u0003\u0005\u00ad\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ba\b\u0006\u0001\u0006\u0003\u0006\u00bd\b\u0006\u0003\u0006\u00bf"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00c3\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00c7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00cc\b\u0007\n\u0007\f\u0007\u00cf\t\u0007\u0003\u0007\u00d1"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00db\b\u0007\n\u0007\f\u0007"+
		"\u00de\t\u0007\u0003\u0007\u00e0\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e7\b\u0007\n\u0007\f\u0007"+
		"\u00ea\t\u0007\u0003\u0007\u00ec\b\u0007\u0001\u0007\u0003\u0007\u00ef"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fb\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0109\b\t\u0001\n\u0001\n\u0003\n\u010d\b\n\u0001\n\u0003\n\u0110\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0118\b\u000b\u0001\u000b\u0003\u000b\u011b\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0121\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0124\b\u000b\u0003\u000b\u0126\b\u000b\u0001\f\u0003"+
		"\f\u0129\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0135\b\r\u0001\r\u0003\r\u0138\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0142\b\u000f\n\u000f\f\u000f\u0145\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u014c"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0150\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0157\b\u0012"+
		"\n\u0012\f\u0012\u015a\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0161\b\u0013\u0003\u0013\u0163\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0168\b\u0014\u0001\u0014"+
		"\u0003\u0014\u016b\b\u0014\u0001\u0014\u0003\u0014\u016e\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0175"+
		"\b\u0015\n\u0015\f\u0015\u0178\t\u0015\u0003\u0015\u017a\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u017f\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018d"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01a0\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01a6\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01b6\b\u0016\n"+
		"\u0016\f\u0016\u01b9\t\u0016\u0003\u0016\u01bb\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01bf\b\u0016\n\u0016\f\u0016\u01c2\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01c6\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u01cd\b\u0017\u000b\u0017\f\u0017"+
		"\u01ce\u0001\u0017\u0001\u0017\u0003\u0017\u01d3\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01da\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01df\b\u0018\n\u0018\f\u0018"+
		"\u01e2\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01e9\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01ee\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01f2\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01f6\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0001,\u001d"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468\u0000\b\u0001\u00008:\u0001\u0000\u0006\b\u0001"+
		"\u0000\t\n\u0001\u0000\u000b\u0015\u0001\u0000MN\u0002\u0000VXeg\u0001"+
		"\u0000GL\u0001\u0000+5\u0245\u0000:\u0001\u0000\u0000\u0000\u0002=\u0001"+
		"\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000"+
		"\u0000\bV\u0001\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u00be"+
		"\u0001\u0000\u0000\u0000\u000e\u00c2\u0001\u0000\u0000\u0000\u0010\u00fa"+
		"\u0001\u0000\u0000\u0000\u0012\u0108\u0001\u0000\u0000\u0000\u0014\u010a"+
		"\u0001\u0000\u0000\u0000\u0016\u0125\u0001\u0000\u0000\u0000\u0018\u0128"+
		"\u0001\u0000\u0000\u0000\u001a\u0137\u0001\u0000\u0000\u0000\u001c\u0139"+
		"\u0001\u0000\u0000\u0000\u001e\u013c\u0001\u0000\u0000\u0000 \u0146\u0001"+
		"\u0000\u0000\u0000\"\u014f\u0001\u0000\u0000\u0000$\u0151\u0001\u0000"+
		"\u0000\u0000&\u015b\u0001\u0000\u0000\u0000(\u0164\u0001\u0000\u0000\u0000"+
		"*\u016f\u0001\u0000\u0000\u0000,\u018c\u0001\u0000\u0000\u0000.\u01c3"+
		"\u0001\u0000\u0000\u00000\u01ed\u0001\u0000\u0000\u00002\u01f5\u0001\u0000"+
		"\u0000\u00004\u01f7\u0001\u0000\u0000\u00006\u01f9\u0001\u0000\u0000\u0000"+
		"8\u01fb\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0000"+
		"\u0000\u0001<\u0001\u0001\u0000\u0000\u0000=>\u0003\u0004\u0002\u0000"+
		">\u0003\u0001\u0000\u0000\u0000?A\u0005A\u0000\u0000@B\u0005B\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CH\u0003\u0006\u0003\u0000DE\u0005\u0001\u0000\u0000EG\u0003\u0006"+
		"\u0003\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0003\n\u0005\u0000LO\u0001\u0000\u0000\u0000"+
		"MO\u0003\n\u0005\u0000N?\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"O\u0005\u0001\u0000\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005*\u0000\u0000"+
		"RS\u0005\u0002\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005\u0003\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VX\u0005\u0017\u0000\u0000WY\u0005@\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z_\u0003\f\u0006\u0000[\\\u0005\u0001\u0000\u0000\\^\u0003"+
		"\f\u0006\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0005\u0018\u0000\u0000cg\u0003\u0014\n\u0000"+
		"df\u0003\u0018\f\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jl\u0003\u001c\u000e\u0000kj\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0003"+
		"\u001e\u000f\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pr\u0003 \u0010\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000su\u0003$\u0012\u0000"+
		"ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000"+
		"\u0000vx\u0003\"\u0011\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000y{\u0003(\u0014\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|~\u0003*\u0015"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0082\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0003\b\u0004\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\t\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u0017\u0000"+
		"\u0000\u0086\u0088\u0005@\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008e\u0003\f\u0006\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b"+
		"\u008d\u0003\f\u0006\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0018\u0000\u0000\u0092\u0096"+
		"\u0003\u0014\n\u0000\u0093\u0095\u0003\u0018\f\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0003"+
		"\u001c\u000e\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009e\u0003"+
		"\u001e\u000f\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003"+
		" \u0010\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003$\u0012"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\"\u0011\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003(\u0014\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003*\u0015\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u000b"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003,\u0016\u0000\u00b1\u00b3\u0005"+
		"*\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005d\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bf\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003\u000e\u0007"+
		"\u0000\u00b8\u00ba\u0005*\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0005d\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00b0\u0001\u0000\u0000\u0000\u00be\u00b7\u0001\u0000\u0000\u0000\u00bf"+
		"\r\u0001\u0000\u0000\u0000\u00c0\u00c3\u00036\u001b\u0000\u00c1\u00c3"+
		"\u00038\u001c\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005"+
		"\u0002\u0000\u0000\u00c5\u00c7\u0005@\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d0\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cd\u0003,\u0016\u0000\u00c9\u00ca\u0005\u0001\u0000"+
		"\u0000\u00ca\u00cc\u0003,\u0016\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u00056\u0000\u0000\u00d4"+
		"\u00df\u0005\u0002\u0000\u0000\u00d5\u00d6\u00057\u0000\u0000\u00d6\u00d7"+
		"\u0005\u001b\u0000\u0000\u00d7\u00dc\u0003,\u0016\u0000\u00d8\u00d9\u0005"+
		"\u0001\u0000\u0000\u00d9\u00db\u0003,\u0016\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005\u001d\u0000\u0000\u00e2\u00e3\u0005\u001b"+
		"\u0000\u0000\u00e3\u00e8\u0003&\u0013\u0000\u00e4\u00e5\u0005\u0001\u0000"+
		"\u0000\u00e5\u00e7\u0003&\u0013\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e1\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0003\u0010\b\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0003\u0000\u0000\u00f1\u000f\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0007\u0000\u0000\u0000\u00f3\u00fb\u0003\u0012\t\u0000\u00f4\u00f5"+
		"\u0007\u0000\u0000\u0000\u00f5\u00f6\u0005Y\u0000\u0000\u00f6\u00f7\u0003"+
		"\u0012\t\u0000\u00f7\u00f8\u0005M\u0000\u0000\u00f8\u00f9\u0003\u0012"+
		"\t\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f2\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f4\u0001\u0000\u0000\u0000\u00fb\u0011\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005;\u0000\u0000\u00fd\u0109\u0005<\u0000\u0000\u00fe"+
		"\u00ff\u0005;\u0000\u0000\u00ff\u0109\u0005=\u0000\u0000\u0100\u0101\u0005"+
		">\u0000\u0000\u0101\u0109\u0005?\u0000\u0000\u0102\u0103\u0003,\u0016"+
		"\u0000\u0103\u0104\u0005<\u0000\u0000\u0104\u0109\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0003,\u0016\u0000\u0106\u0107\u0005=\u0000\u0000\u0107\u0109"+
		"\u0001\u0000\u0000\u0000\u0108\u00fc\u0001\u0000\u0000\u0000\u0108\u00fe"+
		"\u0001\u0000\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0102"+
		"\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0109\u0013"+
		"\u0001\u0000\u0000\u0000\u010a\u010f\u0003\u0016\u000b\u0000\u010b\u010d"+
		"\u0005*\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0005"+
		"d\u0000\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0015\u0001\u0000\u0000\u0000\u0111\u0126\u0005d\u0000"+
		"\u0000\u0112\u0126\u0005e\u0000\u0000\u0113\u0114\u0005\u0002\u0000\u0000"+
		"\u0114\u0115\u0003\n\u0005\u0000\u0115\u011a\u0005\u0003\u0000\u0000\u0116"+
		"\u0118\u0005*\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0005d\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u0126\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"\u0002\u0000\u0000\u011d\u011e\u0003\b\u0004\u0000\u011e\u0123\u0005\u0003"+
		"\u0000\u0000\u011f\u0121\u0005*\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0005d\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000"+
		"\u0125\u0111\u0001\u0000\u0000\u0000\u0125\u0112\u0001\u0000\u0000\u0000"+
		"\u0125\u0113\u0001\u0000\u0000\u0000\u0125\u011c\u0001\u0000\u0000\u0000"+
		"\u0126\u0017\u0001\u0000\u0000\u0000\u0127\u0129\u0003\u001a\r\u0000\u0128"+
		"\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u001f\u0000\u0000\u012b"+
		"\u012c\u0003\u0014\n\u0000\u012c\u012d\u0005 \u0000\u0000\u012d\u012e"+
		"\u0003,\u0016\u0000\u012e\u0019\u0001\u0000\u0000\u0000\u012f\u0138\u0005"+
		"!\u0000\u0000\u0130\u0138\u0005\"\u0000\u0000\u0131\u0138\u0005$\u0000"+
		"\u0000\u0132\u0134\u0005%\u0000\u0000\u0133\u0135\u0005&\u0000\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0138\u0001\u0000\u0000\u0000\u0136\u0138\u0005\'\u0000\u0000\u0137\u012f"+
		"\u0001\u0000\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0131"+
		"\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u001b\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\u0019\u0000\u0000\u013a\u013b\u0003,\u0016\u0000\u013b\u001d\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\u001a\u0000\u0000\u013d\u013e\u0005"+
		"\u001b\u0000\u0000\u013e\u0143\u0003,\u0016\u0000\u013f\u0140\u0005\u0001"+
		"\u0000\u0000\u0140\u0142\u0003,\u0016\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u001f\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u001c\u0000"+
		"\u0000\u0147\u0148\u0003,\u0016\u0000\u0148!\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0005C\u0000\u0000\u014a\u014c\u0005D\u0000\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0150\u0001"+
		"\u0000\u0000\u0000\u014d\u0150\u0005E\u0000\u0000\u014e\u0150\u0005F\u0000"+
		"\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150#\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005\u001d\u0000\u0000\u0152\u0153\u0005\u001b\u0000\u0000"+
		"\u0153\u0158\u0003&\u0013\u0000\u0154\u0155\u0005\u0001\u0000\u0000\u0155"+
		"\u0157\u0003&\u0013\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159%\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u0162\u0003,\u0016\u0000\u015c\u0161\u0005)\u0000"+
		"\u0000\u015d\u0161\u0005(\u0000\u0000\u015e\u015f\u0005b\u0000\u0000\u015f"+
		"\u0161\u0005d\u0000\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0163"+
		"\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\'\u0001\u0000\u0000\u0000\u0164\u0167\u0005"+
		"\u001e\u0000\u0000\u0165\u0168\u0005f\u0000\u0000\u0166\u0168\u0005D\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u016d\u0001\u0000\u0000\u0000\u0169\u016b\u0005\u0005\u0000"+
		"\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0005f\u0000\u0000"+
		"\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e)\u0001\u0000\u0000\u0000\u016f\u0170\u0005_\u0000\u0000\u0170\u0179"+
		"\u0005`\u0000\u0000\u0171\u0176\u0005d\u0000\u0000\u0172\u0173\u0005\u0001"+
		"\u0000\u0000\u0173\u0175\u0005d\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u0171\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017e\u0001\u0000\u0000"+
		"\u0000\u017b\u017f\u0005a\u0000\u0000\u017c\u017d\u0005#\u0000\u0000\u017d"+
		"\u017f\u0005c\u0000\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f+\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0006\u0016\uffff\uffff\u0000\u0181\u0182"+
		"\u0005\u0002\u0000\u0000\u0182\u0183\u0003,\u0016\u0000\u0183\u0184\u0005"+
		"\u0003\u0000\u0000\u0184\u018d\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"O\u0000\u0000\u0186\u018d\u0003,\u0016\u000e\u0187\u018d\u00030\u0018"+
		"\u0000\u0188\u018d\u0003\u000e\u0007\u0000\u0189\u018d\u00032\u0019\u0000"+
		"\u018a\u018d\u00034\u001a\u0000\u018b\u018d\u0003.\u0017\u0000\u018c\u0180"+
		"\u0001\u0000\u0000\u0000\u018c\u0185\u0001\u0000\u0000\u0000\u018c\u0187"+
		"\u0001\u0000\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u01c0\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\n\r\u0000\u0000\u018f\u0190\u0007\u0001\u0000\u0000\u0190\u01bf\u0003"+
		",\u0016\u000e\u0191\u0192\n\f\u0000\u0000\u0192\u0193\u0007\u0002\u0000"+
		"\u0000\u0193\u01bf\u0003,\u0016\r\u0194\u0195\n\u000b\u0000\u0000\u0195"+
		"\u0196\u0007\u0003\u0000\u0000\u0196\u01bf\u0003,\u0016\f\u0197\u0198"+
		"\n\n\u0000\u0000\u0198\u0199\u0007\u0004\u0000\u0000\u0199\u01bf\u0003"+
		",\u0016\u000b\u019a\u019f\n\t\u0000\u0000\u019b\u01a0\u0005P\u0000\u0000"+
		"\u019c\u01a0\u0005Q\u0000\u0000\u019d\u019e\u0005R\u0000\u0000\u019e\u01a0"+
		"\u0005S\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u019f\u019c\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01bf\u0003,\u0016\n\u01a2\u01a3\n\b\u0000\u0000"+
		"\u01a3\u01a5\u0005U\u0000\u0000\u01a4\u01a6\u0005O\u0000\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01bf\u0003,\u0016\t\u01a8\u01a9\n\u0006"+
		"\u0000\u0000\u01a9\u01aa\u0005Y\u0000\u0000\u01aa\u01ab\u0003,\u0016\u0000"+
		"\u01ab\u01ac\u0005M\u0000\u0000\u01ac\u01ad\u0003,\u0016\u0007\u01ad\u01bf"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\n\u0007\u0000\u0000\u01af\u01b0\u0005"+
		"T\u0000\u0000\u01b0\u01ba\u0005\u0002\u0000\u0000\u01b1\u01bb\u0003\b"+
		"\u0004\u0000\u01b2\u01b7\u0003,\u0016\u0000\u01b3\u01b4\u0005\u0001\u0000"+
		"\u0000\u01b4\u01b6\u0003,\u0016\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01b1\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b2\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0003\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000"+
		"\u01be\u018e\u0001\u0000\u0000\u0000\u01be\u0191\u0001\u0000\u0000\u0000"+
		"\u01be\u0194\u0001\u0000\u0000\u0000\u01be\u0197\u0001\u0000\u0000\u0000"+
		"\u01be\u019a\u0001\u0000\u0000\u0000\u01be\u01a2\u0001\u0000\u0000\u0000"+
		"\u01be\u01a8\u0001\u0000\u0000\u0000\u01be\u01ae\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1-\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c5\u0005Z\u0000\u0000\u01c4\u01c6"+
		"\u0003,\u0016\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01cc\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"[\u0000\u0000\u01c8\u01c9\u0003,\u0016\u0000\u01c9\u01ca\u0005\\\u0000"+
		"\u0000\u01ca\u01cb\u0003,\u0016\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c7\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005]\u0000\u0000\u01d1"+
		"\u01d3\u0003,\u0016\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0005^\u0000\u0000\u01d5/\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005d"+
		"\u0000\u0000\u01d7\u01d9\u0005\u0002\u0000\u0000\u01d8\u01da\u0005@\u0000"+
		"\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01e0\u0003,\u0016\u0000"+
		"\u01dc\u01dd\u0005\u0001\u0000\u0000\u01dd\u01df\u0003,\u0016\u0000\u01de"+
		"\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0005\u0003\u0000\u0000\u01e4\u01ee\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u00036\u001b\u0000\u01e6\u01e8\u0005\u0002\u0000\u0000\u01e7\u01e9"+
		"\u0005@\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003"+
		",\u0016\u0000\u01eb\u01ec\u0005\u0003\u0000\u0000\u01ec\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ed\u01d6\u0001\u0000\u0000\u0000\u01ed\u01e5\u0001\u0000"+
		"\u0000\u0000\u01ee1\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005d\u0000\u0000"+
		"\u01f0\u01f2\u0005\u0016\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f6\u0005d\u0000\u0000\u01f4\u01f6\u0005\u0006\u0000\u0000\u01f5"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"3\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007\u0005\u0000\u0000\u01f85\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0007\u0006\u0000\u0000\u01fa7\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0007\u0007\u0000\u0000\u01fc9\u0001\u0000\u0000"+
		"\u0000NAHNX_gknqtwz}\u0082\u0087\u008e\u0096\u009a\u009d\u00a0\u00a3\u00a6"+
		"\u00a9\u00ac\u00b2\u00b5\u00b9\u00bc\u00be\u00c2\u00c6\u00cd\u00d0\u00dc"+
		"\u00df\u00e8\u00eb\u00ee\u00fa\u0108\u010c\u010f\u0117\u011a\u0120\u0123"+
		"\u0125\u0128\u0134\u0137\u0143\u014b\u014f\u0158\u0160\u0162\u0167\u016a"+
		"\u016d\u0176\u0179\u017e\u018c\u019f\u01a5\u01b7\u01ba\u01be\u01c0\u01c5"+
		"\u01ce\u01d2\u01d9\u01e0\u01e8\u01ed\u01f1\u01f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
