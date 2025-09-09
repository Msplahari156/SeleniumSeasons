package handlings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}

	@Test
	public void alertHandlingTest() throws InterruptedException {
		
	driver.findElement(By.xpath("//button[@name='proceed']")).click();
	
	Alert alert=driver.switchTo().alert();
    
    String actUsernameText=alert.getText();
    //validation of alert text
    Assert.assertEquals(actUsernameText,"Please enter a valid user name");
    Thread.sleep(3000);
    //click ok 
    alert.accept();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@name='login']")).sendKeys("selenium");
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@name='proceed']")).click();
    alert=driver.switchTo().alert();
    //retrieving the alert msg 
    String actPwdText=alert.getText();
    //validation of text msg
    Assert.assertEquals(actPwdText,"Please enter your password");
    Thread.sleep(3000);
    alert.accept();
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
