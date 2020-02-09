package methodRefernce;

import java.util.Arrays;
import java.util.List;

public class Demo {


	public static void main(String arg[]){
		
		List<String> list = Arrays.asList("vishal","prabhas","shahid","robert");
		
		list.forEach(System.out::println);
	}

}
