package lambada;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xn_UAT {
	WebDriver driver;
	
	
	
	
  @Test
  public void getURL_VerifyLogin() throws InterruptedException {
	  
	  
	 WebDriverWait wait = new WebDriverWait(driver, 30); 
	 driver.get("https://xetnghiem-uat.vietnamkhoemanh.vn/");
	
   driver.findElement(By.xpath("//button[@href='/register-test']")).click();

   driver.findElement(By.name("phoneNumber")).sendKeys("0939583900");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@type='tel']))")).sendKeys("1");
   Thread.sleep(5000);
	 
	 
	 
	 
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
