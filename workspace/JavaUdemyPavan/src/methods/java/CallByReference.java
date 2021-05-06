package methods.java;

public class CallByReference {
	
int x ;
	
	public void addition(int a )
	{
		x = a+5; 
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		CallByReference cr = new CallByReference();
		cr.x = 10;
		cr.addition(cr.x);

	}

}
