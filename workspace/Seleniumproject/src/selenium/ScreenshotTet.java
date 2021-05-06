package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://ca.yahoo.com/?p=us");
		
		driver.navigate().to("https://www.google.com");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE); //this if for fireFoxfriver
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //this line is for webdriver
         FileUtils.copyFile(scrFile, new File("C:\\Users\\AZIZ\\Pictures\\Testing\\selfiee.jpg"));
	}

}
