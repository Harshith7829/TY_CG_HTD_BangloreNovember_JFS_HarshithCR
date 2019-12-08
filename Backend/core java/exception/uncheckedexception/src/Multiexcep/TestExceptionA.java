package Multiexcep;

public class TestExceptionA {

	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		ExceptionA e1= new ExceptionA();
		
		e1.exception(2, null);
		
		e1.exception(6, "ramu");
		
		System.out.println("main ended");
	}
}
