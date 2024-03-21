package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass {
	@Test
	public void toNavigateToDigitalDownloadsPage() {
		String expectedText="Digital downloads";
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Digital downloads page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Digital downloads page", true);
		}
	}
}
