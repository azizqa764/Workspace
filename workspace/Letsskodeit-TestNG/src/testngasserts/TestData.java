package testngasserts;

//See TestNG_DATA PROVIDERs

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="input2")
	public Object[][] getData() {
		return new Object[][] {
			{"bmw","m3"},
			{"audi","a6"},
			{"benz","c300"}
			
		};
		
	}

}
