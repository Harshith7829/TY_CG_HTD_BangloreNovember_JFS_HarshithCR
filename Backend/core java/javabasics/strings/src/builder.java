
public class builder {
	
	public static void main(String[] args) {
		
		StringBuilder s1= new StringBuilder("John");
		System.out.println(s1.hashCode());
		
		s1= s1.append("cena");
		System.out.println(s1.hashCode());
	}

}
