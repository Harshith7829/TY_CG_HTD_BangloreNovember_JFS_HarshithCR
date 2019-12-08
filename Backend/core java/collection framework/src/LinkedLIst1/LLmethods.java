package LinkedLIst1;

import java.util.LinkedList;

public class LLmethods {
	
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.add(34);
		l1.add(67);
		l1.add(89);
		l1.add(56);
		l1.add(45);
		
		System.out.println(l1);
		l1.offer(76);
		System.out.println(l1);
		
		l1.offerFirst(56);
		System.out.println(l1);
		
		l1.offerLast(99);
		System.out.println(l1);
		
		System.out.println("*************peek***************");
		
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println("****************poll****************");
		
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
	}

}
