package page_Object_Model;

import org.testng.annotations.Test;

public class Register_Test extends Base {

	@Test
	public void testCase() {
		Register_Page r = new Register_Page(driver);
		Welcome_Page w = new Welcome_Page(driver);
		
		w.getRegister_Link().click();
		r.getGender().click();
		r.getFirstname_textField().sendKeys("Himanshu");;
		r.getLastname_textField().sendKeys("Saraswat");;
		r.getEmail_textField().sendKeys("himanshu00000@gmail.com");;
		r.getPassword_textField().sendKeys("password");;
		r.getConfirmPassword_textField().sendKeys("Password");;
		r.getRegister_button().click();
	}
	
}
