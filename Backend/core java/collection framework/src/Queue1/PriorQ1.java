package Queue1;

import java.util.PriorityQueue;

public class PriorQ1 {
	
	public static void main(String[] args) {
		
		PriorityQueue p1= new PriorityQueue();
		p1.offer(22);
		p1.offer(40);
		p1.offer(76);
		p1.offer(2);
		p1.offer(65);
		
		System.err.println(p1);
		
		System.err.println(p1.poll());
		
		System.err.println(p1.poll());
		
		System.err.println(p1);
		
		p1.remove();
     	System.err.println(p1);
     	
     	System.err.println("peeeeeek"+p1.peek());
     	
     	System.err.println("element"+p1.element());
		
		for (Object o1 : p1) {
			System.err.println(o1);
		}
	}

}
