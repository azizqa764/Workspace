package udemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitintroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("executed before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("executed after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}


}
