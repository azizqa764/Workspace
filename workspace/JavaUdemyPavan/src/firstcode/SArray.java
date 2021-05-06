package firstcode;


//Declare 
//initialize
//find the size 
//read the value

public class SArray {

	public static void main(String[] args) {
             
		int a[] = new int[5]; //declaring array (fixed array)
		
	/*	//inserting values into array 
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		*/
		
		int b[] = {100,200,300,400,500};  //dynamic array  declaring and initializing
		
		System.out.println(b.length);
		
		System.out.println(b[2]);
		
		//classic for...loop 
		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			
		}
		
		// for---each loop 
		
		for (int i:b)
		{
			System.out.println(i);
		}
	}

}
