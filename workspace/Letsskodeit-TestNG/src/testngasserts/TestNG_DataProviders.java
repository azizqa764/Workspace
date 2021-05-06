package testngasserts;
// See the TEst data file 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders{
	
//	@DataProvider(name="input2")
//	public Object[][] getData() {
//		return new Object[][] {
//			{"bmw","m3"},
//			{"audi","a6"},
//			{"benz","c300"}
//			
//		};
//		
//	}
	
	@Test(dataProvider="input2", dataProviderClass=TestData.class) 
	public void testMethod1(String input1,String input2) {
		System.out.println("Input 1:" +input1);
		System.out.println("Input2:" +input2);
	}
	
}
 