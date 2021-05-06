package selenium;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
    @Ignore
	@Test
	public void test6() {
		System.out.println("i am in testAssert");
		String actualErrormessage = "abc";
		String expectedErrorMessage = "abc";
		Assert.assertEquals(expectedErrorMessage, actualErrormessage);
		Assert.assertTrue("verifying if 2>3",4 > 3);
		System.out.println("After 2nd assert");
		
		
	}
	@Test
	public void test7() {
		System.out.println("i am in testAssert");
		String actualErrormessage = "abc";
		String expectedErrorMessage = "abc1";
		
	try {
		Assert.assertEquals(expectedErrorMessage, actualErrormessage);
	} 
	catch(Throwable t) {
		System.out.println("I am in catch1");
		errCol.addError(t);
	}
		
    try {
		Assert.assertTrue("verifying if 2>3",4 > 3);
    } catch(Throwable t) {
    	System.out.println("i am in catch2");
    	errCol.addError(t);
    }
		System.out.println("After 2nd assert");
		
		
	}
	
	

}
