package inheritance_concept;

//final keyword using variable 

public class FinalVariableDemo {
	
	final int speed = 100 ;

	public static void main(String[] args) {
		
		FinalVariableDemo fm = new FinalVariableDemo() ;
		fm.speed = 200; 
		
		System.out.println(fm.speed);

	}

}
