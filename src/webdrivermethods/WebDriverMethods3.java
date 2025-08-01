package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		//if we dont give quit below and run again same id comes but we willl close manually and relaunch so new id comes
		//quit closes the window and relaunch gives different id again
		//refresh,front,back cheska if we ask window handle then same id comes,as we are cnot closing
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles()); //gives all window ids of all active tabs open till that point
		
		driver.quit();
	}

}
