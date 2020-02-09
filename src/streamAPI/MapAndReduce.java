package streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapAndReduce {
	
	public static void main(String arg[]){
		
		List<Integer> list =Arrays.asList(12,20,30,45,88,62,35);
		
		int result =list.stream().map(new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer t) {
			
				int res=0;
				if(t%5==0){
				    res = t;
				}
					return res;
			}
			
		}).reduce(0,(c,e)->c+e);
		
		System.out.println(result);
	}

}
