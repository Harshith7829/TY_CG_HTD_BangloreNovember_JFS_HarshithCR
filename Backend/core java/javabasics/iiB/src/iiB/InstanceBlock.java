package iiB;

public class InstanceBlock {
	
	final int a;
	static final double PI;
	
	public InstanceBlock(){
		System.out.println("constructor executed");
		
	}
	
	public InstanceBlock(int a){
		System.out.println("constructor overloaded");
	}
	{
		System.out.println("instance block executed");
		this.a=233;
		System.out.println(a);
		
	}
	static {
		System.out.println("static initializer block executed");
		PI=3.142;
		
	}

}
