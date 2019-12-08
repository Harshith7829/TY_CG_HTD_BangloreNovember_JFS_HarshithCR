package eqlex;

public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(22,"ttyt");
		Employee1 e2=new Employee1(22,"ttyt");
		Employee1 e3=new Employee1(22,"tty");
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		
	}

}
