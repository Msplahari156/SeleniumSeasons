package testng;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AdactinHotelApp {
	
	@BeforeMethod
	
	public void setUp() {
		//common code before all methods is written here
		System.out.println("browser started");
		System.out.println("App Launched");
	}

	@Test(priority=2)
	public void loginTest() {
	
		System.out.println("Login succeess");
Assert.assertTrue(false); //false will fail this test case
	}
	
	@Test (priority=1)
	public void RegistrationTest() {
		
		System.out.println("Registration App Launched");
		System.out.println("registration succeess");
		
	}
	
	//if 2 methods have same priority ,then it will execute in alphabetical order again 
	@Test (priority=3)
	public void ForgotPasswordTest() {
	
		System.out.println("Forgot passowrd clicked");
		System.out.println("page naviagted succeess");
		
	}
	
	@Test (priority=4,dependsOnMethods="loginTest")//if login test is fail this will skip,if login is pass,this will also pass
	public void ChangePasswordTest() {
	
		System.out.println("change passowrd clicked");
		System.out.println("password changed");
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		System.out.println("Browser  closed");
      }
}
