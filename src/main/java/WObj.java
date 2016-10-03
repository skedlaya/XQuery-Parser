/* Where object */
public class WObj{
	public CObj c;
	public WObj( XQParser.CondContext c){
    	
    	this.c = (CObj)XQBuilder.BuilderMap.get(c);
    }
}