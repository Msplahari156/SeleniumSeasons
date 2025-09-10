package javascriptexecutorandscreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsScriptClick {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void JsClick() throws InterruptedException {
//without js script is scrolling3 pepperfry code
		WebElement e1=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e1);
		//js.executeScript("arguments[0].style.border='3px solid red'", e1);
		Thread.sleep(3000);
		//popup on first window exists but this bypasses that without writing a code for the popup
		
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
