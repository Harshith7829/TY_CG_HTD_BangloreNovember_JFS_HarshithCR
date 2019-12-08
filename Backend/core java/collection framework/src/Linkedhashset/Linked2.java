package Linkedhashset;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linked2 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> e1= new LinkedHashSet<Employee>();
		
		e1.add(new Employee(22, "harshi"));
		e1.add(new Employee(23, "amma"));
		e1.add(new Employee(24, "moni"));
		e1.add(new Employee(22, "liki"));
		
		java.util.Iterator<Employee> itr = e1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
