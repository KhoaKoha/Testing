package lambada;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.beust.testng.TestNG;

public class Button_Radio {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).submit();
	

		Thread.sleep(3000);
		
		Alert alert  = driver.switchTo().alert();
		
		String arlermsg = alert.getText();
		System.out.println(arlermsg);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		

	}

}
