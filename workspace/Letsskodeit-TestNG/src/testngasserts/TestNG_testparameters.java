package testngasserts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_testparameters {
	
	
	@BeforeClass
	@Parameters({"browser","platform"})
	public void setUp(String browser,String platform) {
		System.out.println("testNg_testparameters -> setup");
		System.out.println("1.parameter value from xml file :"+ browser);
		System.out.println("2.paramter value from xml file:"+ platform);
	}


	@Test
	@Parameters({"response"})
	public void testMethod1(String response) {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_TestParamters -> testmethod1");
		System.out.println("response from xml file "+response);
		System.out.println("stringArray[0] from xml file :"+ stringArray[0]);
		System.out.println("stringArray[1] from xml file :"+ stringArray[1]);

		
	}
	
}

	
