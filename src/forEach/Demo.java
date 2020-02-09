package forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;



class ConsImpl implements Consumer<Integer>{


	public void accept(Integer i) {
		
		System.out.println(i);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Consumer<Integer> obj1= new Consumer<Integer>(){

			
			public void accept(Integer t) {
			
				System.out.print(t+" ");
			}	
		};
		
		list.forEach(obj1);

		Consumer<Integer> obj ;
		   obj= (i)-> System.out.print(i+" ");
			   
		   
		   list.forEach(obj);
		   
		   
		   
		   
		   list.forEach(i-> System.out.print(i));
		   
		   
		   
		   
		   
		   
		   
		   System.out.println("======");
		   list.forEach(i-> System.out.print(i*2+" "));
		   
		   System.out.println("=====================================");
		   list.stream().map(i->i*2).forEach(i-> System.out.print(i+" "));
		   
		   Stream<Integer> stream =Stream.of(1,2,3,4,5);
		   System.out.println();
		  System.out.println( list.stream().reduce(0,(i,j) ->(i+j)));
		  
		  System.out.println("=====================================");
		  
		  List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
			List<Integer> result = new ArrayList<Integer>();
			 
			Stream<Integer> stream1 = ss.parallelStream();
			
			 
			stream1.map(s -> {
			        synchronized (result) {
			          if (result.size() < 10) {
			            result.add(s);
			          }
			        }
					return s;
			    }).forEach( e -> {});
			 System.out.println(result);   
		   
		
	}

}
