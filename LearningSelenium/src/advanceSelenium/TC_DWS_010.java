package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_010 extends BaseClass {
	@Test
	public void toNavigateToWishlistPage() {
		String expectedText="Wishlist";
		driver.findElement(By.xpath("//span[text()='Wishlist']/..")).click();
		String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		if(expectedText.equals(actualText))
		{
			Reporter.log("Navigated to Wishlist page successfully", true);
		} else {
			Reporter.log("Failed to navigate to Wishlist page", true);
		}
	}
}
