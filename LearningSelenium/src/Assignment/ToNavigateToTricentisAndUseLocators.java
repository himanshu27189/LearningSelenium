package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateToTricentisAndUseLocators {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123#hdfh");
		driver.findElement(By.className("button-1 login-button")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
