package stringconstpool;

public class demo1 {
	
	public static void main(String[] args) {
		
		String s1= "john";
		System.out.println("s1 value before  "+s1.hashCode());
		
		String s2= "harshi";
		System.out.println("s2 value        "+s2.hashCode());
		
		String s3="john";
		System.out.println("s3 value    "+s3.hashCode());
	}

}
