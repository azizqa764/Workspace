package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.ebay.ca/");
		
		driver.navigate().to("https://www.google.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		WebElement a = driver.findElement(By.linkText("Registration"));
		
		System.out.println(a.getLocation());
		jse.executeScript("arguments[0].scrollIntoView(true);",a);
		
	}
}
//JSE is use to scroll classes
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	


