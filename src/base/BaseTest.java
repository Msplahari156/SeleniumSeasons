package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

@BeforeMethod
	
	public void setUp() {
		//common code before all methods is written here
		System.out.println("browser started");
		System.out.println("App Launched");
	}


@AfterMethod

public void tearDown() {
	System.out.println("Browser  closed");
  }
}
