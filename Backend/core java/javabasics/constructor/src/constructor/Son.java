package constructor;

public class Son extends Father {
	
	Son(){
		super("john", 23);
		System.out.println("C");
		
	}
	
	Son(String n, int a)
	{
		this();
		System.out.println("D");
	}

}
