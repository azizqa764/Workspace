package udemy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {
	WebDriver  driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	@Test
	public void test() throws InterruptedException {
		
    WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
    bmwRadioBtn.click();
    Thread.sleep(2000);
    
    WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
    benzRadioBtn.click();
    Thread.sleep(2000);
    
    WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
    bmwCheckBox.click();
    Thread.sleep(2000);
    
    WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
    benzCheckBox.click();
    
    System.out.println("bmw radio is selected? " + bmwRadioBtn.isSelected());
    System.out.println("benz radio is selected ? " + benzRadioBtn.isSelected());
    System.out.println("bmw checkbox is selected ? " + bmwCheckBox.isSelected());
    System.out.println("benz checkbox is selected ?" + benzCheckBox.isSelected());
    
 	}

}
