package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.name("lastname")).sendKeys("vcvfdgsfgsfsdf");
		 driver.findElementByName("reg_email__").sendKeys("2895620230");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("vfvdfxgdfgfsdgfsd");
		 
		 WebElement box = driver.findElement(By.id("month"));
		 Select s = new Select(box);
		 s.selectByValue("1");
		 
		 WebElement day = driver.findElement(By.id("day"));
		 Select sday = new Select(day);
		 sday.selectByValue("1");
		 
		 WebElement dday = driver.findElement(By.id("year"));
		 Select daday = new Select(dday);
		 daday.selectByValue("2001");
		 
		 
		 
		 driver.findElementByName("websubmit").click();
		 Thread.sleep(2000);
		 String expErrMsg = "What�s your name?";
		 String actualMsg = driver.findElementByXPath("//div[@class='_5633 _5634 _53ij']").getText();
		    System.out.println(actualMsg);
		    
		    if(expErrMsg.equals(actualMsg)) {
		    	System.out.println("jeet gaye");
		    } else {
		    	System.out.println("har gaye ");
		    }
		    
		    
	
	
	} 

}
