package Treset;

import java.util.TreeSet;

public class TR1 {
	
	public static void main(String[] args) {
		
		TreeSet t1= new TreeSet();
		
		t1.add(23);
		t1.add(87);
		t1.add(67);
		t1.add(23);
	
		
		for (Object o1 : t1) {
			System.out.println(o1);
		}
		
		TreeSet<String> t2= new TreeSet<String>();
		
		t2.add("hhhh");
		t2.add("aaaa");
		t2.add("rrrr");
		t2.add("ssss");
		
		for (Object o2 : t2) {
			System.out.println(o2);
		}
		
		
		
		
	}

}
