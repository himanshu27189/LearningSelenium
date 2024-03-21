package advanceSelenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void toLaunch() {
		driver = new EdgeDriver();
		Reporter.log("Browser launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("himanshu111@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("himanshu010");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Successfully navigated to HomePage", true);
	}
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.partialLinkText("Log out")).click();
		Reporter.log("Loged out successfully", true);
	}
	
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed successfully", true);
		driver.quit();
	}
}
