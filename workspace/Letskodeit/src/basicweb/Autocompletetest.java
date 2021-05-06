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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocompletetest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.goibibo.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String partialText = "Del";
		String textToSelect = "Delhi, India(DEL)";
		
		WebElement textfield = driver.findElement(By.id("gosuggest_inputSrc"));
		textfield.sendKeys(partialText);
		
		WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));
		String innerHTML= ulElement.getAttribute("innerHTML");
		System.out.println(innerHTML);
		
		List<WebElement> liElements = driver.findElements(By.tagName("li"));
		Thread.sleep(2000);
		
		for (WebElement element :liElements) {
		//	System.out.println(element.getText());
			if(element.getText().contains(textToSelect)) {
				System.out.println("Selected:" + element.getText());
				element.click();
				break;
			}
		}
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
