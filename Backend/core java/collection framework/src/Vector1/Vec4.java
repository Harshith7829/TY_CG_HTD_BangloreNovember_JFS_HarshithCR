package Vector1;

import java.util.Vector;

public class Vec4 {
	
	public static void main(String[] args) {
		
		Vector v1= new Vector();
		
		v1.addElement(55);
		v1.addElement(87);
		v1.addElement(89);
		v1.addElement(45);
		v1.addElement(65);
		v1.addElement(76);
		v1.addElement(33);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.ensureCapacity(8);
		System.out.println(v1.capacity());
		System.out.println(v1);
		v1.setSize(10);
		System.out.println(v1);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
	}

}
