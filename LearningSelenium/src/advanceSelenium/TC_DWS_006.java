package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	@Test
	public void toNavigateToJewelryPage() {
		String expectedText="Jewelry";
		driver.findElement(By.partialLinkText("Jewelry")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Jewelry page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Jewelry page", true);
		}
	}
}
