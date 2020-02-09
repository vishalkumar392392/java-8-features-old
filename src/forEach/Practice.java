package forEach;

public class Practice {
	
	public static void main(String []args) {
		
		
		String name = "hello world";
		
		String array[]=name.split(" ");
		
		String dup= array[1];
		String res= dup.toUpperCase().substring(0, 1)+dup.substring(1);
	
		System.out.println(res);
		
		System.out.println(name.substring(5).toUpperCase());
	}

}
