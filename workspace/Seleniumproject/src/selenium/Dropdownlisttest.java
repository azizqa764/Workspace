package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlisttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		WebElement box = driver.findElement(By.id("gh-cat"));
		//List<WebElement> all = box.findElements(By.tagName("option"));
		List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(all.size());
		
		for(int i=0; i<all.size();i++) {
			if(all.get(i).isSelected())
			System.out.println(all.get(i).getText()+"---------"+all.get(i).isSelected());
		}
		Select s = new Select(box);
		//s.selectByIndex(2);
		//s.selectByValue("6000");
		s.selectByVisibleText("Books");
		System.out.println("---------------After Selection");
		
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText()+"------"+all.get(i).isSelected());
		}
		Select a = new Select(box);
		s.selectByVisibleText("books");
		System.out.println("----------------------After Selection------------");
		
		
//		for(int i=0; i<all.size();i++) {
//			
//			System.out.println(all.get(i).getText()+"-----"+all.get(i).isSelected());
			
			for(int i=0; i<all.size();i++) {
				
				
				System.out.println(all.get(i).getText()+"-----"+all.get(i).isSelected());
				
					
					
		
		}
		
		/*Thread.sleep(2000);
		
		 System.out.println(all.size());*/

	}

}
