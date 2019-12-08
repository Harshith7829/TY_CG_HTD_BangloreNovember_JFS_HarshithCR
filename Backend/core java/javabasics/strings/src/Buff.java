
public class Buff {

	
		public static void main(String[] args) {
			
			StringBuffer s1= new StringBuffer("john");
			System.out.println(s1.hashCode());
			
			s1=s1.append("cena");
			System.out.println(s1.hashCode());
		}
}
