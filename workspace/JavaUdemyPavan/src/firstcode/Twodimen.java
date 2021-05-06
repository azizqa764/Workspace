package firstcode;


//Declare 
//initialize
//find the size 
// read the value

public class Twodimen {

	public static void main(String[] args) {
		
		int a1[][] =  new int[3][2] ; // 3= rows , 2= columns 
		
		a1[0][0] = 100 ;
		a1[0][1] = 200 ;
		a1[1][0] = 300 ;
		a1[1][1] = 400 ;
		a1[2][0] = 500 ;
		a1[2][1] = 600 ;
		
		int a [][] ={ {100,200}, {300,400} , {500,600} };  //rows and columns 
		
		System.out.println("number of rows:" + a.length);
		System.out.println("number of colums :" + a[0].length);
       
		/*for (int i=0; i <a.length;i++) { //i represents row index i = 0
			for (int j=0;j<a[i].length;j++) //j coolumnn index j = 0
			{
				System.out.println(a[i][j]); 
			}
		} */
		
		//Enhanced for loop 
		for (int r[]:a)  // a represents two values from the array (colums)
			// r is single dimensional array holding first 2 values in column of array a 
		{
			for (int i :r) // here 2 values are assigned to i 
			{
				System.out.print(i+"  "); // here its printing with spaces in b/w the values 
			}
			System.out.println(); // here it will show in tabular form 
		}
		
	}

}
