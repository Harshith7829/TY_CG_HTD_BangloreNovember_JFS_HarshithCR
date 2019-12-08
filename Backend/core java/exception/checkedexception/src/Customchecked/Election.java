package Customchecked;

public class Election {
	
	void vote(int age) throws AgeLimitExcep {
		if(age<18) {
			throw new AgeLimitExcep();
		}else {
			System.out.println("eligible to vote");
		}
	}

}
