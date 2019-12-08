package PredicateP;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predi1 {

		public static void main(String[] args) {
			
			System.err.println("***********predicate*******************");
			Predicate<Integer> p = i -> i%2==0;
			
			boolean b1= p.test(12);
			System.out.println(b1);
			
			System.out.println(p.test(13));
			
			System.err.println("******************function*****************");
			Function<Integer, Integer> f= i->i*100;
			
			int a1=f.apply(45);
			System.out.println(a1);
			
			System.err.println("******************supplier********************");
			Supplier<Person> s = () -> new Person(34, "harsh");
			
			System.out.println(s.get().getAge());
			System.out.println(s.get().getName());
			
			System.err.println("******************consumer***********************");
			
			Consumer<Person> c = j ->{
				System.out.println(j.getAge());
				System.out.println(j.getName());
			};
			
			Person p1 = new Person(77, "harsh");
			c.accept(p1);
		}
}
