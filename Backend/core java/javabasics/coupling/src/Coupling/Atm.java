package Coupling;

public class Atm {
	
	void card(Bank b) {
		
		b.deposit();
		b.withdraw();
	}

}
