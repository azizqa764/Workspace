package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	private WebDriver driver ;
	private String baseUrl;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();	
		baseUrl = "https://letskodeit.teachable.com/p/practice";

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		driver.get(baseUrl);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='top']"));
		subElement.click();
		
		

		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
