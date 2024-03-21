package page_Object_Model;
import java.time.Duration;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Class extends Base {
	
	@Test(priority = 1)
	public void login() {
		Login_Page l = new Login_Page(driver);
		Welcome_Page w = new Welcome_Page(driver);
	
		w.getLogin_Link().click();
		l.getEmail_textField().sendKeys("himanshu11111@gmail.com");
		l.getPassword_textField().sendKeys("password");
		l.getLogin_Button().click();
		Reporter.log("Login done",true);
	}
	
	@Test (priority =2)
	public void digital_Downloads() {
		Login_Page l = new Login_Page(driver);
		Digital_Downloads_page dp = new Digital_Downloads_page(driver);
		l.getDigital_Downloads_Link().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dp.getFirstAlbum_AddToCart_Button().click();
		Reporter.log("Item added to the cart",true);
	}
	
	@Test (priority = 3)
	public void shoppingCart() {
		ShoppingCart_Page s = new ShoppingCart_Page(driver);
		Welcome_Page w = new Welcome_Page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.getShopping_Link().click();
		s.getTermsofservice_Checkbox().click();
		s.getCheckout_Button().click();
	}
	
	@Test(priority =4)
	public void checkout() {
		Checkout_Page c = new Checkout_Page(driver);
		
		c.getCountry_Dropdown().click();
		c.getCity_textField().sendKeys("Bengaluru");
		c.getAddress1_textField().sendKeys("Old airport road");
		c.getAddress2_textField().sendKeys("murgesh palya");
		c.getPostalCode_textField().sendKeys("560000");
		c.getPhoneNumber_textField().sendKeys("9000000000");
		c.getContinue_Button().click();
		c.getPayment_Continue_Button().click();
		c.getPayment_Info_Continue_Button().click();
		c.getConfirm_Order_Button().click();
		Reporter.log("Your order has been placed",true);
	}
}
