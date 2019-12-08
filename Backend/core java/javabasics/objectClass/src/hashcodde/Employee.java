package hashcodde;

public class Employee {
	
	int age;
	
	String s;

	public Employee(int age, String s) {
		super();
		this.age = age;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", s=" + s + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	
	
	
	

}
