package webDriverMethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateAnd_Back_Forward_Refresh {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		
		nav.back();
		Thread.sleep(2000);
		
		nav.forward();
		Thread.sleep(2000);
		
		nav.refresh();
		
		driver.quit();
	}
}
