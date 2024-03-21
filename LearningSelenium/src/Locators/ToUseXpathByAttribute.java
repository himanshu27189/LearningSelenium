package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseXpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
