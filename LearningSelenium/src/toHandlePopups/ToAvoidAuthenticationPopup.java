package toHandlePopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToAvoidAuthenticationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(10000);
		driver.quit();
	}
}
