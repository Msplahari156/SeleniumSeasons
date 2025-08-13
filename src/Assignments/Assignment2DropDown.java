package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); //driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(3);
		new Select(driver.findElement(By.id("month"))).selectByIndex(6);
		new Select(driver.findElement(By.id("year"))).selectByIndex(29);
		
		/*new Select(driver.findElement(By.id("day"))).selectByValue("4");
		new Select(driver.findElement(By.id("month"))).selectByValue("7");
		new Select(driver.findElement(By.id("year"))).selectByValue("1996");*/
		
		
		
		/*new Select(driver.findElement(By.id("day"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jul");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1996"); */
		Thread.sleep(4000);
        driver.quit();
	}

}
