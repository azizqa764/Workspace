package testngasserts;

import org.testng.annotations.Test;

import testng_Listeners.CustomListener1;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(CustomListener1.class)
public class Testng_Listeners1 {
	
	
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Code in befre class");
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("code is after class");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("code in test method 1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("code is test method 2");
	  Assert.assertTrue(false);
  }

}
