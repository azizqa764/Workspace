package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameswitch {
	private WebDriver driver ;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();	
		baseUrl = "https://letskodeit.teachable.com/p/practice";

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame("iframe-name");
		driver.switchTo().frame(0);
		WebElement searchBox = driver.findElement(By.id("search-course"));
		searchBox.sendKeys("python");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Test Successful");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
