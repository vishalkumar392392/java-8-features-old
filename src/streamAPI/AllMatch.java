package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	
	public static void main(String args[]){
		
		List<Integer> list = Arrays.asList(20, 84, 65, 45, 25, 32, 15);

		System.out.println(list.stream().allMatch(i -> i <25));
	}

}
