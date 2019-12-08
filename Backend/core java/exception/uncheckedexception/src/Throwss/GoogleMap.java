package Throwss;

public class GoogleMap {
	
	void findLoc(String s) {
		try {
		System.out.println(s.length());}
		catch(NullPointerException n) {
			System.out.println("GoogleMap user Plz fill location ");
			throw n;
		}
	}

}
