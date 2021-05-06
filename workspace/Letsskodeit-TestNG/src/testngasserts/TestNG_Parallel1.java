package testngasserts;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_test parallel 1----->Testmethod1");
		Thread.sleep(6000);
	}
	
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_test parallel 2----->Testmethod2");
		Thread.sleep(6000);
	}
}
