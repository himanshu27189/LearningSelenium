package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	@Test
	public void toNavigateToElectronicsPage() {
		String expectedText="Electronics";
		driver.findElement(By.partialLinkText("Electronics")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Electronics page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Electronics page", true);
		}
}
}
