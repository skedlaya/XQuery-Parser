/* rp object */
public class RPObj{
	public String text;
    public RPObj rpLeft;
    public RPObj rpRight;
    public FObj fObj;
    
    public RPObj(String text, XQParser.RpContext rpLeft, XQParser.RpContext rpRight, XQParser.FContext fObj){
       this.text = text;
       this.rpLeft = (RPObj)XQBuilder.BuilderMap.get(rpLeft);
       this.rpRight = (RPObj)XQBuilder.BuilderMap.get(rpRight);
       this.fObj = (FObj)XQBuilder.BuilderMap.get(fObj);;
    }
}