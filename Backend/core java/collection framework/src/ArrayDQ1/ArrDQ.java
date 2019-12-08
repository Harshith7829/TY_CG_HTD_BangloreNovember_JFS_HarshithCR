package ArrayDQ1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrDQ {
	
	public static void main(String[] args) {
		
		ArrayDeque a1= new ArrayDeque();
		a1.add(23);
		a1.add(56);
		a1.addFirst(34);
		a1.add(89);
		a1.add(99);
		a1.add(44.56);
		a1.add("string");
		
		 
		Iterator itr= a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("******************************************");
		
		ArrayDeque<String> a2= new ArrayDeque<String>();
		a2.add("jjjj");
		a2.add("dddd");
		a2.addFirst("llll");
		a2.add("oooo");
		a2.add("bbbb");
		a2.add("kkkk");
		a2.add("string");
		
		a2.addLast("lll");
		System.out.println("peek"+a2.peek());
		System.out.println("poll"+a2.poll());
		
		Iterator itr1= a2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
