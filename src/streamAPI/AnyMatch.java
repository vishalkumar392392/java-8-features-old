package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String arg[]) {

		List<Integer> list = Arrays.asList(20, 84, 65, 45, 25, 32, 15);

		System.out.println(list.stream().anyMatch(i -> i % 55 == 0));
	}
}
