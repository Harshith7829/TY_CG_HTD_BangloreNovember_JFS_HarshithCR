package Queue1;

import java.util.PriorityQueue;

public class prior2 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Student> p1= new PriorityQueue<Student>();
		
		p1.offer(new Student(22, "harshi"));
		p1.offer(new Student(23, "moni"));
		p1.offer(new Student(24, "kiran"));
		p1.offer(new Student(22, "harshi"));
		
		for (Student s1 : p1) {
			System.out.println(s1);
			
		}
	
		
		
		
		
	}
}