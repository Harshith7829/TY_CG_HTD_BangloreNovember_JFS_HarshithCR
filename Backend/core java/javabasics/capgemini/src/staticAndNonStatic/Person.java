package staticAndNonStatic;

public class Person {
	
	static int age;
	String name;
	
	void personDetails() {
		System.out.println("my name is "+ name + " and age is " + age);
		PersonDetailsStatic();
		
	}
	
	static void PersonDetailsStatic() {
		System.out.println(age);
	}

}
