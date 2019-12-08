package staticAndNonStatic;

public class TestPerson {
	
	public static void main(String arr[]) {
		
		Person p1= new Person();
		
		p1.name= "Harshith";
		Person.age= 22;
		
		p1.personDetails();
		
	}

}
