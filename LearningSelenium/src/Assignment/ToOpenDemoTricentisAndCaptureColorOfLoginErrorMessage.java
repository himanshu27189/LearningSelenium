package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenDemoTricentisAndCaptureColorOfLoginErrorMessage {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		//WebElement errmsg = driver.findElement(By.cssSelector("div[class=\"validation-summary-errors\"]"));
		WebElement errmsg = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		System.out.println(errmsg.getCssValue("color"));
		//System.out.println(errmsg);
		Thread.sleep(5000);
		driver.quit();
	}
}
