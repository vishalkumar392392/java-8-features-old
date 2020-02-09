package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String arg[]){
		
		List<Integer> list = Arrays.asList(20, 84, 65, 45, 25, 32, 15);
		
		System.out.println(list.stream().filter(i->i%5==0).findFirst());
	}
}
