package browserlaunching;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	new ChromeDriver();
	
	//https://googlechromelabs.github.io/chrome-for-testing/
	//go to chromedriver win64
	//download the driver from above path and setproperty as above for the version of chrome
	//add jars to run 

	}

}
