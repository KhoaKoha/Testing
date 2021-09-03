package lambada;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ABC {
	WebDriver driver;
	
	
	
	
  @Test
  public void getURL_VerifyLogin() throws InterruptedException {
	  
	  
	   //Launching the Site.		
      driver.get("http://demo.guru99.com/V4/");			
      		
      WebElement button =driver.findElement(By.name("btnLogin"));			
      		
      //Login to Guru99 		
      driver.findElement(By.name("uid")).sendKeys("mngr34926");					
      driver.findElement(By.name("password")).sendKeys("amUpenu");					
      JavascriptExecutor js = (JavascriptExecutor)driver;		
      //Perform Click on LOGIN button using JavascriptExecutor		
      js.executeScript("arguments[0].click();", button);
     
	 
	 
	 
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
