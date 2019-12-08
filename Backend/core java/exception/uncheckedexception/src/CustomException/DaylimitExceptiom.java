package CustomException;

public class DaylimitExceptiom extends RuntimeException{
	String msg="amount exceeded";
	
	public DaylimitExceptiom() {
		
	}
	public DaylimitExceptiom(String msg) {
		this.msg=msg;
	}
	
	public String getMessage() {
		return this.msg;
	}

}
