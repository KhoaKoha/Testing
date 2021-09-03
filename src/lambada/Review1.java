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

public class Review1 {
	WebDriver driver;
	
	
	
	
  @Test
  public void getURL_VerifyLogin() throws InterruptedException {
	  
	  
	 WebDriverWait wait = new WebDriverWait(driver, 30); 
	 driver.get("http://automationpractice.com/index.php");
	 String actualPageTitle = driver.getTitle();
	 String expectedPageTitle = "My Store";
	 
	 assertEquals(actualPageTitle , expectedPageTitle);
	 
	 driver.findElement(By.xpath("//a[@class='login']")).click();
	 
	 String pageURLString = driver.getCurrentUrl();
	 String actualLoginURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	 
	 assertEquals(pageURLString, actualLoginURL);
	 
	 String invalidEmailMsg = "Invalid email address.";
	 
	 driver.findElement(By.id("email_create")).sendKeys("Abc");
	 
	 driver.findElement(By.id("SubmitCreate")).click();
	 
	 // Thread.sleep(5000);
	 // invisible 
	 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='create_account_error']")));
	String erroMsg  = driver.findElement(By.id("create_account_error")).getText();
	
	assertEquals(invalidEmailMsg, erroMsg);
	 
	 
	 
	 
	 /* 
	  * Step 03 - Tới trang đăng nhập
Step 04 - Tới trang đăng kí tài khoản
Step 05 - Kiểm tra url của page đăng ký là: http://automationpractice.com/index.php?controller=authentication&back=my-account
Step 06 - Kiểm tra invalid email address - error messenger là : Invalid email address.
Step 07 - Nhập email hợp lệ
Kiểm tra title của trang tạo tài khoản

	  */
	 
	 
	 
	 
	  
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
