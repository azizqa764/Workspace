package basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after ");
	}

	@Test
	public void test() {
		System.out.println("This is test ");
		
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2 ");
		
	}
	
	
	 

}
