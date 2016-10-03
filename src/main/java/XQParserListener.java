// Generated from XQParser.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQParser}.
 */
public interface XQParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code rpCurr}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpCurr(@NotNull XQParser.RpCurrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpCurr}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpCurr(@NotNull XQParser.RpCurrContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull XQParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull XQParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(@NotNull XQParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(@NotNull XQParser.ReturnClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(@NotNull XQParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(@NotNull XQParser.LetClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDoubleSlash(@NotNull XQParser.RpDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDoubleSlash(@NotNull XQParser.RpDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFAnd(@NotNull XQParser.FAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFAnd(@NotNull XQParser.FAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fBracket}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFBracket(@NotNull XQParser.FBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fBracket}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFBracket(@NotNull XQParser.FBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(@NotNull XQParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(@NotNull XQParser.CondSomeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpTxt}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpTxt(@NotNull XQParser.RpTxtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpTxt}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpTxt(@NotNull XQParser.RpTxtContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParent(@NotNull XQParser.RpParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParent(@NotNull XQParser.RpParentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(@NotNull XQParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(@NotNull XQParser.CondNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqBracket}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqBracket(@NotNull XQParser.XqBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqBracket}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqBracket(@NotNull XQParser.XqBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(@NotNull XQParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(@NotNull XQParser.CondAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqSlash(@NotNull XQParser.XqSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqSlash(@NotNull XQParser.XqSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpBracket}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpBracket(@NotNull XQParser.RpBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpBracket}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpBracket(@NotNull XQParser.RpBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(@NotNull XQParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(@NotNull XQParser.RpFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(@NotNull XQParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(@NotNull XQParser.CondIsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpTagname}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpTagname(@NotNull XQParser.RpTagnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpTagname}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpTagname(@NotNull XQParser.RpTagnameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fRp}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFRp(@NotNull XQParser.FRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fRp}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFRp(@NotNull XQParser.FRpContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVar(@NotNull XQParser.XqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVar(@NotNull XQParser.XqVarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(@NotNull XQParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(@NotNull XQParser.XqApContext ctx);

	/**
	 * Enter a parse tree produced by the {@code apSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApSlash(@NotNull XQParser.ApSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApSlash(@NotNull XQParser.ApSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqTags}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqTags(@NotNull XQParser.XqTagsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqTags}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqTags(@NotNull XQParser.XqTagsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqComma(@NotNull XQParser.XqCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqComma(@NotNull XQParser.XqCommaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condEBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEBracket(@NotNull XQParser.CondEBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEBracket(@NotNull XQParser.CondEBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpStar(@NotNull XQParser.RpStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpStar(@NotNull XQParser.RpStarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqStr}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqStr(@NotNull XQParser.XqStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqStr}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqStr(@NotNull XQParser.XqStrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAttribute(@NotNull XQParser.RpAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAttribute(@NotNull XQParser.RpAttributeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFOr(@NotNull XQParser.FOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFOr(@NotNull XQParser.FOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqDoubleSlash(@NotNull XQParser.XqDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqDoubleSlash(@NotNull XQParser.XqDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fEqual}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFEqual(@NotNull XQParser.FEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fEqual}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFEqual(@NotNull XQParser.FEqualContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqComplex}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqComplex(@NotNull XQParser.XqComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqComplex}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqComplex(@NotNull XQParser.XqComplexContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqual(@NotNull XQParser.CondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqual(@NotNull XQParser.CondEqualContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondBracket(@NotNull XQParser.CondBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondBracket(@NotNull XQParser.CondBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFNot(@NotNull XQParser.FNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFNot(@NotNull XQParser.FNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLet(@NotNull XQParser.XqLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLet(@NotNull XQParser.XqLetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(@NotNull XQParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(@NotNull XQParser.CondOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code fIs}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFIs(@NotNull XQParser.FIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fIs}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFIs(@NotNull XQParser.FIsContext ctx);

	/**
	 * Enter a parse tree produced by {@link XQParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull XQParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull XQParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSlash(@NotNull XQParser.RpSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSlash(@NotNull XQParser.RpSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code apDoubleSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApDoubleSlash(@NotNull XQParser.ApDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apDoubleSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApDoubleSlash(@NotNull XQParser.ApDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpComma(@NotNull XQParser.RpCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpComma(@NotNull XQParser.RpCommaContext ctx);
}