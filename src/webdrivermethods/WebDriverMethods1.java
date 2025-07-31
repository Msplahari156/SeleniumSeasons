package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		//new ChromeDriver(); 
		//as we are using to call this and to call method we are refering in left side as well
		//we can refer as child ChromeDriver parent RemoteWebdriver class 
		//or grandparent WebDriver(I)
		///or grandgrandparent SearchContext interface also
		//WebDriver driver=new ChromeDriver();
		WebDriver driver;
		 driver=new ChromeDriver();
		//driver=new FirefoxDriver();  // reusable like this
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		Thread.sleep(3000); // wait for 3 secs or 3000 milliseconds
		
		driver.close(); //closes browser single tab - first opened window and second window remains open
		driver.quit(); //closes the all browser windows and kills driver executable - can be seen in process in taskmanager

	}

}
