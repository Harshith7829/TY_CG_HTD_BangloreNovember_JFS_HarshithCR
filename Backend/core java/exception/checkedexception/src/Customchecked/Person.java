package Customchecked;

public class Person {
	public static void main(String[] args) {
		
		Election e1= new Election();
		
		try {
			e1.vote(9);
		} catch (AgeLimitExcep e) {
			System.out.println(e.getMessage());
		}
	}

}
