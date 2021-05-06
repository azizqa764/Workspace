package testngasserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_asserts {
	Someclass obj = new Someclass();
 
	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		//Someclass obj = new Someclass();
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testStrings() {
		System.out.println("\nRunning Test -> testStrings");
		String expectedString = "Hello World";
		//Someclass obj = new Someclass();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("\nRunning Test -> testArrays");
		int[] expectedArray = {1, 2, 3, 4};
		//Someclass obj = new Someclass();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArrays");
	}
}
