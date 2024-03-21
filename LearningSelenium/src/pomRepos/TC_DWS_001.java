package pomRepos;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_DWS_001 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getLogin_Link().click();
		Login_Page lp = new Login_Page(driver);
		lp.getEmail_Text_Field().sendKeys("himanshu111@gmail.com");
		lp.getPassword_Text_Field().sendKeys("himanshu010");
		lp.getLogin_Button().click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
