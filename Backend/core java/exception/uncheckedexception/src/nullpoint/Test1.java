package nullpoint;

public class Test1 {
	
	void write() {
		String s1= null;
		try {
	System.out.println(s1.length());}
		catch(NullPointerException e) {
			System.out.println("dont deal wid null");
		}
	}




	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1(); 
			
		t1.write();
			
		
	}
}

