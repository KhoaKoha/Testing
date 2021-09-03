package lambada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	  @Test (groups = "checkingHompage")
	  public void TestCase() {
		  driver.get("https://fb.com");
		  String homepage = driver.getTitle();
		  System.out.println(homepage);
	  }
	  @Test (groups = "checkingHompage")
	  public void TestCase2 () {
		  driver.get("https://google.com");
		  String homepage = driver.getTitle();
		  Assert.assertEquals(homepage, "Google");
	  }
	  
	  
	  




  @BeforeTest
  public void beforeTest() {
	 	
			 driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }


}
