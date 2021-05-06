package gridselenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import pagefactory.SearchPageFactory;

public class SeleniumParallel_Grid {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;
	private String nodeUrL;

	@BeforeMethod
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.expedia.com/";
		nodeUrL = "http://169.254.16.33:4444/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeUrL),caps);
		
		searchPage = new SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		//searchPage.setDepartureDate("10/28/2015");
		//searchPage.setReturnDate("10/31/2015");
	}

	@AfterMethod
	public void afterClass() {
	}
}