package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	@FindBy(linkText="Register")
	private WebElement register_Link;

	@FindBy(id="gender-male")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstname_textField;
	
	@FindBy(id="LastName")
	private WebElement lastname_textField;
	
	@FindBy(id="Email")
	private WebElement email_textField;
	
	@FindBy(id="Password")
	private WebElement password_textField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword_textField;
	
	@FindBy(id="register-button")
	private WebElement register_button;
	
	public WebElement getRegister_Link() {
		return register_Link;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname_textField() {
		return firstname_textField;
	}

	public WebElement getLastname_textField() {
		return lastname_textField;
	}

	public WebElement getEmail_textField() {
		return email_textField;
	}

	public WebElement getPassword_textField() {
		return password_textField;
	}

	public WebElement getConfirmPassword_textField() {
		return confirmPassword_textField;
	}

	public WebElement getRegister_button() {
		return register_button;
	}

	
	public Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
