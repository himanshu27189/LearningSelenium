package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {
	@Test
	public void createAccount(){
		
		Reporter.log("Account created successfully", true);
	}
	
	@Test
	public void editAccount() {
		
		Reporter.log("Account edited successfully", true);
	}
	
	@Test(dependsOnMethods = {"createAccount","editAccount"})
	public void deleteAccount() {
		
		Reporter.log("Account deleted successfully", true);
	}
}
