package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitfirst {
	
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "https://letskodeit.teachable.com/";

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
        
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Login")).click();
		System.out.println("done clicking");
		Thread.sleep(3000);
        
		driver.findElement(By.id("user_email")).sendKeys("test@aziz.com");
		Thread.sleep(3000);
		driver.findElement(By.id("user_password")).sendKeys("test");
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
