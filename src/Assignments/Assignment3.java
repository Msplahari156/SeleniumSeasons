package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Assignment3 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void mouseOver() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']")))
		.pause(3000)
		.build()
		.perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Women Ethnic']")))
		.pause(5000).build()
		.perform(); 
	    action.click(driver.findElement(By.xpath("//a[text()='Women Sarees']")))
		.pause(5000).build().perform();
		
		
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


