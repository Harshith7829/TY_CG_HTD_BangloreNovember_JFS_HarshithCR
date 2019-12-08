
public class TestPerson {
	public static void main(String[] args) {
	
		
		Person p1= new Person();
		p1.age=22;
		p1.name= "john";
		
		p1.personDetails();
		
		Person p2= new Person();
		p2.initialize(22, "Harshi");
		p2.personDetails();
	}

}
