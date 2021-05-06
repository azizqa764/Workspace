package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://ca.yahoo.com/?p=us");
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
