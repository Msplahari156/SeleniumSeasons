package linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement forgotPasswordLink=driver.findElement(By.linkText("Forgot Password?")); //using multiple times so assigned to webelement
	System.out.println(forgotPasswordLink.isDisplayed()); //true
	System.out.println(forgotPasswordLink.getText()); //Forgot Password?
	forgotPasswordLink.click(); //click forgot password link
	Thread.sleep(3000);
	System.out.println(driver.getTitle()); //check navigated to next page or not 
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();//back to homepage
	Thread.sleep(3000);
	System.out.println(driver.getTitle()); //check navigated to homepage or not 
	System.out.println(driver.getCurrentUrl());
	
	driver.quit();
	
	
	}

}
