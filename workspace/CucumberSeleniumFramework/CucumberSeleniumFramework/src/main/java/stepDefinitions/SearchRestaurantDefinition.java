package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchRestaurantDefinition {
	WebDriver driver;

	@Before()
	public void setUP() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AZIZ\\Documents\\seleniumjar\\Webdriver drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.skipthedishes.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@After()
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000); 
		driver.quit();
	}

	@Given("^I want food in \"([^\"]*)\"$")
	public void i_want_food_in(String location) throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Address']")).sendKeys(location);
		Thread.sleep(2000);
	}

	@When("^I search for restaurants$")
	public void i_search_for_restaurants() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Address']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Find Restaurants In Your Area')]")).click();

	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in(String location) throws InterruptedException {
		String actualstr = driver.getCurrentUrl();
		String expected = "https://www.skipthedishes.com/winnipeg/restaurants";
		Assert.assertEquals(expected, actualstr);

	}

	@Given("^I search for restaurants in my given area for \"([^\"]*)\"$")
	public void i_want_cusine_provider_restaurants(String cusine_type) throws InterruptedException {
		driver.get("https://www.skipthedishes.com/winnipeg/restaurants");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='header-search']")).sendKeys(cusine_type);
	}

	@When("^I want Italian cusine provider restaurants$")
	public void i_search_for_restaurants_in_my_given_area_for_Italian() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'View All')]")));
		element.click();
		Thread.sleep(3000);

	}

	@Then("^I should see some restaurants with Italian cusuine$")
	public void i_should_see_some_restaurants_with_Italian_cusuine() {
		String actualstr1 = driver.getCurrentUrl();
		String expected1 = "https://www.skipthedishes.com/winnipeg/restaurants?search=Italian";
		Assert.assertEquals(expected1, actualstr1);
	}

	@Given("^I am on any other page than homepage$")
	public void i_am_on_any_other_page_than_homepage() {
		driver.get("https://www.skipthedishes.com/winnipeg/restaurants");
	}

	@When("^I click on skip the dishes logo$")
	public void i_click_on_skip_the_dishes_logo() {
		driver.findElement(By.className("jss56")).click();

	}

	@Then("^I will land on home page$")
	public void i_will_land_on_home_page() {
		String actualurl = driver.getCurrentUrl();
		String url = "https://www.skipthedishes.com/";
		Assert.assertEquals(url, actualurl);

	}
}
