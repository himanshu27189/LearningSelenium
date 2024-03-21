package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	@Test
	public void toNavigateToGiftsCardPage() {
		String expectedText="Gift Cards";
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Gift Cards page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Gift Cards page", true);
		}
	}
}
