package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchFerrari {
	@Test(groups="smoke")
	public void ferrari() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferrari got launched", true);
		driver.quit();
	}
}
