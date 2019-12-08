package throwandthrows;

public class Paytm {
	
	IRCTC i1;
	
	public Paytm(IRCTC i1) {
		this.i1=i1;
	}
	
	public void bookTickets() {
		
		
		try {
			i1.confirmTicket();
			System.out.println("ticket confirmed by PAYTM");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket is not confirmed");
		}
	}

}
