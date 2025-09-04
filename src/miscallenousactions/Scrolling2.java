package miscallenousactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scrolling2 {
	

		WebDriver driver;
		
		@BeforeMethod
		
		public void setUp() {
			
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
		}
		
		@Test
		
		public void scrolling() {
			
			Actions action = new Actions(driver);
			action.scrollByAmount(0,2000)
			.pause(3000)
			.build()
			.perform();
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


