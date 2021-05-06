package exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("Program is in progress");
		
		int a = 100 ;
		
		try 
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("exception done and haldled");
		}
		
		/*catch (ArithmeticException e)
		{
			System.out.println("Arithematic exception is occured and handled");
		}
		catch (NullPointerException e)
		{
			System.out.println("Nullpointerexception is occurred and handled");
		}
		catch (NumberFormatException e )
		{
			System.out.println("Numberformatexception is occurred  and handed");
		} */
				System.out.println("Program is completed");
				System.out.println("program is exited");
	}

}
