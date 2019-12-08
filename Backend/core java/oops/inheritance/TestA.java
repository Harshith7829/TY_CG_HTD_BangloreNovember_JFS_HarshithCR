package inheritance;

public class TestA {
	public static void main(String[] args) {
		
	
	Frstgen fg=new Frstgen();
	fg.call();
	fg.msg();
	
	Secgen sg=new Secgen();
	sg.call();
	sg.msg();
	sg.radio();
	
	Thrdgen tg= new Thrdgen();
	tg.call();
	tg.msg();
	tg.radio();
	tg.camera();
	
	
	
	}
}
