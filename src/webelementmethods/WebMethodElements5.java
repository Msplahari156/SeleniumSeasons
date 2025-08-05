package webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethodElements5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kvb.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/div/div[3]/ul/li[1]/div/ul/li[1]/a")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/div/div[2]/ul/li[1]/a")).isDisplayed());
		
		driver.quit();
		
		
		

	}

}
