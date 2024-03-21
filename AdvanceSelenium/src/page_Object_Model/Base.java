package page_Object_Model;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connection to the server",true);
	}
	
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("Disconnection from the server",true);
	}
	
	@BeforeTest
	public void connectionDB() {
		Reporter.log("Connection to the database",true);
	}
	
	@AfterTest
	public void disConnection() {
		Reporter.log("Disconnection from DB",true);
	}
	
	@BeforeClass
	public void openBrowser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("Open in the browser",true);
	}
	
	@AfterClass
	public void cloneBroswer() {
		driver.quit();
		Reporter.log("Clone the broswer",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login to the application",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout from the application",true);
	}
}
