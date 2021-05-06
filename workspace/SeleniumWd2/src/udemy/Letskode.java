package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Letskode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(baseURL);
		////*[@id="masthead"]/div/div/div/div/div[4]/a/div
		
		//WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		WebElement signupLink = driver.findElement(By.xpath("//div[contains(text(),'Sign Up or Log In')]"));
		signupLink.click();
		
	//	WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
	//	loginLink.click();
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		emailField.sendKeys("test@email.com");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField.sendKeys("abcabc");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@value='Login']"));
		goButton.click();

// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code
		
//		WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(goButton).click().perform();
		
		Thread.sleep(3000);
		
		WebElement practicePage = driver.findElement(By.id("DrpDwnMn06bg"));
		practicePage.click();
		System.out.println("Login Successful");
	}
	}


