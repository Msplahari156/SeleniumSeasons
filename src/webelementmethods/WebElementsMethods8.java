package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login_form")).submit(); 
		//instead of clicking button we are submitting form using function - enter key function
		System.out.println(driver.findElement(By.id("username_span")).getText());
		Thread.sleep(3000);
            driver.quit();
	}

}
