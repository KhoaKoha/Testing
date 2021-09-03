package lambada;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstracPage {
	
	public void openTheWeb (WebDriver driver, String url) {

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	public void switchToFrameByIndex (WebDriver driver, int index) {
		driver.switchTo().frame(index);
	
}
	
	public String getTextElement ( WebDriver driver, String elementLocator )  {
		WebElement textToAssert = driver.findElement(By.xpath(elementLocator));
		return textToAssert.getText();
	}
	
	public String getTitle ( WebDriver driver   ) {
		return driver.getTitle(); 
	}
	
	public void clickElement ( WebDriver driver, String elementLocator ) {
	WebElement element = driver.findElement(By.xpath(elementLocator));
	element.click();
}
	
	public void sendKeyElement ( WebDriver driver, String sendKeyString, String elementLocator ) {
	
	WebElement element = driver.findElement(By.xpath(elementLocator));
	element.sendKeys(sendKeyString);

}
	
	public void moveToElement () {
		
	} 
}
