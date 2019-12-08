package Vector1;

import java.util.Vector;

public class VEC1 {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(20);
		
		System.out.println(v1);
		
		v1.remove(2);
		System.out.println(v1);
		
		v1.set(0, 60);
		System.out.println(v1);
		
		System.out.println("***********for**************");
		
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
				
	}

}
