package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass {
	@Test
	public void toNavigateToMyAccountPage() {
		String expectedText="My account - Customer info";
		driver.findElement(By.partialLinkText("himanshu111@gmail.com")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='My account - Customer info']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to My account - Customer info page successfully", true);
		} else {
			Reporter.log("Failed to navigate to My account - Customer info page", true);
		}
	}
}
