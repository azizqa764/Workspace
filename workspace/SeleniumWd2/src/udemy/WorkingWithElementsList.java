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

public class WorkingWithElementsList {
      WebDriver driver;
      String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver =new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		 int size = radioButtons.size();
		 System.out.println("size fo the list:" +size);
		for (int i = 0; i<size; i++ ) {
			 isChecked = radioButtons.get(i).isSelected();
			
			if (isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
				
			}
		}
		
		
	}

}
