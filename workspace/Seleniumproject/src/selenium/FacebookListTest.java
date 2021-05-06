package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		
		 List<WebElement> allLinks =driver.findElementsByXPath("//div[@id='js_0']/ul/li/a");
		 System.out.println(allLinks.size());
		 
		 for(int i=0; i<allLinks.size(); i++){
			 System.out.println(allLinks.get(i).getText());
		 

	}
	}
}

//div[@role= 'contentinfo']/ul/li/a

