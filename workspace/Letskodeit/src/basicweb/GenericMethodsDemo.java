package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import basicweb.GenericMethod;

public class GenericMethodsDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethod gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		gm = new GenericMethod(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//BWRAS- JIRA STORY - 105 
	// To test click button 

	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		boolean result = gm.isElementPresent("name", "id");
		System.out.println("size f the element list :" + result);
		
		//name not present intentionally failed
		boolean result2 = gm.isElementPresent("name89", "id");
		System.out.println("size f the element list :" + result2);
		
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
	}
	
	//FOR LIST 
	
	@Test
	public void testMethod2() throws Exception {
		driver.get(baseUrl);
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("sizeof the element list is  " + size);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
