package Assertion;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
	@Test
	public void testCase() {
		String ExpectedResult="https://www.fastrack.in/";
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.fastrack.in/");
		String ActualResult= driver.getCurrentUrl();
		Assert.assertEquals(ExpectedResult, ActualResult);
		driver.quit();
		Reporter.log("Test Case passed",true);
	}
}
