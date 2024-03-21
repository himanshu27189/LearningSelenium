package toHandlePopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.get("https://www.yatra.com/");
		Thread.sleep(10000);
		driver.quit();
	}
}
