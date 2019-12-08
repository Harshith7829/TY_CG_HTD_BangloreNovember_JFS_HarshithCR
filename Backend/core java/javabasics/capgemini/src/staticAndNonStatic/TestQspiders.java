package staticAndNonStatic;

public class TestQspiders {
	
	public static void main(String[] args) {
		
		Qspiders btm = new Qspiders();
		btm.swipe();
		btm.swipe();
		
		Qspiders btr= new Qspiders();
		btr.swipe();

		System.out.println(Qspiders.totalcount);
		System.out.println(btr.branchcount);
		System.out.println(btm.branchcount);
		
	}
}
