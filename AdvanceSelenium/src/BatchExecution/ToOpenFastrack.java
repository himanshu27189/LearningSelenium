package BatchExecution;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ToOpenFastrack {
	@Test
	public void instagram() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fastrack.in/");
		driver.quit();
	}
}
