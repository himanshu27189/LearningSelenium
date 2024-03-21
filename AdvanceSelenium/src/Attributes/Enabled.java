package Attributes;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled=true)
	public void testCase() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Reporter.log("Instagram launched successfully",true);
		driver.quit();
	}
	@Test(enabled= false)
	public void testCase1() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Demowebshop  launched successfully",true);
		driver.quit();
	}
}
