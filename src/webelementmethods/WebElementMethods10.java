package webelementmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods10 {

	public static  void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//findElementsDemo		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // wait
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			
		}
		driver.quit();
		

	}

}
