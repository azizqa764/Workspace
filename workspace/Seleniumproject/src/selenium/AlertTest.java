package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		
		Thread.sleep(3000);
		
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		
		a1.accept();
		
	//a1.dismiss();

	}

}
