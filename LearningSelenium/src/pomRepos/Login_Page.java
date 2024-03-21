package pomRepos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	//Constructor
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement email_Text_Field;
	
	@FindBy(id="Password")
	WebElement password_Text_Field;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_Button;

	public WebElement getEmail_Text_Field() {
		return email_Text_Field;
	}

	public WebElement getPassword_Text_Field() {
		return password_Text_Field;
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}
	
	
}
