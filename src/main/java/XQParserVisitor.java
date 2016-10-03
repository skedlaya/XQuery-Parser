// Generated from XQParser.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code rpCurr}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpCurr(@NotNull XQParser.RpCurrContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull XQParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(@NotNull XQParser.ReturnClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(@NotNull XQParser.LetClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDoubleSlash(@NotNull XQParser.RpDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAnd(@NotNull XQParser.FAndContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fBracket}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFBracket(@NotNull XQParser.FBracketContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSome(@NotNull XQParser.CondSomeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpTxt}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTxt(@NotNull XQParser.RpTxtContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParent(@NotNull XQParser.RpParentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(@NotNull XQParser.CondNotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqBracket}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqBracket(@NotNull XQParser.XqBracketContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(@NotNull XQParser.CondAndContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlash(@NotNull XQParser.XqSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpBracket}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpBracket(@NotNull XQParser.RpBracketContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(@NotNull XQParser.RpFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIs(@NotNull XQParser.CondIsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpTagname}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTagname(@NotNull XQParser.RpTagnameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fRp}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRp(@NotNull XQParser.FRpContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(@NotNull XQParser.XqVarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(@NotNull XQParser.XqApContext ctx);

	/**
	 * Visit a parse tree produced by the {@code apSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApSlash(@NotNull XQParser.ApSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqTags}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqTags(@NotNull XQParser.XqTagsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqComma(@NotNull XQParser.XqCommaContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condEBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEBracket(@NotNull XQParser.CondEBracketContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpStar(@NotNull XQParser.RpStarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqStr}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqStr(@NotNull XQParser.XqStrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAttribute(@NotNull XQParser.RpAttributeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOr(@NotNull XQParser.FOrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqDoubleSlash(@NotNull XQParser.XqDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fEqual}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFEqual(@NotNull XQParser.FEqualContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqComplex}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqComplex(@NotNull XQParser.XqComplexContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqual(@NotNull XQParser.CondEqualContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condBracket}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBracket(@NotNull XQParser.CondBracketContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFNot(@NotNull XQParser.FNotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLet(@NotNull XQParser.XqLetContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(@NotNull XQParser.CondOrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code fIs}
	 * labeled alternative in {@link XQParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIs(@NotNull XQParser.FIsContext ctx);

	/**
	 * Visit a parse tree produced by {@link XQParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull XQParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpSlash(@NotNull XQParser.RpSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code apDoubleSlash}
	 * labeled alternative in {@link XQParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDoubleSlash(@NotNull XQParser.ApDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpComma(@NotNull XQParser.RpCommaContext ctx);
}