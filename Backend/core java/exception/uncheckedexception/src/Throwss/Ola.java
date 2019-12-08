package Throwss;

public class Ola {
	
	GoogleMap g1;
	
	public Ola(GoogleMap s) {
		 this.g1=s;
	}
	
	void findLoc(String x) {
		try {
			g1.findLoc(x);
		}catch(NullPointerException n) {
			System.out.println(" Ola user pls fill location");
		}
	}
	
	

}
