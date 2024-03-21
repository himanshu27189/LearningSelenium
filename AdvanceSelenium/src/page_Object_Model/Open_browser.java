package page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_browser {

	WebDriver driver = new EdgeDriver();
	public void open_Broswer() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void put_URL() {
		driver.get("https://demowebshop.tricentis.com");
	
	}
}
