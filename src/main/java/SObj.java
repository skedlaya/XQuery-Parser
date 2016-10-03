/* Some object */
public class SObj{
	public XQObj x;
	String var;
	public SObj( String var,XQParser.XqContext x){
    	this.var = var;
    	this.x = (XQObj)XQBuilder.BuilderMap.get(x);
    }
}