package pomRepos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	//Constructor
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	WebElement register_Link;
	
	@FindBy(linkText="Log in")
	WebElement login_Link;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shopping_Cart_Link;
	
	@FindBy(id="small-searchterms")
	WebElement search_Text_Field;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement search_Button;
	
	@FindBy(linkText = "Books")
	WebElement books_Link;
	
	@FindBy(linkText = "Computers")
	WebElement computers_Link;
	
	@FindBy(linkText = "Electronics")
	WebElement Eelctronics_Link;
	
	@FindBy(linkText = "Apparel & Shoes")
	WebElement apparelAndShoes_Link;
	
	@FindBy(linkText = "Digital downloads")
	WebElement digitalDownloads_Link;

	public WebElement getRegister_Link() {
		return register_Link;
	}

	public WebElement getLogin_Link() {
		return login_Link;
	}

	public WebElement getShopping_Cart_Link() {
		return shopping_Cart_Link;
	}

	public WebElement getSearch_Text_Field() {
		return search_Text_Field;
	}

	public WebElement getSearch_Button() {
		return search_Button;
	}

	public WebElement getBooks_Link() {
		return books_Link;
	}

	public WebElement getComputers_Link() {
		return computers_Link;
	}

	public WebElement getEelctronics_Link() {
		return Eelctronics_Link;
	}

	public WebElement getApparelAndShoes_Link() {
		return apparelAndShoes_Link;
	}

	public WebElement getDigitalDownloads_Link() {
		return digitalDownloads_Link;
	}
	
}
