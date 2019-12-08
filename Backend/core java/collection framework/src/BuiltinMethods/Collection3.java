package BuiltinMethods;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	
	public static void main(String[] args) {
		
		Collection c1=new ArrayList();
		
		c1.add(12);
		c1.add(13);
		c1.add(14);
		
		Collection c2=new ArrayList();
		
		c2.add(12);
		c2.add(14);
		c2.add(18);
		
		c1.addAll(c2);
		System.out.println(c1);
		
		c1.removeAll(c2);
		System.out.println(c1);
		
		System.out.println(c2);
		
		System.out.println("-------------------------");
		
		
		Collection c3= new ArrayList();
		c3.add(12);
		c3.add(17);
		c3.add(14);
		
		Collection c4=new ArrayList();
		
		c4.add(12);
		c4.add(14);
		c4.add(18);
		
		c3.retainAll(c4);
		System.out.println(c3);
		
		System.out.println(c3.containsAll(c4));
		System.out.println(c3);
		
		c3.clear();
		System.out.println(c3);
		
		System.out.println("----------------");
		Collection c8= new ArrayList();
		c8.add(12);
		c8.add(17);
		c8.add(14);
		
		Object o[]=c8.toArray();
		
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		
	}

}
