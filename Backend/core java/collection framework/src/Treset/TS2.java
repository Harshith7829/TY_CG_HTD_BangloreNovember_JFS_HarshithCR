package Treset;

import java.util.Iterator;
import java.util.TreeSet;





public class TS2 {
	
	public static void main(String[] args) {
		
		TreeSet<Student> t1= new TreeSet<Student>();
		
		t1.add(new Student(22, "johny"));
		t1.add(new Student(45, "monkey"));
		t1.add(new Student(89, "pinky"));
		t1.add(new Student(54, "rikki"));
		t1.add(new Student(22, "johny"));
		
		Iterator<Student> itr= t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
