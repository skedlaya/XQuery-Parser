/* Filter object */
public class FObj {
	String text;
    public RPObj rpLeft;
    public RPObj rpRight;
    public FObj fLeft;
    public FObj fRight;
    
    public FObj(String text,XQParser.RpContext rpLeft, XQParser.RpContext rpRight, XQParser.FContext fLeft, XQParser.FContext fRight){
        this.text = text;
    	this.rpLeft = (RPObj)XQBuilder.BuilderMap.get(rpLeft);
        this.rpRight = (RPObj)XQBuilder.BuilderMap.get(rpRight); 
        this.fLeft = (FObj)XQBuilder.BuilderMap.get(fLeft);
        this.fRight = (FObj)XQBuilder.BuilderMap.get(fRight);
    }
}