package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Idxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     String baseURL = "https://letskodeit.teachable.com/";
     WebDriver driver ;
     
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
    
    // System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\chromedriver.exe");
     driver = new FirefoxDriver();
     //driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(baseURL);
     
     driver.findElement(By.linkText("Login")).click();
     Thread.sleep(3000);
	}

}
