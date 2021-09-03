package lambada;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest2 {
	WebDriver driver;
	
	@Test
	  public void TestCase() {
		  driver.get("https://https://kyna.vn/");
		  String homepage = driver.getTitle();
		  System.out.println(homepage);
	  }
	  @Test
	  public void TestCase2 () {
		  driver.get("https://www.lazada.vn/");
		  String homepage = driver.getTitle();
		  Assert.assertEquals(homepage, "Google");
	  }
	  
	  
	  
	  
  @BeforeMethod
  public void beforeMethod() {
	 driver = new ChromeDriver();
	 
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	 driver.quit();
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
