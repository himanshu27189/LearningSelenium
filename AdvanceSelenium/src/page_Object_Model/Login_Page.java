package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page  extends Base_Page{

	public Login_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	private WebElement email_textField;
	
	@FindBy(id="Password")
	private WebElement password_textField;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_Button;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digital_Downloads_Link;
	
	public WebElement getEmail_textField() {
		return email_textField;
	}


	public WebElement getPassword_textField() {
		return password_textField;
	}


	public WebElement getLogin_Button() {
		return login_Button;
	}


	public WebElement getDigital_Downloads_Link() {
		return digital_Downloads_Link;
	}
	
	
}
