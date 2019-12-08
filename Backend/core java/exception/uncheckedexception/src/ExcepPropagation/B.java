package ExcepPropagation;

public class B {
	static void n() {
		
		try {
		C.m();}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
