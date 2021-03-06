package udemy;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	 WebDriver driver = new FirefoxDriver();
     String baseUrl = "http://letskodeit.teachable.com/pages/practice";

	@Before
	public void setUp() throws Exception {
		
		driver.manage().window().maximize();
			
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement Link = driver.findElement(By.linkText("Login"));
		Link.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement emailField =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("test");
		System.out.println("Run Successfully");
	}

	private WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
