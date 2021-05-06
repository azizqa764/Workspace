package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.navigate().to("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String>allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
