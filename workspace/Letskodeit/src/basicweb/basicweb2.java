package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basicweb2 {

	public static void main(String[] args) {
		
		String baseUrl = "https://learn.letskodeit.com/";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\Webdriver drivers\\msedgedriver.exe");
          WebDriver driver = new EdgeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
          
          driver.get(baseUrl);
          driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
          driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
	}

}
