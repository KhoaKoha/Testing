package lambada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99  extends AbstracPage{

	WebDriver driver;
	@Test
	  public void Hover() throws InterruptedException {
		driver = new ChromeDriver();
		openTheWeb(driver, "http://demo.guru99.com/V4/");
		clickElement(driver,"//input[@name='uid']" );
		sendKeyElement(driver,"Khoa", "//input[@name='uid']");
		Thread.sleep(5000);

}
	
}
