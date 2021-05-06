package testngasserts;

import org.testng.annotations.Test;

public class TestNG_parallel2 {
	
	
	@Test
	public void testMethod3() throws InterruptedException {
		System.out.println("TestNG_test parallel 1----->Testmethod2");
		Thread.sleep(6000);
	}
	
	@Test
	public void testMethod4() throws InterruptedException {
		System.out.println("TestNG_test parallel 2----->Testmethod2");
		Thread.sleep(6000);
	}
}
