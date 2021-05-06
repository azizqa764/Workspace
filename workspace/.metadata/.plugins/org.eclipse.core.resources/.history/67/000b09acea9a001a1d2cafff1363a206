// to get text frm the elements

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

public class GetTextDemo {
	WebDriver driver;
	String BaseUrl = "http://letskodeit.teachable.com/pages/practice";
    
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		WebElement Element = driver.findElement(By.id("opentab"));
		String elementText = Element.getText();
		System.out.println("Text of textbox:" + elementText);
		
	}

}
