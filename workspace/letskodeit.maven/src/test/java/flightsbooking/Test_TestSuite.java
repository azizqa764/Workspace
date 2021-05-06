package flightsbooking;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageclasses.Test11;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(Test_TestSuite.class);

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void fillBasicInfo() throws Exception {
		Test11.navigateToFlightsTab(driver);
		Test11.fillOriginTextBox(driver, "New York");
		Test11.fillDestinationTextBox(driver, "Chicago");
		Test11.fillDepartureDateTextBox(driver, "12/25/2015");
		Test11.fillReturnDateTextBox(driver, "12/31/2015");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
