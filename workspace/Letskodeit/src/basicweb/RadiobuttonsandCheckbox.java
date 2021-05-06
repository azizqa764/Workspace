package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonsandCheckbox {
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/p/practice";
	

	@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement Bmwradiobtn = driver.findElement(By.id("bmwradio"));
		Bmwradiobtn.click();
		Thread.sleep(2000);
		
		WebElement benzradiobtn = driver.findElement(By.id("benzradio"));
		benzradiobtn.click();
		
		WebElement Bmwcheckbtn = driver.findElement(By.id("bmwcheck"));
		Bmwcheckbtn.click();
		
		WebElement Benzcheckbtn = driver.findElement(By.id("benzcheck"));
		Benzcheckbtn.click();
		
		System.out.println("Bmw radio is selected" + Bmwradiobtn.isSelected());
		System.out.println("benz radio is selected"+ benzradiobtn.isSelected());
		
		System.out.println("bmw check box is sleetced" + Bmwcheckbtn.isSelected());
		System.out.println("benz check box is selected" + Benzcheckbtn.isSelected());
		
		
	}
		

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	
	}
	
	
	}

	


