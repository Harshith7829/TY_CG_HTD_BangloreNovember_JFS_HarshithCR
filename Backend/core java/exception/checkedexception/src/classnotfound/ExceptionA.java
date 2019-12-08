package classnotfound;

public class ExceptionA {
	
	public static void main(String[] args) {
		
		try {
			Class c1= Class.forName("classnotfound.Person");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}

}
