package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		
		 driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			
	}
	}
	

		
		


