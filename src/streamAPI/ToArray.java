package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public static void main(String arg[]){
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("vishal");
		stringList.add("vema");
		stringList.add("jasmine");
		
		Object[] arr=stringList.stream().toArray();
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
