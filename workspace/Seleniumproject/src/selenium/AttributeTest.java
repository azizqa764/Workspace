package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.ebay.ca/");
		 Thread.sleep(2000);
		 
		 String A = "Search for anything";
		 
		 String S = driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");
		 System.out.println(S);
		 
		 if(A.equals(S)) {
		    	System.out.println("jeet gaye");
		    } else {
		    	System.out.println("har gaye ");
		    }
		// to find what is search 
		 
          String b = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
          System.out.println(b);
          
          driver.findElement(By.id("gh-ac")).sendKeys("iphone");
          
          String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
          System.out.println(p);
          
          
          
          
         
	}

}



