package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='flight status']")).click();		
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Search Flights']/following-sibling::div")).isEnabled());
		
		
		driver.quit();
		
	}

}