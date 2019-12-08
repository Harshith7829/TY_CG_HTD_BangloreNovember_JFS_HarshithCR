package Vector1;

import java.util.Vector;

public class Vec2 {
	
	public static void main(String[] args) {
		
		Vector v1= new Vector();
		
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.trimToSize();
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.setSize(10);
		System.out.println(v1);
		
		v1.add(300);
		System.out.println(v1.size());
		
		
		v1.set(6, 7000);
		System.out.println(v1);
		
		
		
		
	}

}
