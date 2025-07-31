package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();		
		driver.get("https://adactinhotelapp.com/");
		String title=driver.getTitle(); // retrieves and returns the title of page
		System.out.println(title);
		System.out.println(driver.getCurrentUrl()); // retrieves and returns current url
		driver.quit();
		
	}

}
