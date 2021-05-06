package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {

	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority = 1)
	public void homeTest() {
		System.out.println("I am in home Test");
		System.out.println("Before assertion");
		Assert.assertTrue(4>3, "Verifying element");
		System.out.println("after assertion");
		Assert.assertEquals("abc", "abc");
		
	}
	@Test(priority = 2, dependsOnMethods= {"homeTest"}, groups = {"smoke","xyz"})
	public void mainTest() {
		System.out.println("I am in home Test");
		System.out.println("Before assertion");
		softAssert.assertTrue(2>3, "Verifying element");
		System.out.println("after assertion");
		Assert.assertEquals("abc", "abc");
		softAssert.assertAll();	//similar to error collector
	}
	
	@Test(priority = 3,dependsOnMethods= {"mainTest"}, groups = {"xyz"})
	public void endTest() {
		System.out.println("I am in home Test");
		System.out.println("Before assertion");
		softAssert.assertTrue(2>3, "Verifying element");
		System.out.println("after assertion");
		Assert.assertEquals("abc", "abc");
		softAssert.assertAll();	
	}
}