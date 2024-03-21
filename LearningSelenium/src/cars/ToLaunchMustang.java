package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchMustang {
	@Test(groups="system")
	public void mustang() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ford.com/cars/mustang/");
		Reporter.log("Mustang got launched", true);
		driver.quit();
	}
}
