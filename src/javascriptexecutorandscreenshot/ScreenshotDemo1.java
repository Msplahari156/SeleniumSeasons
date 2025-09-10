package javascriptexecutorandscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenshotDemo1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void screenshotDemo() throws InterruptedException, IOException
	{
		//TakesScreenshot s=(TakesScreenshot) driver;
		Thread.sleep(5000);
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\javaworkspace\\SeleniumSeasons\\screenshot.png");
		Files.copy(srcFile, destFile);
		
		
		
	}
	@AfterMethod
	public void tearDown()
	{
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
