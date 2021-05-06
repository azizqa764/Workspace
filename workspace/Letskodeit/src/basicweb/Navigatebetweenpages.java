package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigatebetweenpages {
	
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "https://letskodeit.teachable.com/";

	@Before
	public void setUp() throws Exception {
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("title of the page"+title);
		
		String currentUrl =driver.getCurrentUrl();
		System.out.println("current Url is :" +currentUrl);
		
		String UrltoNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(UrltoNavigate);
		
		 currentUrl =driver.getCurrentUrl();
		 System.out.println("current Url is :" +currentUrl);
		 
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
