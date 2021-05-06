package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefoxwindows {

	public static void main(String[] args) {
        
		
	//System.setProperty("webdriver.gecko.driver", "C:/Users/AZIZ/Documents/seleniumjar/Webdriver drivers/geckodriver.exe");
      
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\Webdriver drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\Webdriver drivers\\chromedriver.exe");
        // WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		
         WebDriver driver = new EdgeDriver();
         String baseUrl = "https://www.google.com";
         driver.get(baseUrl);
         
	}

}
