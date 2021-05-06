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

public class Listallelements {
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
		boolean isChecked = false;
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radiobuttons.size();
		System.out.println("size of the list:" +size);
		for (int i =0;i<size;i++) {
			isChecked = radiobuttons.get(i).isSelected();
			
			if(!isChecked) {
				radiobuttons.get(i).click();
				Thread.sleep(2000);
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	

}
