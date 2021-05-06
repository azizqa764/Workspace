package basicweb;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindow {
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
		
		
		
		
		//get the handle 
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent handle "+parentHandle);
		
				// find open window button 
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		// get all the handles
		Set <String> handles =  driver.getWindowHandles();
		
		//switching between the handles 
		for (String handle:handles){
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				driver.close();
				break;
			}
			
		}
		
		//switch back to the parent window 
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("kutta bylat");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
