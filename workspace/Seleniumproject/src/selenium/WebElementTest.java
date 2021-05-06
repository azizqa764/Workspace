// New Other way of writing 
// Use in companies 


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.className("inputtext"));
		email.sendKeys("a");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("ojdldjad");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();

	}

}
