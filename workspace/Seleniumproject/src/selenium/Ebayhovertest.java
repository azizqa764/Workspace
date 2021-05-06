package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebayhovertest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://in.ebay.com/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
        builder.moveToElement(electronics).build().perform();
        Thread.sleep(2000);
        
        List<WebElement> all = driver.findElements(By.xpath("//a[contains(text(),'Cameras & Photo')]/../../li/a"));
		System.out.println(all.size());
		
		for(int i=0; i<all.size(); i++)
		{
			System.out.println(all.get(i).getText());
		}
		
		
}
}
