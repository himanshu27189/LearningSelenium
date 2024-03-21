package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchMcLaren {
	@Test(groups="smoke")
	public void mcLaren() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://cars.mclaren.com/en");
		Reporter.log("McLaren got launched", true);
		driver.quit();
	}
}
