package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Count {
	
	public static void main(String arg[]){
		
		List<String> list = Arrays.asList("vishal");
		
		Stream <String> stream =list.stream();
		long count = stream
				  .map((value) -> { return value.toLowerCase(); })
				  .map((value) -> { return value.toUpperCase(); })
				  .map((value) -> { return value.substring(0,3); })
				  .count();
		
		System.out.println(count);
	}

}
