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

public class Commandsjavas {
	
	private WebDriver driver;
	 String baseUrl;
	 private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		//baseUrl = "https://letskodeit.teachable.com/p/practice";
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		
	}
	
	@Test 
	public void test1(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location ='https://letskodeit.teachable.com/p/practice'");
		
		//size of the windw 
		Long height = (Long) js.executeScript("return window.innerHeight;");
		Long width = (Long) js.executeScript("return window.innerWidth;");
		
		System.out.println("Heigh is "+height);
		System.out.println("width is"+width);

		
	}
    
	
	@Ignore 
	public void test() {
		//typecasting
		//driver.get(baseUrl);
		js.executeScript("window.location ='https://letskodeit.teachable.com/p/practice'");
		//find element
		//WebElement textBox = driver.findElement(By.id("name"));
		WebElement textBox=(WebElement)js.executeScript("return document.getElementById('name')");
		textBox.sendKeys("test");
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
