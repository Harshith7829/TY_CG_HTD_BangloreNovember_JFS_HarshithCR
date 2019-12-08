package throwandthrows;

public class User {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		IRCTC i1= new IRCTC();
		Paytm p1= new Paytm(i1);
		p1.bookTickets();
		System.out.println("main ended");
	}

}
