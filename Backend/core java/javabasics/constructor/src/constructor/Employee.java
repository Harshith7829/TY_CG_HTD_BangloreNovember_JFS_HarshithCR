package constructor;

public class Employee {
	
	String Ename;
	int    Sal;
	int    Age;
	
	
	Employee(String n, int a, int b){
		Ename=n;
		Sal= a;
		Age=b;
	}
	void Details() {
		System.out.println("ename is "+Ename+" sal is "+Sal+" Age is "+Age);
	}
	
	

}
