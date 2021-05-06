package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Beofre class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("log out");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		
	}
		

	@Test
		public void test2() {
			System.out.println("test2");
		}
		
		

	@Test
		public void test3() {
			System.out.println("test3");
			
	}
}


