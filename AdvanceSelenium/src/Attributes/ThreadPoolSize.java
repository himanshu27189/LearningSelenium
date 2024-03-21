package Attributes;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(priority=-1)
	public void testCase() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Reporter.log("Instagram launched successfully",true);
		driver.quit();
	}
	@Test(invocationCount=1, threadPoolSize=2)
	public void testCase1() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Demowebshop  launched successfully",true);
		driver.quit();
	}
}
