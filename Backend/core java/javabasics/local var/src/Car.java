
public class Car extends Vehicle {
	
	int cost=30000;
	
	void carDetails() {
		int cost=20000;
		
		System.out.println("local var is "+ cost);
		System.out.println("global var is "+ this.cost);
		System.out.println("super var is "+  super.cost);
	}

}
