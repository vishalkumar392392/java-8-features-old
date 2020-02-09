package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Reduce {

	public static void main(String arg[]) {

		List<Integer> list = Arrays.asList(20, 84, 65, 45, 25, 32, 15);

		Predicate<Integer> p = new Predicate<Integer>() {

			public boolean test(Integer i) {

				return i % 5 == 0;
			}
		};
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>(){

			
			public Integer apply(Integer a, Integer b) {
				
				return (a+b);
			}
			
			
		};
		
		System.out.println(list.stream().filter(p).reduce(b));
	}
}
