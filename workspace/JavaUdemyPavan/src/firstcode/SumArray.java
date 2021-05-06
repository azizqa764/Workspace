package firstcode;

public class SumArray {

	public static void main(String[] args) {
             int a[] = {10,100,200,300};
             int b = 0 ;
             
           /*  for (int i=0;i<a.length;i++)
             {
            	 System.out.println(a[i]);
            	 b = b+a[i];
            	 
             }
             System.out.println(b);  */
             
             // classic for--loop
             for (int i:a)
             {
            	 System.out.println(i);
            	 b = b+i ;
            	 
             }
             System.out.println(b);
             
             
             
             
             
             
	}

}
