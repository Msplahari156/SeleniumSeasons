package testng;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;
public class AdactinHotelApp2 extends BaseTest {
	

	@Test(priority=2)
	public void loginTest() {
		System.out.println("browser started");
		System.out.println("App Launched");
		System.out.println("Login succeess");
		System.out.println("Browser  closed");
		String actResult="Adaction search hotel";
		String expResult="Adaction search hotel";
		Assert.assertTrue(actResult.equals(expResult));
		// Assert.assertTrue(false);//false will fail this test case
	}
	
	@Test (priority=1)
	public void RegistrationTest() {
		System.out.println("browser started");
		System.out.println("Registration App Launched");
		System.out.println("registration succeess");
		System.out.println("Browser  closed");
	}
	
	//if 2 methods have same priority ,then it will execute in alphabetical order again 
	@Test (priority=3)
	public void ForgotPasswordTest() {
		System.out.println("browser started");
		System.out.println("Forgot passowrd clicked");
		System.out.println("page naviagted succeess");
		System.out.println("Browser  closed");
	}
	
	@Test (priority=4,dependsOnMethods="loginTest")//if login test is fail this will skip,if login is pass,this will also pass
	public void ChangePasswordTest() {
		System.out.println("browser started");
		System.out.println("change passowrd clicked");
		System.out.println("password changed");
		System.out.println("Browser  closed");
	}
}
