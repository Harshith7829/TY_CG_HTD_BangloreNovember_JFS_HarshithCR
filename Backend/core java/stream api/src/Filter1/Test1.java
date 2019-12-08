package Filter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		a1.add(22);
		a1.add(23);
		a1.add(24);
		a1.add(25);
		a1.add(26);
		a1.add(27);
		
		
		System.out.println("*************filter*************");
		List l1=a1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println(l1);
		
		
		System.out.println("*************map******************");
		List l2=a1.stream().map(i -> i*100).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("***********largest number********");
		Optional<Integer> i1=a1.stream().max((i,j) -> i.compareTo(j));
		System.out.println(i1);
		
		System.out.println(a1.stream().count());
	}

}
