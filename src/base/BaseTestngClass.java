package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTestngClass {

		WebDriver driver;
		@BeforeMethod
		public void setUp() {
			driver=new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
		}

		@Test
		public void mouseHoverTest() throws InterruptedException {
			Thread.sleep(3000);
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


