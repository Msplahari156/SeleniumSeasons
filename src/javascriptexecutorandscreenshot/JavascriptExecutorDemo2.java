package javascriptexecutorandscreenshot;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void scrollTest() throws InterruptedException {
 JavascriptExecutor js=(JavascriptExecutor) driver;
 js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
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
