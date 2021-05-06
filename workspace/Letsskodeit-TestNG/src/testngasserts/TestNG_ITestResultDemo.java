package testngasserts;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResultDemo
{
	@Test
	public void testMethod1() {
		System.out.println("Running----> test method 1");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void testMethod2() {
		System.out.println("Running----> test method 2");
		Assert.assertTrue(true);
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult testResult){
		if(testResult.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed:"+testResult.getMethod().getMethodName());
		} 
		if(testResult.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Success:"+testResult.getName());
		System.out.println(testResult.getMethod().getMethodName());
		}
	}
}
