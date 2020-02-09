package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter1 {

	public static void main(String arg[]){
		
		
		List<Integer> list =Arrays.asList(20,84,65,45,25,32,15);
		
		Predicate<Integer> p=new Predicate<Integer>() {
			
			public boolean test(Integer i){
				
				return i%5==0;
			}
		};
		
		System.out.println(list.stream().filter(p).reduce(0,(c,e)->c+e));
	}
}
