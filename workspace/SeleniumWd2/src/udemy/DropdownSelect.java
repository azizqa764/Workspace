package udemy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	WebDriver driver ;
	String BaseUrl ;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		BaseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
  //select by ID when there is a tag name <select> in the code its usually there is menu/drop down
	@Test
	public void test() throws InterruptedException {
		driver.get(BaseUrl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);	//defining the object
		
		Thread.sleep(2000);
		System.out.println("select benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("select Honda by  index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("select BMW by visible Text");
		sel.deselectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("print the list of all the options" );
		List<WebElement> options = sel.getOptions(); // definig the list and getting all the options 
		int size = options.size();     // give the options
		
		for (int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		
		}
		
		
		
		
	}

}
