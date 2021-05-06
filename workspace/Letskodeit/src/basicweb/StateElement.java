package basicweb;

//Locators doesnt work because of update in the course and ID's are dynamic 
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElement {
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://www.google.ca/";

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get(baseurl);
	}
	
	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("E1 is Enabled?" + e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("E2 is enabled ?" + e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("E3 is enabled?" + e3.isEnabled());
		
		e3.sendKeys("damn");
			}
	


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
}
