package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();		
		driver.get("https://adactinhotelapp.com/");
		// String title=driver.getTitle(); // retrieves and returns the title of page
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // retrieves and returns current url
		System.out.println(driver.getPageSource());
		driver.quit();
		
	}

}
