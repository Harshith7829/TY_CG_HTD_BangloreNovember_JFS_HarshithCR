package NestedTry;

public class ExceptionB {
	
	void exception(int a, String b) {
		 try {
			 System.out.println(500/a);
			 
			 try {
				 System.out.println(b.length());
			 }catch(NullPointerException e) {
				 System.out.println("Dont deal with null ");}
		 
		 } catch(ArithmeticException e) {
			 System.out.println("Dont deal with Zero ");
		 }
	}

}
