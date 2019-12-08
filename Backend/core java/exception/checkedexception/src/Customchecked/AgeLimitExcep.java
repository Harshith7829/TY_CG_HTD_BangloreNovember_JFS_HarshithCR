package Customchecked;

public class AgeLimitExcep extends Exception{
	
	String msg="age should be more than 18";
	
	public AgeLimitExcep(){
		
	}
	
	public AgeLimitExcep(String msg) {
		
		this.msg=msg;
	}
	

	public String getMessage() {
		return this.msg;
	}
	
	

}
