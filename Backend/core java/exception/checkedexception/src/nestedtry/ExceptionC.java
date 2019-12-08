package nestedtry;

public class ExceptionC {
	
	public static void main(String[] args) {
		
	System.out.println("main started");
	
	Employee s1= new Employee();
	
	try {
		Object s2= s1.clone();
		
		try {
		Class c1= Class.forName("nestedtry.Employee");
		System.out.println("class found");}
	catch(ClassNotFoundException c) {
		System.out.println("class not found");}
	}catch (CloneNotSupportedException e) {
		
		System.out.println("clone not supported");}
	
	System.out.println("main ended");
	}

}



