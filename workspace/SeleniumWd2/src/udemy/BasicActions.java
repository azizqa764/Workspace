package udemy;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseUrl = "https://letskodeit.teachable.com/";
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.getTitle();
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("clicked on log in ");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("sending keys to password");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("clearing user password field");

	}
   

}
