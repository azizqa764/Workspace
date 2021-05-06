package javaScript;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingintoView {

	private WebDriver driver;
	 private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Ignore
	public void test() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location ='https://letskodeit.teachable.com/p/practice'");
		Thread.sleep(2000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(2000);
		
		//scroll up 
		js.executeScript("window.scrollBy(0,-1900);");
		Thread.sleep(2000);
		
		//scroll element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-190);");

	}
	
	//clicking using javascript
	@Ignore
	public void test1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location ='https://letskodeit.teachable.com/p/practice'");
		Thread.sleep(2000);
		WebElement CheckBoxElement = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click()", CheckBoxElement);
		
	}
	
//ignore the test
	
//	@Test
//	public void test2() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		js.executeScript("window.location ='https://www.retailmenot.com/'");
//		Thread.sleep(2000);
//		WebElement CheckBoxElement = driver.findElement(By.id("bmwcheck"));
//		js.executeScript("arguments[0].click()", CheckBoxElement);
//		
//	}

	@After
	public void tearDown() throws Exception {
	}

	

}
