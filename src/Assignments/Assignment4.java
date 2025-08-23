package Assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=null;
		System.out.println("Enter the browser to launch");
		Scanner input=new Scanner(System.in);
		String browser=input.next();
		
		switch(browser.toLowerCase()) {
			case "chrome":
			  driver =new ChromeDriver();
				Thread.sleep(3000);
				System.out.println("Chrome browser is launched");
				driver.quit();
				System.out.println("Chrome browser is closed");
				break;
			case "firefox":
				driver =new FirefoxDriver();
				Thread.sleep(3000);
				System.out.println("firefox browser is launched");
				driver.quit();
				System.out.println("firefox browser is closed");
				break;
			case "edge":
				driver= new EdgeDriver();
				Thread.sleep(3000);
				System.out.println("edge browser is launched");	
				driver.quit();
				System.out.println("edge browser is closed");	
				break;
			default: System.out.println("Enter correct browser value");		
		}
		
	}
}
	


