package exceptionhandling;

public class FinallyBlockExample {
	public static void main(String[] args) {
		
		System.out.println("program is started ");
		System.out.println("program i sprogress");
	
	
	int a = 100 ;
	
	try 
	{
		System.out.println(a/0);
	}
	catch (ArithmeticException e)
	{
		System.out.println("Arithematic exception is occured and handled");
	}
	
finally 
{
	System.out.println("this is finally block ");
}
	 System.out.println("program is completed");
	 System.out.println("program is exited ");

}
}