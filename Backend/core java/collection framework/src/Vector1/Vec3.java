package Vector1;

import java.util.Vector;

public class Vec3 {
	
	public static void main(String[] args) {
		
		Vector v1= new Vector();
		
		v1.addElement(44);
		v1.addElement(84);
		v1.addElement(74);
		v1.addElement(54);
		v1.add(67);
		
		System.out.println(v1);
		
		v1.removeElement(new Integer(74));
		System.out.println(v1);
		
		v1.removeElementAt(3);
		System.out.println(v1);
		
		
		Object o1[]= new Object[v1.size()];
		
		v1.copyInto(o1);
		
		for(int i=0; i<o1.length;i++) {
			System.out.println(o1[i]);
		}
	}

}
