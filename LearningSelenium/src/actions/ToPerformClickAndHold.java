package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("hsgdfhg@1723678");
		
		// To Use ACtion Class
		Actions action = new Actions(driver);
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		action.clickAndHold(eyeIcon).perform();
		Thread.sleep(2000);
		action.release(eyeIcon).perform();
	}
}
