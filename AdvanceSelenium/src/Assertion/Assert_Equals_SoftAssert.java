package Assertion;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Equals_SoftAssert {
	@Test
	public void testCase() {
		String ExpectedResult="https://www.fastrack.in/";
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/?hl=en");
		String ActualResult= driver.getCurrentUrl();
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ExpectedResult, ActualResult);
		sa.assertAll();
		driver.quit();
		Reporter.log("Test Case passed",true);
	}

}
