package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");		
		System.out.println(driver.findElement(By.xpath("/html/body/button")).isEnabled());
		
		Thread.sleep(3000);
         driver.quit();
	}

}
