package Attributes;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority=-1)
	public void testCase() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Reporter.log("Instagram launched successfully",true);
		driver.quit();
	}
	@Test(priority=-1, invocationCount=2)
	public void testCase1() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		Reporter.log("Facebook launched successfully",true);
		driver.quit();
	}
}
