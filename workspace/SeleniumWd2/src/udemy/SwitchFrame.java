package udemy;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver() ;
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame("iframe-name");
		driver.switchTo().frame(0);
		
		
		WebElement searchbox = driver.findElement(By.id("search-courses"));
		searchbox.sendKeys("python");
	   
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("test sucessfully");
	}

}
