package lambada;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class Wait_TC {
	
	WebDriver driver;
  @Test
  public void Wait() throws InterruptedException {
	  
	  System.out.println("Start time " + currenTime());
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebDriverWait wait = new WebDriverWait(driver, 60);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='start']//button")));

	  
	  
	  System.out.println("Start Findbutton " + currenTime());
	  
	WebElement startButton =  driver.findElement(By.xpath("//div[@id='start']//button"));
	
	System.out.println("Start Cick time " + currenTime());
	
	startButton.click();
	
	System.out.println("Start to find HelloWorld" + currenTime());
	
	WebElement hello = driver.findElement(By.xpath("//div[@id='finish']/h4"));
	
	System.out.println("Start to Assert HelloWorld" + currenTime());
	
	Assert.assertTrue(hello.isDisplayed());
	 
	  
  }
  
  public String currenTime() {
	  Date date = new Date ();
	  return date.toString();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
