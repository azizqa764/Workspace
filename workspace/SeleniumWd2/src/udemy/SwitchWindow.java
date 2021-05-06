package udemy;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
               WebDriver driver ;
               String BaseUrl ;
               
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver() ;
		BaseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(BaseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		
		
		// Get the handle 
				String parentHandle = driver.getWindowHandle();
				System.out.println("parent handle " + parentHandle);
				
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//Get all Handles
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Parent handle:" + parentHandle);
		
		//switching between handles
		for (String handle: handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)){
				driver.switchTo().window( handle);
				Thread.sleep(2000);
				
				WebElement newsearchBox = driver.findElement(By.id("search-courses"));
				Thread.sleep(2000);
				newsearchBox.sendKeys("Python");
				driver.close();
				break;
				
			}
		}
		
		//switch to parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("test successfull");
		
		
	}

}
