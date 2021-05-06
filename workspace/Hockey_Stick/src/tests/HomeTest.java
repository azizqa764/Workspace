package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest {

		HomePage hp = new HomePage();

	  @BeforeMethod
	  public void beforeMethod() throws IOException {
		  
		    hp.openBrowser();
		    hp.openWeb();
		  
	  }
	  @AfterMethod
		public void afterMethod() {
			
			hp.closeWeb();

		}
	  
//  In this test i am giving a computer name  
  
	 
	  @Test
	  public void fliter_computer() throws InterruptedException {
		  		 
		  hp.enterComputer("ACE");
		  		  
	  }

	  @Test
	  public void add_computer() throws InterruptedException {
		  
		  String a="Aziz";
		  String b="2015-12-01";
		  String c="2020-01-12";
		  hp.addComputer(a, b, c);
		  
	  }
	  
	  @Test
	  public void delete_computer() throws InterruptedException {
		  
		  hp.delete_comp();
		  
	  }
	  


}
