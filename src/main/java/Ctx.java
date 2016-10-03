/* Context node */
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class Ctx {
    public HashMap<String,ArrayList<Node>> map;

    public Ctx(Ctx c){
        map= new HashMap<String,ArrayList<Node>>();
        map.putAll(c.map);
    }

    public Ctx(){
        map= new HashMap<String,ArrayList<Node>>();
    }

    public void set(String s, ArrayList<Node> list ){
        map.put(s,list);
    }

    public ArrayList<Node> get(String s){
        return map.get(s);
    }

    public boolean equals(Ctx c){
        if (c.map.equals(this.map))
            return true;
        else 
        	return false;
    }
}