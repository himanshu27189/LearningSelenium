package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digital_Downloads_page extends Base_Page {

	public Digital_Downloads_page(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath = "//img[@alt='Picture of 3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement firstAlbum_AddToCart_Button;

	public WebElement getFirstAlbum_AddToCart_Button() {
		return firstAlbum_AddToCart_Button;
	}

}
