package linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement newUserRegisterLink =driver.findElement(By.linkText("New User Register Here")); //using multiple times so assigned to webelement
	System.out.println(newUserRegisterLink.getAttribute("href"));
	newUserRegisterLink.click();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	}

}
