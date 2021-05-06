package udemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelection {
	WebDriver driver = new FirefoxDriver();
			String BaseUrl;

	@Before
	public void setUp() throws Exception {
		BaseUrl = "https://www.expedia.com/?pwaLob=wizard-hotel-pwa-v2";
		driver.manage().window().maximize();
		driver.get(BaseUrl);
	
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("tab-flight-tab"));
		WebElement departingfield = driver.findElement(By.id("flight-departing"));
		departingfield.click();
		Thread.sleep(3000);
		WebElement dateToSelect = driver.findElement(By.xpath("//section[@class='cal-month'][position()=1]//a[text()='31']"));
	    dateToSelect.click();
	}

}
