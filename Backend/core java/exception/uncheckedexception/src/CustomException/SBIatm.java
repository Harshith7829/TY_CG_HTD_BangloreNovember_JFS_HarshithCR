package CustomException;

public class SBIatm {
	
	public static void main(String[] args) {
		
		ATMsimulator a1= new ATMsimulator();
		try {
		a1.withdraw(41000);}
		catch(DaylimitExceptiom n) {
			System.out.println(n.getMessage());
		}
	}

}
