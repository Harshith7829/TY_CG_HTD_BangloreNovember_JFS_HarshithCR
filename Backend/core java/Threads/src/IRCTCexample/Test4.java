package IRCTCexample;

public class Test4 {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		IRCTC i1= new IRCTC();
		
		User u1= new User(i1);
		u1.start();
		
		
		
		User u2= new User(i1);
		u2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i1.leaveMe();
		System.out.println("main ended");
		
	}

}
