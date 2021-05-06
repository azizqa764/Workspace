package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();

	}

}
