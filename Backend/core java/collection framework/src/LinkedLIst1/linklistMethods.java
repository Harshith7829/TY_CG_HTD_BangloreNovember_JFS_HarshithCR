package LinkedLIst1;

import java.util.LinkedList;

public class linklistMethods {
	
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(22);
		
		System.out.println(l1);
		
		l1.addFirst(66);
		System.out.println(l1);
		
		l1.addLast(77);
		System.out.println(l1);
		
		System.out.println("*********get*********************");
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println("********Remove frst and last occurance***********");
		l1.removeFirstOccurrence(22);
		System.out.println(l1);
		l1.removeLastOccurrence(55);
		System.out.println(l1);
		
		System.out.println("*****************remove 1st last**************");
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		System.out.println(l1.removeLast());
		System.out.println(l1);
		
		
	}

}
