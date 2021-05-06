package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement cityhall = driver.findElement(By.xpath("//div[@id='tnNavHall']"));
				Actions builder = new Actions(driver);
		builder.moveToElement(cityhall).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(all.size());
		
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
			if(all.get(i).getText().equals("Jobs & Careers")) {
				all.get(i).click();
				break;
			}
		}
			
			
	}
}
