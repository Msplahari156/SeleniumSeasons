package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment4DragDrop2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(" https://emicalculator.net/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void dragAndDrop() throws InterruptedException {
		

	
		
		System.out.println(driver.findElement(By.xpath("//div[@id='loanamountslider']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//div[@id='loanamountslider']")).getLocation().getY());
		
		Thread.sleep(10000);		
		Actions action=new Actions(driver); 
		
		/*
		 * action.dragAndDropBy(driver.findElement(By.xpath(
		 * "//div[@id='loanamountslider']")),80,0)
		 * .pause(3000).build().perform();//rightside drag so(left side xaxis-right side
		 * xaxis)=-80
		 * 
		 * action.dragAndDropBy(driver.findElement(By.xpath(
		 * "//div[@id='loaninterestslider']")),160, 0)
		 * .pause(3000).build().perform();//rightside drag so(left side xaxis-right side
		 * xaxis)=-155
		 * 
		 * //action.sendKeys(Keys.PAGE_DOWN).pause(3000).build().perform();
		 * 
		 * action.dragAndDropBy(driver.findElement(By.xpath(
		 * "//div[@id='loantermslider']")),-110, 0) .pause(3000).build().perform();
		 * //leftside drag so(right side xaxis-left side xaxis)=105
		 */        
		
		System.out.println(driver.findElement(By.xpath("//div[@id='loanamountslider']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//div[@id='loanamountslider']")).getLocation().getY());
		
        Thread.sleep(3000);
     
       // .clickAndHold(loanTerm)
        //Negative → Left, Positive → Right
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		try{
			
			Thread.sleep(5000);
			
		}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
		
	//	driver.quit();
	}

}
