package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

public class ActionsClassText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca");
		Thread.sleep(5000);
		WebElement men = driver.findElement(By.linkText("MEN"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		Thread.sleep(4000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='NavigationMenu-0']/div/div[2]/a"));
		System.out.println(all.size());
		
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
		
		
		
		
	}

}
