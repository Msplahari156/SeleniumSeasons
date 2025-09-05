package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment5DoubleClick {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void doubleClick() throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		Thread.sleep(4000);
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[local-name()='svg'])[2]/*[name()='path']")).click();
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
		
		Actions action=new Actions(driver);
		
		for(int i=0;i<5;i++)
		{
		action.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Intractions']")))
		.pause(3000)
        .click(driver.findElement(By.xpath("//a[text()='Double Click']")))
		.pause(3000)
		.build().perform();
		Thread.sleep(5000);
		driver.navigate().back();		
		Thread.sleep(5000);
		}
	}
	
	@AfterMethod
	
	public void tearDown() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
		
	}

}
