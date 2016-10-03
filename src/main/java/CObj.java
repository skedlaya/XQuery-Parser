/* Condition Object */
import java.util.ArrayList;

public class CObj{
	public String text;
    
    public XQObj xqLeft;
    public XQObj xqRight;
    public CObj condLeft;
    public CObj condRight;
    public ArrayList<SObj> s;
    
    public CObj(String text, XQParser.XqContext xqLeft,XQParser.XqContext xqRight,XQParser.CondContext condLeft, XQParser.CondContext condRight,ArrayList<SObj> s2 ){
        this.text = text;
        
        this.xqLeft = (XQObj)XQBuilder.BuilderMap.get(xqLeft);
        this.xqRight = (XQObj)XQBuilder.BuilderMap.get(xqRight);
        this.condLeft = (CObj)XQBuilder.BuilderMap.get(condLeft);
        this.condRight = (CObj)XQBuilder.BuilderMap.get(condRight);
        
        this.s = s2;
        
     }
}