import java.io.Serializable;

public class Person implements Serializable{
	
	private int age;
	private String name;
	
	
	public void setMsg(int age) {
		this.age=age;
	}
	public int getMsg() {
		return this.age;
	}
	
	
	public void setName(String name) {
		this.name=name;;
	}
	public String getName() {
		return this.name;
	}
	

}
