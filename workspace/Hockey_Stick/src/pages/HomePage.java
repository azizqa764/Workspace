package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(id="searchsubmit") 		
	public static WebElement FilterName; 
	
	@FindBy(id="searchbox")
	public static WebElement FilterTextField;
	
	@FindBy(id="add")
	public static WebElement addNewComputer ;
	
	//add a new computer page
	
	@FindBy(id="name")
	public static WebElement ComputerName;
	
	@FindBy(id="introduced")
	public static WebElement Intro_Date ;
	
	@FindBy(id="discontinued")
	public static WebElement  Disc_Date ;
	
	@FindBy(xpath="//*[@id=\"main\"]/form/div/input")
	public static WebElement  Create_new_computer ;
	
	@FindBy(linkText="Aziz")
	public static WebElement  DeleteButton ;
	
	public void openBrowser() throws IOException
	{	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AZIZ\\Documents\\seleniumjar\\Webdriver drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
				
	PageFactory.initElements(driver, this);
	}
	
	public void openWeb()
	{
		driver.get("http://computer-database.herokuapp.com/computers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeWeb()
	{
		driver.quit();
	}
	public void enterComputer(String a) throws InterruptedException 
	{
		FilterTextField.sendKeys(a);
		FilterName.click();
  		Thread.sleep(3000);
	}
	public void addComputer(String a,String b,String c) throws InterruptedException {
		
		addNewComputer.click();
		Thread.sleep(2000);
		ComputerName.sendKeys(a);
		Thread.sleep(2000);
		Intro_Date.sendKeys(b);
		Thread.sleep(2000);
		Disc_Date.sendKeys(c);
		Thread.sleep(2000);
		Create_new_computer.click();
		
	}
	
	public void delete_comp() throws InterruptedException {
		  
		  enterComputer("Aziz");
		  DeleteButton.click();
		  
	  }
	
}
