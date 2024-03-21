package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass {
	@Test
	public void toNavigateToApparelsAndShoesPage() {
		String expectedText="Apparel & Shoes";
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Apparel & Shoes page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Apparel & Shoes page", true);
		}
	}
}
