package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		// TODO Auto-generated method stub
    FirefoxDriver driver = new FirefoxDriver();
    // classname objnme = new classname
    
    driver.get("https://www.facebook.com/");
    		//driver.findElement(By.className("inputtext")).sendKeys("jhdjasjdjasd");
    driver.findElement(By.id("email")).sendKeys("kjwdhjkadhajk");
    //driver.findElementByName("email").sendKeys("lwaldjalskd");
   
    driver.findElementByName("pass").sendKeys("lkdaldaldjaslk");
    driver.findElementById("loginbutton").click();
    
    
  
	}

}
