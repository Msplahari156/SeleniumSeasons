package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment7AlertHandling {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void alertHandling() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert a1= driver.switchTo().alert();
		Assert.assertEquals(a1.getText(),"I am a JS Alert");
		a1.accept();
		Thread.sleep(3000);
	  // System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	   Thread.sleep(3000);
	   Alert a2=driver.switchTo().alert();
	   Assert.assertEquals(a2.getText(),"I am a JS Confirm");
	   a2.dismiss();
	   Thread.sleep(3000);
	  // System.out.println(driver.findElement(By.xpath("//p[@id='result'])")).getText());
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	   Alert a3=driver.switchTo().alert();
	  Assert.assertEquals( a3.getText(),"I am a JS prompt");
	  a3.sendKeys("selenium");
	  Thread.sleep(3000);
	  a3.accept();
	  System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
	  
	  Thread.sleep(3000);
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
