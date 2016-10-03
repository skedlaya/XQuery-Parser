/* Return object */
public class RObj{

	public XQObj x;
	public RObj( XQParser.XqContext x){
    	
    	this.x = (XQObj)XQBuilder.BuilderMap.get(x);
    }
}