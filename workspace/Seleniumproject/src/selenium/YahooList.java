package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/?p=us");
		System.out.println(driver.getTitle());
		
		String trending = driver.findElement(By.className("blur_Op(0.2)")).getText();
		System.out.println(trending);
		
		driver.findElement(By.className("blur_Op(0.2)")).click(); //preferable to use data-category
		//driver.findElement(By.xpath("//span"));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//li[contains(@class,'trending-list selected')]/ul/li"));
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		
		/*Back to school
		String back = driver.findElement(By.xpath("//div[contains(@class,'pos(r)')]")).getText();
		System.out.println(back);
		
		driver.findElement(By.className("")).click();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//li[contains(@class,'trending-list selected')]/ul/li"));
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++)
		{
			System.out.println(allLinks.get(i).getText());
		}*/
	}

}