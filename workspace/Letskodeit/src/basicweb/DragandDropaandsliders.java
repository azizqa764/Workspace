package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropaandsliders {
	private WebDriver driver ;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();	
		baseUrl = "https://jqueryui.com/slider/";

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Ignore
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(fromElement, toElement);
		
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement Element = driver.findElement(By.xpath("//div[id=slider]/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(Element, 100, 0).perform();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
