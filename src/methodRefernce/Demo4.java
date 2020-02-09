package methodRefernce;

import java.util.Arrays;

import java.util.List;

public class Demo4 {

	public static void main(String arg[]) {

		List<String> list = Arrays.asList("vema", "vishal", "jasmine");
		List<String> list1 = Arrays.asList("VEMA", "VISHAL", "JASMINE");

		list.forEach(name->Demo4.toUpperCase(name));
		list1.forEach(Demo4::toLowerCase);
	}

	public static void toUpperCase(String name) {

    
		System.out.println(name.toUpperCase());
	}
	public static void toLowerCase(String name) {

	    
		System.out.println(name.toLowerCase());
	}

}
