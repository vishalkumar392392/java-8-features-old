package interfaces;

public interface Interface1 {

	int a = 5;
	int b = 5;

	public void speed();

	default void name(){
		System.out.println("Interface 1");
	}

	static void division() {

		System.out.println("static method");
	}




}
