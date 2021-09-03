package lambada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iFrame {

	
	WebDriver driver;
	
	  @Test 
	  public void TestCase() throws InterruptedException {
		  driver.get("https://kyna.vn/");
		  
		  driver.findElement(By.className("register-btn")).click();
		  Thread.sleep(5000);
		  driver.switchTo().activeElement();
	//	  driver.findElement(By.xpath("//div[@class='form-group field-register-form-phonenumber required']//input")).sendKeys("abc");
		  Thread.sleep(3000);
		  driver.findElement(By.className("k-popup-account-close close")).click();
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	  




@BeforeTest
public void beforeTest() {
	ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");
			 driver = new ChromeDriver();
}

@AfterTest
public void afterTest() {
	  System.out.println("After Test");
}


	}


