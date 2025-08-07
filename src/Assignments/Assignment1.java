package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click(); 
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("flash")).getText());		
		System.out.println(driver.findElement(By.id("flash")).getCssValue("border-color"));	
         //WebElement logoutbutton=driver.findElement(By.cssSelector("a.button.secondary.radius"));
         //logoutbutton.click();		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);		
		System.out.println(driver.findElement(By.id("flash")).getText());		
		Thread.sleep(3000);		
		driver.quit();

	}

}
