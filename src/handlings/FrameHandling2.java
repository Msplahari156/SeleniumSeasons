package handlings;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		public class FrameHandling2 {		
			
			WebDriver driver;
			@BeforeMethod
			public void setUp() {
				driver=new ChromeDriver();
				driver.get("https://www.angelfire.com/super/badwebs/");
				driver.manage().window().maximize();
			}

			@Test
			public void frameHandling() throws InterruptedException {
			
		driver.switchTo().frame("main");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@href='monkeyspaw.htm']")).click();
		Thread.sleep(4000);
		//switch to page again from frame 1
		
		driver.switchTo().defaultContent();
		//switch page to frame 2
		
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//font[contains(text(),'I Hate Frames')]/parent::a")).click();
		Thread.sleep(4000);
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

