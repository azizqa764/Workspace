package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keypressevents {
	private WebDriver driver ;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();	
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Ignore
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("test@aziz.com");
		Thread.sleep(2000);
		driver.findElement(By.id("user_password")).sendKeys("12344");
		Thread.sleep(2000);
		
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
	}
     
	@Ignore
	public void test1() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys(Keys.CONTROL +"a");
		driver.findElement(By.id("user_email")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		
		String selectAll = Keys.chord(Keys.CONTROL,"a");
		Thread.sleep(2000);	
	}
	
	//actions class doesnt need to find the elements 
	public void test2() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.COMMAND).perform();
			
	}
		
	@After
	public void tearDown() throws Exception {
	}


}
