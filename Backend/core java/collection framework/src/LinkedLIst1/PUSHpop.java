package LinkedLIst1;

import java.util.LinkedList;

public class PUSHpop {
	
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		
		l1.add(34);
		l1.add(67);
		l1.add(98);
		l1.add(89);
		
		System.out.println(l1);
		l1.push(44);
		
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);
		
		System.out.println(l1.element());
		System.out.println(l1);
	}

}
