package miscallenousactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void rightClick() {
		
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.pause(3000)
		.click(driver.findElement(By.xpath("//span[text()='Copy']")))
		.build().perform();
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		driver.quit();
	}
	
	

}
