package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                  
		driver.findElement(By.id("identifierId")).sendKeys("zeezfree");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jhdjshjsa");
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
		
	     Thread.sleep(2000);	    
	    String expErrMsg = "Wrong password. Try again or click Forgot password to reset it.";
	    
	    String actualMsg = driver.findElement(By.xpath("//div[@jsname='B34Ej']/span")).getText();
	    System.out.println(actualMsg);
	    
	    if(expErrMsg.equals(actualMsg)) {
	    	System.out.println("jeet gaye");
	    } else {
	    	System.out.println("har gaye ");
	    }
	    	
	    
	}    

}
