package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RelativeXpath3 {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
	   driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("harry potter");
		Thread.sleep(3000);
		driver.quit();
	}
}
