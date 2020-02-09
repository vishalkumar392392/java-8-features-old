package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Internal_Iteration {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		for(Integer i:values)
			System.out.print(i+" ");
		
		System.out.println();
		Iterator<Integer> iterator = values.iterator();
		
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
		System.out.println();
		
		values.forEach(i->System.out.print(i+" "));
		System.out.println("***********");
		values.forEach(System.out::print);
	}
	
	

}
