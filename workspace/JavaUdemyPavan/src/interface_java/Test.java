package interface_java;



interface A 
{
	int  a = 10;
	void m1() ; 
	
}

public class Test implements A,B1
{ 
	public void m1() 
	{
		System.out.println(a);
	}
     
	public void m2() 
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj =  new Test();
		obj.m1();
		obj.m2();

	}

}
