package exceptionhandling;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		System.out.println("program is started");
		System.out.println("Program is in progress");
		
	/*	System.out.println("Enter a number ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
				int a = 100;
				
				try {
					System.out.println(a/num); 
				} catch(ArithmeticException e) 
				{
					System.out.println("Exception is occurred and handled successfully");
				} */
		
		
		//Number format exception
		
	String s = "welcome"; //----> change this to number you will get the mention excepion
		int  n =0;
		
		try 
		{ 
			n =  Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Exception aaya aur sambhal liye ");
		}
		System.out.println(n+100);  
		
		
		/* //Null pointer exception 
		String s = null ;
		System.out.println(s.length());  */
		
		
		System.out.println("Program is completed ");
		System.out.println("Program is exited ");

	}

}
