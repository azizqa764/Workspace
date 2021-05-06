package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {
//for finding whole links in the page 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());
		 
		 for(int i=0; i<allLinks.size(); i++){
			 System.out.println(allLinks.get(i).getText());
		 }
	}
}
// by using xpath 
// List<WebElement> allLinks= driver.findElements(By.xpath("//span[@id='fsl']/a"));


// For only finding in a part of the page 
// WebElement footer = driver.findElement(By.id("fsl"));
/*List<WebElement> allLinks = driver.findElements(By.tagName("a"));
System.out.println(allLinks.size());

for(int i=0; i<allLinks.size(); i++){
	 System.out.println(allLinks.get(i).getText());*/