package testng;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void validUsernamAndValidPassword() {
    System.out.println("Login suiccessful");
	}
	@Test
	public void validUsernamAndInvalidPassword() {
	    System.out.println("Error msg displayed");
		}
	@Test
public void InvalidUsernamAndalidPassword() {
   System.out.println("Error msg displayed");
		}
	@Test
public void InvalidUsernamAndInvalidPassword() {
 System.out.println("Error msg displayed");
	}
	@Test
public void emptyUsernamAndEmptyPassword() {
System.out.println("Error msg displayed");
		}
	
	@Test
public void onlyPasswordEmpty() {
System.out.println("Error msg displayed");
		}
	@Test
public void onlyUsernameEmpty() {
System.out.println("Error msg displayed");
		}
	@Test
public void pendingEmailVerification() {
System.out.println("Email verification is pending error msg displayed");
		}
}
