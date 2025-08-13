package browserlaunching;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxGeckoDriverLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\lenovo\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
   new FirefoxDriver();
   
   //download gecko driver and give path as above
   //download from below path
   //https://github.com/mozilla/geckodriver/releases
   //and setproperty as above
   
	}

}
