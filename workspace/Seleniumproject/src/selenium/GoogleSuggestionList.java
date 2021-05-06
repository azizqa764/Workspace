package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("canada");

	//List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[1]/div/span"));
			List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			System.out.println(allLinks.size());
			
			for (int i=0; i<allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText());
			}
			
			for (int i=0; i<allLinks.size(); i++) {
				if(allLinks.get(i).getText().contains("canada"))
				{
					System.out.println("Passed");
		 
	 }
	}
}
}
