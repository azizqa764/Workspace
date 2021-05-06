package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://www.facebook.com/");
 		
         driver.findElement(By.id("email")).sendKeys("kjwdhjkadhajk");
 

         driver.findElement(By.name("pass")).sendKeys("lkdaldaldjaslk");
         driver.findElement(By.id("loginbutton")).click();

	}

}
