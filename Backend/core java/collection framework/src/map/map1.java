package map;

import java.util.HashMap;
import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

public class map1 {
	
	public static void main(String[] args) {
		TreeMap t2=null;
	TreeMap t1= new TreeMap();
	t1.put(5, 78);
	t1.put(3, "kijm");
	t1.put(5, 64);
	System.out.println(t1.get(5));
	 t2.putAll(t1);
	System.out.println(t2);
	HashMap v1= new HashMap();
	v1.entrySet();
	}

}
