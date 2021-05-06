package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popus {
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
	
	@Ignore
	public void test() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("aziz");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
    
	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("aziz");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
