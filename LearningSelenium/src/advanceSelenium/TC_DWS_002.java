package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
	@Test
	public void toNavigateToComputersPage() {
		String expectedText="Computers";
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to computers page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Computers page", true);
		}
		
}
}
