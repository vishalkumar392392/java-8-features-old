package forEach;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String arg[]){
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		for(Integer i :list){
			
			System.out.println(i);
		}
		
		
		list.forEach(i-> System.out.println(i));
		
		
	}
}

