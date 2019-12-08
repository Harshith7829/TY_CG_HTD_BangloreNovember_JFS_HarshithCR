package Hashset;

import java.util.HashSet;

public class HashSet2 {
	
	public static void main(String[] args) {
		
		HashSet<Student> h1= new HashSet<Student>();
		
		h1.add(new Student(22, "harshi"));
		h1.add(new Student(56, "RENUKA"));
		h1.add(new Student(34, "MONI"));
		h1.add(new Student(89, "LIKI"));
		h1.add(new Student(22, "harshi"));
		
		for (Student s1 : h1) {
			System.out.println("Age is "+s1.studAge+" and name is "+s1.studName);
		}
	}

}
