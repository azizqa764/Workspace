package firstcode;

public class Arraysearch {

	public static void main(String[] args) {
	  int a [] = {10,200,100,50,70,30};
	  int num = 10;
	  boolean flag = false;
	  
	  for(int i :a)
	  {
		 if (i==num)
		 {
			 System.out.println("Element found");
			 flag=true;
			 break;
		 } 
		 
	  }
	  if(flag==false)
	  {
		  System.out.println("ELement not found");
	  }
	  

	}

}
