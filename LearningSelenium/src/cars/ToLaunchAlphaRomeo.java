package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchAlphaRomeo {
	@Test(groups="integration")
	public void alphaRomeo() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.alfaromeousa.com/");
		Reporter.log("Alpha Romeo got launched", true);
		driver.quit();
	}
}
