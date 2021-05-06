package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributevalue {
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/p/practice";

	@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);

	}
	
	@Test
	public void test() {
		WebElement element = driver.findElement(By.id("name"));
		String attributevalue = element.getAttribute("type");
		System.err.println("value of attribute is:" + attributevalue);
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
