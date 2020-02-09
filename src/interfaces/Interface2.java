package interfaces;

public interface Interface2 {

	int a = 5;
	int b = 6;

	public void speed();
	
	default void name(){
		
		System.out.println("Interface 2");
	}

	default int multiply() {

		return a * b;

	}

	default String same() {

		return "Same method in two interfaces";
	}

}
