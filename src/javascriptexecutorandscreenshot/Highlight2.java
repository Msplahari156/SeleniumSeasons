package javascriptexecutorandscreenshot;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Highlight2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void alertHandlingTest() throws InterruptedException {
     JavascriptExecutor js=(JavascriptExecutor) driver;
     Thread.sleep(3000);
     WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
     js.executeScript("arguments[0].style.border='3px solid red'", userName);
     userName.sendKeys("reyaz0806");
     Thread.sleep(3000);
     
     WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
     js.executeScript("arguments[0].style.border='3px solid red'",password);
     password.sendKeys("reyaz123");
     Thread.sleep(3000);
     
     WebElement loginButton=driver.findElement(By.xpath("//input[@name='login']"));
     js.executeScript("arguments[0].style.border='3px solid red'", loginButton);
     loginButton.click();
     Thread.sleep(3000);
     
     Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
     Thread.sleep(2000);
     
     WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Logout']"));
		js.executeScript("arguments[0].style.border='3px solid red'", logoutButton);
		logoutButton.click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Logout");
		Thread.sleep(2000);
		
		WebElement loginAgainLink=driver.findElement(By.xpath("//a[text()='Click here to login again']"));
		js.executeScript("arguments[0].style.border='3px solid red'", loginAgainLink);
		loginAgainLink.click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	 
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
