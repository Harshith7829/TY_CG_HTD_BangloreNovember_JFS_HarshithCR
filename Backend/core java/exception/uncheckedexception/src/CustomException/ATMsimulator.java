package CustomException;

public class ATMsimulator {
	
	void withdraw(double amount) {
		if(amount>40000) {
			throw new DaylimitExceptiom();
		}
	}

}
