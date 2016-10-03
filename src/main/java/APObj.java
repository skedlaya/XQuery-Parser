/* Absolute path object */
public class APObj{
	public String text;
    public String filename;
    
    public RPObj rp;
    
    public APObj(String text, String filename, XQParser.RpContext rp){
    	this.text = text;
    	this.filename = filename;
    	this.rp = (RPObj)XQBuilder.BuilderMap.get(rp);
    }

	
}
