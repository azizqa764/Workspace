package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Sortable Jeetgaya");
		}
		else   {
			System.out.println("Sortable Hargaya");
		}
		
		List<WebElement> draggable = driver.findElements(By.linkText("Draggable"));
           System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("draggable Jeetgaya");
		}
		else   {
			System.out.println("draggable Hargaya");
		}
		
		System.out.println("------------------");
		
		driver.switchTo().frame(0);
		//driver.switchto().frame("demo-frame"); in our case we can not use will work only with id 
		//driver.switchto().frame(driver.findelement(by.classname("demo-frame")));
		
		
		element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		if(element.size()>0) {
			System.out.println("sortable Jeetgaya");
		}
		else   {
			System.out.println("sortable Hargaya");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("draggable present");
		
		} else {
			System.out.println("draggable not present");
		}			
	}			
}		
		
		
		
		
		
		
		
		

