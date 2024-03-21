package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart_Page extends Base_Page {
	

	public ShoppingCart_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="termsofservice")
	private WebElement termsofservice_Checkbox;
	
	@FindBy(id="checkout")
	private WebElement checkout_Button;

	public WebElement getTermsofservice_Checkbox() {
		return termsofservice_Checkbox;
	}

	public WebElement getCheckout_Button() {
		return checkout_Button;
	}
	
	
}
