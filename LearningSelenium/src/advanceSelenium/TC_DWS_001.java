package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
	@Test
	public void toNavigateToBooksPage() {
		String expectedText="Books";
		driver.findElement(By.partialLinkText("Books")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to books page successfully", true);
		} else {
			Reporter.log("Failed to navigate to books page", true);
		}
	}
		
	
}
