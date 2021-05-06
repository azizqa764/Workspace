package methods.java;
//constructor overloading

public class ConstructorDemo {
	
	int x,y ;
	
	ConstructorDemo() {
		x=100;
		y=100;
		
		System.out.println(x+y);
	} 
	
	
	ConstructorDemo( int  a, int b) { //parametrized constructor 
		x=a;
		y=b;
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {
		
		ConstructorDemo cm= new ConstructorDemo(10,20);
    
	}

}
