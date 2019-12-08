package Finally;

public class FinalBlock {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		try {
			System.out.println(10/0);
			
		} catch(ArithmeticException e) {
			System.out.println("dont deal wid 0");
		}finally {
			System.out.println("finally block execued");
		}
		System.out.println("main ended");
	}

}
