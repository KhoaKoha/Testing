package lambada;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UserTest extends AbstracPage {
	WebDriver driver;
	
  @Test
  public void Hover() throws InterruptedException {
	  
	  
  

openTheWeb(driver, "https://jqueryui.com/tooltip/");
switchToFrameByIndex(driver,0);

driver.getTitle(); 


WebElement hoverText = driver.findElement(By.xpath("//a[text()='Tooltips']"));
Actions action = new Actions(driver);
action.moveToElement(hoverText).perform();
//action.contextClick(hoverText).perform();

WebElement element = driver.findElement(By.xpath(null));
element.click();

driver.switchTo().defaultContent();

String texth1 = getTextElement(driver, "//p[@class='desc']");

System.out.println(texth1);



//WebElement  textAssertElement = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));
//String assertText = textAssertElement.getText();

//assertEquals("That's what this widget is", assertText);




Thread.sleep(5000);



  }
  
  @Test (enabled = false)
  public void ClickAndHold() throws InterruptedException {
	
	 List <WebElement> items = driver.findElements(By.xpath("//li[@class='ui-state-default ui-selectee']"));
	 
	  Actions moveItem = new Actions(driver);
	  moveItem.clickAndHold(items.get(0)).moveToElement(items.get(10)).release().perform();
	  Thread.sleep(5000);
	  
	  items.get(0).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }
 
  
  
}