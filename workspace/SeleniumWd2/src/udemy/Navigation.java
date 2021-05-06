package udemy;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	WebDriver driver;
	String BaseUrl = "https://letskodeit.teachable.com/";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(BaseUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}


	@Test
	public void test() throws InterruptedException {
		driver.getTitle();
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("current url is "+CurrentUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String UrlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(UrlToNavigate);
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		CurrentUrl = driver.getCurrentUrl();
		System.out.println("current url is "+CurrentUrl);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(CurrentUrl);
		
		driver.get("https://www.google.com");
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
