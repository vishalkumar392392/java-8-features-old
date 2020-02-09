package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter {
	
	public static void main(String arg[]){
		
		List<Integer> list =Arrays.asList(12,20,30,45,88,62,35);
		
		System.out.println(list.stream().map(i->i*2).filter(i->i%5==0).reduce(0,(c,e)->c+e));
	}

}
