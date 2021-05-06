package testngasserts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testngpriority
{
	@Test
	public void f1() {
		System.out.println("test method 1 ");
	}
 
	@Test(priority=1)
	public void f2() {
		System.out.println("test method 2 ");
	}
	
	@Test(priority=0)
	public void f3() {
		System.out.println("test method 3 ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("New test - beforeclass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("new test- afterclass");
	}

}
