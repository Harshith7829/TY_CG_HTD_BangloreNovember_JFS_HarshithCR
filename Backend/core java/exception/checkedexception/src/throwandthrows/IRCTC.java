package throwandthrows;

public class IRCTC {
	
	void confirmTicket() throws ClassNotFoundException {
		
		try {
			Class.forName("throwandthrows.Paytm");
			System.out.println("ticket confirm by IRCTC");
		} catch (ClassNotFoundException e) {
			System.out.println("Ticket is not confirmed");
			throw e;
		}
	}

}
