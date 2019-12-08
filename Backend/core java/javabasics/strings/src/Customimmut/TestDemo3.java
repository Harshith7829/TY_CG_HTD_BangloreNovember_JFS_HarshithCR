package Customimmut;

public class TestDemo3 {
	
	public static void main(String[] args) {
		
		Demo3 d1= new Demo3("ggg", 33);
		
		System.out.println(d1.hashCode());
		
		d1= new Demo3("hhh",44);
		System.out.println(d1.hashCode());
		
		int a1=d1.getAge();
		String s1= d1.getName();
		System.out.println(a1);
		System.out.println(s1);
		
	}

}
