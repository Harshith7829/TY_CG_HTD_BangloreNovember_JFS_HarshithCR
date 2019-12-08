package constructor;

public class Father {
	
	Father(){
		System.out.println("A");
	}

	Father(String n, int a){
		this();
		System.out.println("B");
	}
}
