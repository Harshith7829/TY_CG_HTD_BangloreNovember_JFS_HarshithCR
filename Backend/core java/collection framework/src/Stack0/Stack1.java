package Stack0;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		
		Stack s1= new Stack();
		
		s1.add(12);
		s1.add(89);
	    s1.add(34);

		System.out.println(s1);
		System.out.println(s1.search(12));
		
		System.out.println(s1.pop());
		System.out.println(s1);
		
		System.out.println(s1.search(34));
		s1.pop();
		System.out.println(s1.search(12));
	}

}
