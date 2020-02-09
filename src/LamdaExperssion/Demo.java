package LamdaExperssion;

public class Demo  {

	public static void main(String[] args) {

		
		Interface obj = new Interface(){

			public void show(int i){
				
				System.out.println("hello :"+ i);
				
			}
	
		};
		
		obj.show(10);
		
		
		
		Interface obj1 = (int i)->{
				
				System.out.println("hello :"+ i);
				
			}
	
		 ;
		 obj1.show(10);
		
		
		
		Interface obj2=i->System.out.println("hello :"+ i);
		
		obj2.show(10);
		
		
		
	}

	
}
