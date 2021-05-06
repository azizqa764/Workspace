package testngasserts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Aalltestrun {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("All test run before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("all test run after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("All test run before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("all test run after class");
  }

}
