package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_Page extends Base_Page {

	public Welcome_Page(WebDriver driver) {
		super(driver);
	}


	@FindBy(linkText = "Register")
	private WebElement register_Link;
	
	@FindBy(linkText = "Log in")
	private WebElement login_Link;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shopping_Link;
	
	@FindBy(linkText = "Log out")
	private WebElement logout_Link;
	
	 
	public WebElement getRegister_Link() {
		return register_Link;
	}


	public WebElement getLogin_Link() {
		return login_Link;
	}


	public WebElement getShopping_Link() {
		return shopping_Link;
	}


	public WebElement getLogout_Link() {
		return logout_Link;
	}
	
}
