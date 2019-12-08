package Treset;

import java.util.Iterator;
import java.util.TreeSet;

public class TS3 {
	
	public static void main(String[] args) {
		
		compAg1 ag= new compAg1();
		compSal ag2= new compSal();
		compName ag3= new compName();
		
		TreeSet<Employee> t1= new TreeSet<Employee>(ag3);
		
		t1.add(new Employee(22, 2000, "harshi"));
		t1.add(new Employee(34, 4000, "renu"));
		t1.add(new Employee(45, 6000, "liki"));
		t1.add(new Employee(56, 8000, "moni"));
		
		for (Employee e1 : t1) {
			System.out.println("employee age is"+e1.age);
			System.out.println("employee name is"+e1.name);
			System.out.println("employee salary is"+e1.salary);
		}
	}

}
