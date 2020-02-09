package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class MinMethod {
	
	public static void main(String args[]){
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("vishal");
		stringList.add("vema");
		stringList.add("jasmine");
		
		System.out.println(stringList.stream().min((val1,val2)->val1.compareTo(val2)));
	}

}
