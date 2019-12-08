package Hashset;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
      HashSet h= new HashSet();
		
		h.add(23);
		h.add(43);
		h.add(33);
		h.add(53);
		h.add(null);
		
		for (Object integer : h) {
			
			System.out.println(integer);
		}
		
		
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		hs.add(23);
		hs.add(43);
		hs.add(33);
		hs.add(53);
		hs.add(null);
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
		HashSet<String> hs1= new HashSet<String>();
		
		hs1.add("jjjj");
		hs1.add("uuuu");
		hs1.add("oooo");
		hs1.add("bbbb");
		hs1.add(null);
		hs1.add("jjjj");
		
		for (String string : hs1) {
			System.out.println(string);
		}
		
	}

}
