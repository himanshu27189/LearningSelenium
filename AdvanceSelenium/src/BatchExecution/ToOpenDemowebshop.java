package BatchExecution;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ToOpenDemowebshop {
	@Test
	public void instagram() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
}
