package aritmtc;

public class Calculator {
	
	void divide(int a, int b) {
		
		System.out.println("divide strt");
		
		try {
		System.out.println(a/b);}
		
		catch(ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		
		System.out.println("divided");
	}

}
