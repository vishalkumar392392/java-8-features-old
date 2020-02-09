package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	
	public static void main(String arg[]){
		
		List<String> list = Arrays.asList("vishal","vema","jasmine","rashmika");
		
		List<String> finalList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(finalList);
		
	}

}
