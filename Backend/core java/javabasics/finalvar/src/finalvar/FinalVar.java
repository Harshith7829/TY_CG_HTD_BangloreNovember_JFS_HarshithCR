package finalvar;

public class FinalVar {
	
	final double PI;
	
	FinalVar(double PI)
	{
		this.PI=PI;
	}
	
	FinalVar(int a, double PI){
		this.PI=PI;
	}

	void piValue() {
		System.out.println(PI);
	}
	
	
}
