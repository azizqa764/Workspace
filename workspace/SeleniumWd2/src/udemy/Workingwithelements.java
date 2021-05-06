package udemy;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workingwithelements {
	WebDriver driver;
	String BaseUrl1;
	String BaseUrl2;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl1 = "http://letskodeit.teachable.com/pages/practice";
		BaseUrl2 = "http://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void testLetsKodeit() throws InterruptedException {
		driver.get(BaseUrl1);
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textbox.isDisplayed()); 
		
		Thread.sleep(2000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("clicked on the hide button");
		System.out.println("Text box Displayed," + textbox.isDisplayed());
		
		Thread.sleep(2000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("show button is clicked");
		System.out.println("Text box is displayed," + textbox.isDisplayed());
		
	}
	

	@Test
	public void testExpedia() {
		driver.get(BaseUrl2);
		WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
		System.out.println("child drpdown displayed," + childDropdown.isDisplayed());
	}

}
