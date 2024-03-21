package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchAudi {
	@Test(groups="integration")
	public void audi() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.audi.in/in/web/en.html");
		Reporter.log("Audi got launched", true);
		driver.quit();
	}
}
