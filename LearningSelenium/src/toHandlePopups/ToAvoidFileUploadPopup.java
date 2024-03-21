package toHandlePopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiA1fqrBhA1EiwAMU5m_97ZtanLI-gc2FeV4r-WS6lq_sf7uAVzygu3pYX_jKx9nBGeuwUgcxoC_2YQAvD_BwE&gclsrc=aw.ds");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Wolverine\\Downloads\\ECHS CARD.PDF");
		Thread.sleep(10000);
		driver.quit();
	}
}
