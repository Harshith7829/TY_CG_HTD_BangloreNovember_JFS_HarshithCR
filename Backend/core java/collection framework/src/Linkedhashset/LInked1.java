package Linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LInked1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet l1= new LinkedHashSet();
		
		l1.add(23);
		l1.add(34);
		l1.add(98);
		l1.add(null);
		l1.add(23);
		
		Iterator itr = l1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	LinkedHashSet<Integer> l2= new LinkedHashSet<Integer>();
		
		l2.add(88);
		l2.add(76);
		l2.add(98);
		l2.add(null);
		l2.add(88);
		
		Iterator<Integer> itr1 = l2.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
	}
	}
	

}
