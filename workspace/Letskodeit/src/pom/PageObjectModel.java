package pom;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.SearchPage2;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage2.fillOriginTextBox(driver, "New York");
		SearchPage2.destinationTextBox(driver).sendKeys("Chicago");
		SearchPage2.departureDateTextBox(driver).sendKeys("12/25/2014");
		// Added a line to clear the return date text box
		// before entering the return date, because Expedia by default
		// enters the return date same as the departure date
		SearchPage2.returnDateTextBox(driver).clear();
		SearchPage2.returnDateTextBox(driver).sendKeys("12/31/2014");
		SearchPage2.clickOnSearchButton(driver);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
