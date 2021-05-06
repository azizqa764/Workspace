package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfilesDemo {

	public static void main(String[] args) {
		String baseurl = "https://www.letskodeit.com";
		WebDriver driver = new FirefoxDriver();
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("automationprofile");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		
		
	}

}
