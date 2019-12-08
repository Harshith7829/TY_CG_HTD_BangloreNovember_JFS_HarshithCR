package LIST;

import java.util.ArrayList;
import java.util.List;

public class BuiltinMethods {
	public static void main(String[] args) {
		
		List c1= new ArrayList();
		
		c1.add(0, 66);
		c1.add(1, 78);
		c1.add(2, 35);
		c1.add(3, 88);
		c1.add(4,78);
		c1.add(1, 455);
		
		System.out.println(c1);
		
		c1.remove(2);
		System.out.println(c1.get(2));
		
		System.out.println(c1.indexOf(88));
		
		System.out.println(c1.lastIndexOf(78));
		
		for(int i=0;i<c1.size();i++) {
			System.out.println(c1.get(i));
		}
		
		List c2= new ArrayList();
		
		c2.add(0, 99);
		c2.add(1, 21);
		c2.add(2, 34);
		c2.add(3, 66);
		c2.add(4,78);
		
		c1.addAll(2, c2);
		System.out.println(c1);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
