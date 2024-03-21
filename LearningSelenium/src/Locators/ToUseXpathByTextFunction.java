package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseXpathByTextFunction {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
