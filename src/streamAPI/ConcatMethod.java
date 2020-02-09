package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConcatMethod {
	
	public static void main(String arg[]){
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("vishal");
		stringList.add("vema");
		stringList.add("jasmine");
		
		Stream<String> stream1 = stringList.stream();
		
		List<String> stringList1 = new ArrayList<String>();

		stringList1.add("rashmika");
		stringList1.add("preethi");
		stringList1.add("priyanka");
		
		Stream<String> stream2 = stringList1.stream();
		
		Stream<String> stream =Stream.concat(stream1, stream2);
		
		stream.forEach(i->System.out.print(i+" "));
		
		
	}

}
