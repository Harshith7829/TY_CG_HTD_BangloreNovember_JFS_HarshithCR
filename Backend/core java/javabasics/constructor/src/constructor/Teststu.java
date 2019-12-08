package constructor;

public class Teststu {

		public static void main(String[] args) {
			
			Student s1=new Student();
			System.out.println(s1.name);
			System.out.println(s1.age);
			
			Student s2=new Student("hhh", 33);
			System.out.println(s2.name);
			System.out.println(s2.age);
		}
}
