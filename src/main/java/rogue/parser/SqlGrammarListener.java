// Generated from SqlGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlGrammarParser}.
 */
public interface SqlGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SqlGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SqlGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(SqlGrammarParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(SqlGrammarParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SqlGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SqlGrammarParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(SqlGrammarParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(SqlGrammarParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#select_statement1}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement1(SqlGrammarParser.Select_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#select_statement1}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement1(SqlGrammarParser.Select_statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#select_statement2}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement2(SqlGrammarParser.Select_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#select_statement2}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement2(SqlGrammarParser.Select_statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SqlGrammarParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SqlGrammarParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(SqlGrammarParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(SqlGrammarParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(SqlGrammarParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(SqlGrammarParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SqlGrammarParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SqlGrammarParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(SqlGrammarParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(SqlGrammarParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SqlGrammarParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SqlGrammarParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SqlGrammarParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SqlGrammarParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#joinTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterJoinTypeSpec(SqlGrammarParser.JoinTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#joinTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitJoinTypeSpec(SqlGrammarParser.JoinTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SqlGrammarParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SqlGrammarParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SqlGrammarParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SqlGrammarParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#setOperation}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SqlGrammarParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#setOperation}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SqlGrammarParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlGrammarParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlGrammarParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SqlGrammarParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SqlGrammarParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlGrammarParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlGrammarParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#forUpdateClause}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateClause(SqlGrammarParser.ForUpdateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#forUpdateClause}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateClause(SqlGrammarParser.ForUpdateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SqlGrammarParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SqlGrammarParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlGrammarParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlGrammarParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SqlGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SqlGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SqlGrammarParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SqlGrammarParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlGrammarParser#windowOnlyFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowOnlyFunction(SqlGrammarParser.WindowOnlyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlGrammarParser#windowOnlyFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowOnlyFunction(SqlGrammarParser.WindowOnlyFunctionContext ctx);
}
