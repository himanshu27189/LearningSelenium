package page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_Page extends Base_Page{
	
	public Checkout_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//option[@value='41']")
	private WebElement country_Dropdown;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement city_textField;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1_textField;
	
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement address2_textField;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement postalCode_textField;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber_textField;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement continue_Button;
	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']/input")
	private WebElement payment_Continue_Button;
	
	@FindBy(xpath="//div[@id='payment-info-buttons-container']/input")
	private WebElement payment_Info_Continue_Button;
	
	@FindBy(xpath="//div[@id='confirm-order-buttons-container']/input")
	private WebElement confirm_Order_Button;

	public WebElement getCountry_Dropdown() {
		return country_Dropdown;
	}

	public WebElement getCity_textField() {
		return city_textField;
	}

	public WebElement getAddress1_textField() {
		return address1_textField;
	}

	public WebElement getAddress2_textField() {
		return address2_textField;
	}

	public WebElement getPostalCode_textField() {
		return postalCode_textField;
	}

	public WebElement getPhoneNumber_textField() {
		return phoneNumber_textField;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}

	public WebElement getPayment_Continue_Button() {
		return payment_Continue_Button;
	}

	public WebElement getPayment_Info_Continue_Button() {
		return payment_Info_Continue_Button;
	}

	public WebElement getConfirm_Order_Button() {
		return confirm_Order_Button;
	}

}
