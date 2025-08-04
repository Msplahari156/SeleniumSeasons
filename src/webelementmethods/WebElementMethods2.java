package webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("username_span")).getText()); // brought error msg here
		driver.quit();

	}

}
