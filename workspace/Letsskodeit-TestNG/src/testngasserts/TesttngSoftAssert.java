package testngasserts;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TesttngSoftAssert {
	Someclass obj = new Someclass();
	
	
  @Test
  public void testSum(){
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning test -> testSum");
	  int result = obj.sumNumbers(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("\nline after assert 1");
	  sa.assertEquals(result, 3);
	  
	  System.out.println("\nline after assert 2");
	  sa.assertAll();
  }
}
