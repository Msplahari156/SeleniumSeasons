package fileupload;


import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=	new ChromeDriver();
	try {
	
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	 

		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.id("submit"));
	
		
		e1.click();
	}
		catch(InvalidArgumentException obj)
		{
			System.out.println(obj.toString());
			
		}
	
		finally{
		
		driver.quit(); }
	System.out.println("end of program");
	}
	


}