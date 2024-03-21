package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseNameLocator {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Himanshu@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("123u7979h");
		driver.quit();
	}
}
