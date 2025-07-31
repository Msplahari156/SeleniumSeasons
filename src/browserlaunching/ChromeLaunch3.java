package browserlaunching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeLaunch3 {

	public static void main(String[] args) {
		
		new ChromeDriver();
		new FirefoxDriver();
		new EdgeDriver();
		//new SafariDriver(); only in mac
		new InternetExplorerDriver();

	}

}
