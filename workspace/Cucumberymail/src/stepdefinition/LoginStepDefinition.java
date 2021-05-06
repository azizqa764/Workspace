package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition {

	WebDriver driver;
	
	
@Given("^on Login Page$")
	public void on_Login_page(){
	
	driver = new FirefoxDriver();
	driver.get("www.google.com");

//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
//	driver = new FirefoxDriver();
//	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	 throw new PendingException();

}

@When ("^title of login page is Gmail$")
public void title_of_login_page_is_Gmail() {
 String title = driver.getTitle();
System.out.println(title);

Assert.assertEquals("Gmail",title );
//throw new PendingException();
}


@Then("^User enters username clicks enters password$")
public void User_enters_username_clicks_enters_password()  {
driver.findElement(By.id("identifierId")).sendKeys("zeezfree");
driver.findElement(By.xpath("//span[contains(text(),'Next']")).click();


driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Playstation786");
//throw new PendingException();
}

@Then("^user clicks on password Next$")
public void user_clicks_on_password_Next(){
	driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
//	 throw new PendingException();
}

@Then("^user on homepage$")
public void user_on_homepage(){
	String title1 =driver.getTitle();
	System.out.println(title1);
   Assert.assertEquals("Inbox (4) - zeezfree@gmail.com - Gmail", title1);
//   throw new PendingException();
	
	
}
	
}

