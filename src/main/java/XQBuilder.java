import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class XQBuilder extends XQParserBaseListener{
	public static HashMap<ParserRuleContext,Object> BuilderMap= new HashMap<ParserRuleContext,Object>();
	public APObj ap = new APObj(null,null,null);
	public XQObj xq;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpCurr(@NotNull XQParser.RpCurrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpCurr(@NotNull XQParser.RpCurrContext ctx) {
		RPObj rp = new RPObj(".", null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhereClause(@NotNull XQParser.WhereClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhereClause(@NotNull XQParser.WhereClauseContext ctx) {
		WObj w = new WObj(ctx.cond());
		
		BuilderMap.put((ParserRuleContext)ctx, (Object)w);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnClause(@NotNull XQParser.ReturnClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnClause(@NotNull XQParser.ReturnClauseContext ctx) {
		RObj r = new RObj(ctx.xq());
		BuilderMap.put((ParserRuleContext)ctx, (Object)r);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLetClause(@NotNull XQParser.LetClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLetClause(@NotNull XQParser.LetClauseContext ctx) {
		LObj l = new LObj();
		for(int i =0; i < ctx.VARNAME().size(); i++){
		    l.var.add(ctx.VARNAME(i).getText());
		    l.x.add((XQObj)BuilderMap.get(ctx.xq(i)));}
		BuilderMap.put((ParserRuleContext)ctx, (Object)l);
	
	}
	

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpDoubleSlash(@NotNull XQParser.RpDoubleSlashContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpDoubleSlash(@NotNull XQParser.RpDoubleSlashContext ctx) {
		RPObj rp = new RPObj("//",ctx.left,ctx.right,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFAnd(@NotNull XQParser.FAndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFAnd(@NotNull XQParser.FAndContext ctx) { 
		FObj fObj = new FObj("AND",null,null,ctx.left,ctx.right);
		BuilderMap.put((ParserRuleContext)ctx, (Object)fObj);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFBracket(@NotNull XQParser.FBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFBracket(@NotNull XQParser.FBracketContext ctx) {
		FObj fObj = new FObj("()",null,null,ctx.f(),null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)fObj);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondSome(@NotNull XQParser.CondSomeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondSome(@NotNull XQParser.CondSomeContext ctx) { 
		ArrayList<SObj> s =new ArrayList<SObj>();
		for(int i =0; i < ctx.VARNAME().size(); i++){
			s.add(new SObj(ctx.VARNAME(i).getText(),ctx.xq(i)));
			//BuilderMap.put((ParserRuleContext)ctx, (Object)s);
		}
		CObj c = new CObj("SOME", null, null, ctx.cond(),null , s);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpTxt(@NotNull XQParser.RpTxtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpTxt(@NotNull XQParser.RpTxtContext ctx) { 
		RPObj rp = new RPObj("text()",null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpParent(@NotNull XQParser.RpParentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpParent(@NotNull XQParser.RpParentContext ctx) {
		RPObj rp = new RPObj("..",null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondNot(@NotNull XQParser.CondNotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondNot(@NotNull XQParser.CondNotContext ctx) { 
		CObj c = new CObj("NOT",null, null, ctx.cond(), null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqBracket(@NotNull XQParser.XqBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqBracket(@NotNull XQParser.XqBracketContext ctx) {
		XQObj xq = new XQObj("()",null,null,ctx.xq(),null,null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondAnd(@NotNull XQParser.CondAndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondAnd(@NotNull XQParser.CondAndContext ctx) { 
		CObj c = new CObj("AND",null, null, ctx.left, ctx.right,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqSlash(@NotNull XQParser.XqSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqSlash(@NotNull XQParser.XqSlashContext ctx) { 
		XQObj xq = new XQObj("/",null,ctx.rp(), ctx.xq(), null, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpBracket(@NotNull XQParser.RpBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpBracket(@NotNull XQParser.RpBracketContext ctx) { 
		RPObj rp = new RPObj("()",ctx.rp(),null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpFilter(@NotNull XQParser.RpFilterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpFilter(@NotNull XQParser.RpFilterContext ctx) { 
		RPObj rp = new RPObj("[]",ctx.rp(),null,ctx.f());
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondIs(@NotNull XQParser.CondIsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondIs(@NotNull XQParser.CondIsContext ctx) {
		CObj c = new CObj("IS",  ctx.left, ctx.right,null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpTagname(@NotNull XQParser.RpTagnameContext ctx) { 

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpTagname(@NotNull XQParser.RpTagnameContext ctx) {
		RPObj rp = new RPObj(ctx.ID().getText(),null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFRp(@NotNull XQParser.FRpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFRp(@NotNull XQParser.FRpContext ctx) { 
		FObj f = new FObj(null,ctx.rp(), null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqVar(@NotNull XQParser.XqVarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqVar(@NotNull XQParser.XqVarContext ctx) {
		XQObj xq = new XQObj(ctx.VARNAME().getText(),null,null, null, null, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqAp(@NotNull XQParser.XqApContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqAp(@NotNull XQParser.XqApContext ctx) { 
		XQObj xq = new XQObj(null,null,null, null, null, ctx.ap(), null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApSlash(@NotNull XQParser.ApSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApSlash(@NotNull XQParser.ApSlashContext ctx) {
		//public APObj ap = new APObj();
	    APObj ap = new APObj("/",ctx.FILENAME.getText().replace("\"", ""),ctx.rp());
		BuilderMap.put((ParserRuleContext)ctx, (Object)ap);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqTags(@NotNull XQParser.XqTagsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqTags(@NotNull XQParser.XqTagsContext ctx) {
		XQObj xq = new XQObj(null,ctx.ID(0).getText(),null, ctx.xq(), null, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqComma(@NotNull XQParser.XqCommaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqComma(@NotNull XQParser.XqCommaContext ctx) {
		XQObj xq = new XQObj(",",null,null, ctx.left, ctx.right, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondEBracket(@NotNull XQParser.CondEBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondEBracket(@NotNull XQParser.CondEBracketContext ctx) {
		CObj c = new CObj("EMPTY",ctx.xq(), null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpStar(@NotNull XQParser.RpStarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpStar(@NotNull XQParser.RpStarContext ctx) { 
		RPObj rp = new RPObj("*",null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	

	@Override public void enterXqStr(@NotNull XQParser.XqStrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqStr(@NotNull XQParser.XqStrContext ctx) { 
		XQObj xq = new XQObj(ctx.STRINGCONST().getText(),null,null, null, null, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}
	

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpAttribute(@NotNull XQParser.RpAttributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpAttribute(@NotNull XQParser.RpAttributeContext ctx) {
		RPObj rp = new RPObj("@"+ctx.ID().getText(),null,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFOr(@NotNull XQParser.FOrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFOr(@NotNull XQParser.FOrContext ctx) {
		FObj f = new FObj("OR",null,null, ctx.left, ctx.right);
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqDoubleSlash(@NotNull XQParser.XqDoubleSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqDoubleSlash(@NotNull XQParser.XqDoubleSlashContext ctx) {
		XQObj xq = new XQObj("//",null,ctx.rp(), ctx.xq(), null, null, null, null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFEqual(@NotNull XQParser.FEqualContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFEqual(@NotNull XQParser.FEqualContext ctx) {
		FObj f = new FObj("EQUAL",ctx.left,ctx.right,null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXqComplex(@NotNull XQParser.XqComplexContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqComplex(@NotNull XQParser.XqComplexContext ctx) { 
		XQObj xq = new XQObj(null,null, null, null, null, null, ctx.forClause(), ctx.letClause(), ctx.whereClause(), ctx.returnClause());
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondEqual(@NotNull XQParser.CondEqualContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondEqual(@NotNull XQParser.CondEqualContext ctx) { 
		CObj c = new CObj("EQUAL",  ctx.left, ctx.right,null, null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondBracket(@NotNull XQParser.CondBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondBracket(@NotNull XQParser.CondBracketContext ctx) {
		CObj c = new CObj("()",null, null, ctx.cond(), null,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFNot(@NotNull XQParser.FNotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFNot(@NotNull XQParser.FNotContext ctx) { 
		FObj f = new FObj("NOT",null,null, ctx.f(), null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondOr(@NotNull XQParser.CondOrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondOr(@NotNull XQParser.CondOrContext ctx) {
		CObj c = new CObj("OR",null, null, ctx.left, ctx.right,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)c);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFIs(@NotNull XQParser.FIsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFIs(@NotNull XQParser.FIsContext ctx) { 
		FObj f = new FObj("IS", ctx.left, ctx.right,null,null );
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForClause(@NotNull XQParser.ForClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForClause(@NotNull XQParser.ForClauseContext ctx) { 
		ForObj f = new ForObj();
		for(int i =0; i < ctx.VARNAME().size(); i++){
		    f.var.add(ctx.VARNAME(i).getText());
		    f.x.add((XQObj)BuilderMap.get(ctx.xq(i)));}
		BuilderMap.put((ParserRuleContext)ctx, (Object)f);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpSlash(@NotNull XQParser.RpSlashContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override 
	public void exitRpSlash(@NotNull XQParser.RpSlashContext ctx) {
		RPObj rp = new RPObj("/",ctx.left,ctx.right,null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApDoubleSlash(@NotNull XQParser.ApDoubleSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApDoubleSlash(@NotNull XQParser.ApDoubleSlashContext ctx) { 
		APObj a = new APObj("//",ctx.FILENAME.getText().replace("\"", ""), ctx.rp());
		BuilderMap.put((ParserRuleContext)ctx, (Object)a);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRpComma(@NotNull XQParser.RpCommaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRpComma(@NotNull XQParser.RpCommaContext ctx) {
		RPObj rp = new RPObj(",", ctx.left, ctx.right, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)rp);
	}

	@Override public void enterXqLet(@NotNull XQParser.XqLetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXqLet(@NotNull XQParser.XqLetContext ctx) { 
		XQObj xq = new XQObj(null,null,  null, ctx.xq(),null, null, null, ctx.letClause(), null, null);
		BuilderMap.put((ParserRuleContext)ctx, (Object)xq);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}