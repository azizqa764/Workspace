package methods.java;

public class StaticExample {
	
	static int a=10; //static variable
	
    int b=20;
    
    static void m1() {   //static method
    	System.out.println("this is m1 static meyhod");
    }
    
    void m2() {         // non static method
    	System.out.println("this is m2 non static method");
    }
    
    void m3() 
    {
    	System.out.println("......output from m3 ");
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    }

	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		StaticExample se = new StaticExample() ; 
		System.out.println(se.b);
		se.m2();
		
		//StaticExample se1 = new StaticExample() ; 
		//se1.m3();
		
          
          
	}

}
