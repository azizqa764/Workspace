package testngasserts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testnggrouping {
	@Test(groups = {"cars","suv"})
	public void testBMWX6() {
		System.out.println("running test - BMWX6");
	}

	@Test(groups = {"cars","sedan"})
	public void testAudiA6() {
		System.out.println("running test - AudiA6");
	}

	@Test(groups = {"bikes"})
	public void testNinja() {
		System.out.println("running test - kawasaki ninja");
	}

	@Test(groups ={"bikes"})
	public void testhondaCBR() {
		System.out.println("running test - hondaCBR");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("grouping beforeclass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("groupig afterclass");
	}

}
