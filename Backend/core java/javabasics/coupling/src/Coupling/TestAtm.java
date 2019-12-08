package Coupling;

public class TestAtm {
	public static void main(String[] args) {
		
		Atm a1=new Atm();
		
		Sbi s1= new Sbi();
		Bank b1= new Bank();
		Hdfc h1=new Hdfc();
		Syndicate s2= new Syndicate();
		
		a1.card(s1);
		
		
		
	}
}
