package basicweb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/p/practice";
	

	@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		WebElement element = driver.findElement(By.id("carselect"));
		
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("select benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("select honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select bmw by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("print the list of all options ");
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for (int i=0;i<size;i++) {
			String optionName=options.get(i).getText();
			System.out.println(optionName);
		}
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
