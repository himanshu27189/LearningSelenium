package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoToMyntraAndAvoidNotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(20000);
		driver.quit();
	}
}
