package LinkedLIst1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLis1 {
	
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.add(23);
		l1.add(76);
		l1.add(56);
		l1.add(89);
		l1.add(null);
		
		ListIterator ltr = l1.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		l1.add(76);
		System.out.println(l1);
		l1.remove(new Integer(76));
		System.out.println(l1);
		
		System.out.println("***************for each*******************");
		
		for (Object i1 : l1) {
			
			System.out.println(i1);
		}
		
		System.out.println("***********for loop******************");
		
		for(int i=0 ; i<l1.size();i++) {
			System.out.println(l1.get(i));
			
		}
	}

}
