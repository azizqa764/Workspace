package inheritance_concept;


class Bank
{
	double rateofIntrest()
	{
		return 0 ;
	}
}

class SBI extends Bank 
{
	double rateofIntrest() 
	{
		return 10.5 ;
	}
}

class ICICI extends Bank 
{
	double rateofIntrest() 
	{
		return 12.5;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.rateofIntrest());
		
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.rateofIntrest());

	}

}
