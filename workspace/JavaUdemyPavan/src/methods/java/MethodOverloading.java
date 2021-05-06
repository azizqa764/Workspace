package methods.java;

public class MethodOverloading {
	int x,y;
    double z;
    
    int addition()    //1
    {
    	x=10;
    	y=20;
    	return (x+y);
    }
    
    int addition(int a , int b) //2
    {
    	x=a;
    	y=b;
    	return (x+y);
    }
    
    double addition(int a , double b) //3
    {
    	x=a;
    	z=b;
    	return(x+y);
    }
    
	
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.addition());
		System.out.println(mo.addition(25, 34));
		System.out.println(mo.addition(10, 30.5));
		
     
     
	}

}
