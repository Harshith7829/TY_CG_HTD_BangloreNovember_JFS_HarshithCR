package ArrayOOBEx;

public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		int a1[]= new int[2];
		a1[0]=20;
		a1[1]=44;
		try {
		a1[2]=66;}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("there is no size to store the data");
		}
		System.out.println("main ended");
		
	}

}
