package toStr;

public class Student {
	
	int studId;
	String studName;
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "studId=" + studId + ", studName=" + studName ;
	}
	

		
	

}
