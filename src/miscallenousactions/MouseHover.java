package miscallenousactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void mouseHoverTest() throws InterruptedException {
		
		Actions action= new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).perform(); 
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']")))
		.pause(3000)
		.click(driver.findElement(By.xpath("//div[text()='Excess Baggage'][1]")))
		.build()
		.perform();
		//driver.findElement(By.xpath("//div[text()='Excess Baggage' and contains(@class,'css-76zvg2 r-c20mna')]")).click();
		
		Thread.sleep(3000); //action to perform we use perform method
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
