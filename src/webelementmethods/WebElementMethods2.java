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
 System.out.println(driver.findElement(By.id("username_span")).getAttribute("class")); //to get the attribute value of this element
 System.out.println(driver.findElement(By.id("username_span")).getAttribute("href")); //this element tag doesnt have href attribute so prints null
 
 System.out.println(driver.findElement(By.id("username_span")).getCssValue("color")); //comes in rgba format
 System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));//comes as it is in
 
 System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));//href value came as based on linktext
 System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("id"));//this element tag doesnt have class attribute so prints blank as it is a link
 
 driver.quit();

	}

}
