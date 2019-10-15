package Oct16;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Bag{
	ArrayList<String>list= new ArrayList<String>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void add(String aString) {

		list.add(aString);
	}

	public boolean remove(String aString) {
		return list.remove(aString);
	}

	public int getCurrentSize() {
		return list.size();
	}

	public boolean contains(String aString) {
		return list.contains(aString);
	}

	public void clear() {
		list.clear();
	}

	
	
	
}
public class TestBag {
public static void main(String[] args) {
	Map<String,String>map= new LinkedHashMap<String,String>();
	map.put("sheep", "wool");
	map.put("house", "brick");
	map.put("cast", "plaster");
	map.put("wool", "wool");
mapMystery2(map);	
}
public static void mapMystery2(Map<String, String> m) {
    Set<String> s = new TreeSet<String>();
    for (String key : m.keySet()) {
        if (!m.get(key).equals(key)) {
            s.add(m.get(key));
        } else {
        	System.out.println("Removing : "+m.get(key));
        	System.out.println(s);
            s.remove(m.get(key));
        	System.out.println(s);

        }
    }
    System.out.println(s);
}
}
	