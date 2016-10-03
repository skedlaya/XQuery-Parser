import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class XQExec{

	public static ArrayList<Node> executeFromFile(String string) throws IOException {
		return execute(new ANTLRFileStream(string));
		
	}
	private static ArrayList<Node> execute(ANTLRInputStream input) {
		XQLexer lexer = new XQLexer(input);
		 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    XQParser parser = new XQParser(tokens);
	 
	    // Specify our entry point
	    long startTime   = System.currentTimeMillis();

	    XQParser.XqContext expSentenceContext = parser.xq();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    XQBuilder listener = new XQBuilder();
	    //XPathEval listener = new XPathEval();
	    walker.walk(listener, expSentenceContext);
	    XQEvaluator evaluator = new XQEvaluator(expSentenceContext);
	    ArrayList<Node> result= evaluator.run();
	    long endTime   = System.currentTimeMillis();
	    long totalTime = endTime - startTime;
	    System.out.println(totalTime);
		 
		//printOutputFile(result);
        return result;
        
    }
	 public static void preorderTraversal(Node root, ArrayList<String> pre,int tabs, int maxtab)
	  {
		String tab = "";
		String attr = "";
		for (int k=0;k <tabs; k++)
			tab = tab+"\t";
		String nodename = "";
	        if(root==null)
			return;
		if (root instanceof Element)
		{
			nodename = root.getNodeName();
			pre.add("\n");
			NamedNodeMap attrs = root.getAttributes();
	        	for (int i = 0; i < attrs.getLength(); i++)
			{
	            		Attr attribute = (Attr) attrs.item(i);
				attr = attr+" "+attribute.getName()+"=\""+attribute.getValue()+"\"";
	        	}
	        	pre.add(tab+"<"+nodename+attr+">");
			NodeList children = root.getChildNodes();
	        	for (int i = 0; i < children.getLength(); i++)
			{
				if (children.item(i) instanceof Text && children.item(i).getTextContent().length()!=0)
					pre.add(children.item(i).getTextContent());
				else
				{
		 			maxtab = tabs+1;
					preorderTraversal(children.item(i), pre, tabs+1, maxtab);
				}
			}
			if (tabs < maxtab)
	        	{
				pre.add("\n"+tab);
			}
			pre.add("</"+nodename+">");
	        	return;
	   	}
		else if (root instanceof Text && root.getTextContent().length() != 0)
		{
			pre.add(root.getTextContent());
		}
	        return;
	  }
	  public static void printOutputFile(ArrayList<Node> nodes)
	  {
		ArrayList<String> pre = new ArrayList<String>();
		//System.out.format("Size of the result %d",nodes.size());
		for(int i=0;i<nodes.size();i++)
		{
			preorderTraversal(nodes.get(i), pre, 0,0);
			if (pre.isEmpty() == false)
			{
				for(int j=0;j<pre.size();j++)
					System.out.format("%s",pre.get(j));
				pre.clear();
			}
		}
		return;
	  }

	/*
	 // Print result nodes
	 public static void checkResult(Node root, ArrayList<String> order,int tabs, int wsLimit)
	  {
		String ws = "";
		String attStr = "";
		for (int k=0;k <tabs; k++)
			ws = ws+"\t";
		String resultNode = "";
	        if(root==null)
			return;
		if (root instanceof Element)
		{
			resultNode = root.getNodeName();
			order.add("\n");
			NamedNodeMap attrs = root.getAttributes();
	        	for (int i = 0; i < attrs.getLength(); i++)
			{
	            		Attr attribute = (Attr) attrs.item(i);
	            		attStr = attStr+" "+attribute.getName()+"=\""+attribute.getValue()+"\"";
	        	}
	        	order.add(ws+"<"+resultNode+attStr+">");
			NodeList children = root.getChildNodes();
	        	for (int i = 0; i < children.getLength(); i++)
			{
				if (children.item(i) instanceof Text && children.item(i).getTextContent().length()!=0)
					order.add(children.item(i).getTextContent());
				else
				{
		 			wsLimit = tabs+1;
		 			checkResult(children.item(i), order, tabs+1, wsLimit);
				}
			}
			if (tabs < wsLimit)
	        	{
				order.add("\n"+ws);
			}
			order.add("</"+resultNode+">");
	        	return;
	   	}
		else if (root instanceof Text && root.getTextContent().length() != 0)
		{
			order.add(root.getTextContent());
		}
	        return;
	  }
	  public static void printOutputFile(ArrayList<Node> result)
	  {
		ArrayList<String> order = new ArrayList<String>();
		PrintWriter output;
		try {
			output = new PrintWriter("output.txt", "UTF-8");
		
		for(int i=0;i<result.size();i++)
		{
			checkResult(result.get(i), order, 0,0);
			if (order.isEmpty() == false)
			{
				for(int j=0;j<order.size();j++)
					output.printf("%s",order.get(j));
				    
				order.clear();
			}
			output.close();
		}
		
        } catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}        
        
	  }
	
	*/
}