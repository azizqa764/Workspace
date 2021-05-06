package basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExplicit {
	private WebDriver driver ;
	private String baseUrl ; 

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver() ;
		baseUrl = "https://letskodeit.teachable.com/p/practice" ;
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
