package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass{
	@Test
	public void toNavigateToShoppingCartPage() {
		String expectedText="Electronics";
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actualText = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Shopping cart page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Shopping cart page", true);
		}
	}
}
