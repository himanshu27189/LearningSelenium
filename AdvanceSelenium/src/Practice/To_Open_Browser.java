package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Open_Browser {

	@Test
	public void testCase() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
	
	@Test
	public void testCase1() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.quit();
	}
}
