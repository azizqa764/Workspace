package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AZIZ\\Documents\\seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> allRadio = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(allRadio.size());
		
		for(WebElement a: allRadio) {
			System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
		}
		allRadio.get(2).click();
		System.out.println("----------");
		
		for(WebElement a : allRadio) {
			System.out.println(a.getAttribute("value"+a.isSelected()));
//		
//		List<WebElement> all = driver.findElements(By.xpath("//input[@name='group1']"));
//		for(int i=0; i<all.size();i++) {
//			System.out.println(all.get(i).getAttribute("Value"));
//		}
//		
//			List<WebElement> grp2 = driver.findElements(By.xpath("//input[@name='group2']"));
//			for(int x=0; x<grp2.size();x++) {
//				System.out.println(grp2.get(x).getAttribute("Value"));
			
	}
	}
}
