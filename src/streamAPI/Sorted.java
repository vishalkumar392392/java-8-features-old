package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String arg[]){
		
		
		List<String> list = Arrays.asList("vishal","vema","jasmine");
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		
	}
}
