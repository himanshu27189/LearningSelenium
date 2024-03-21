package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseDependentAndIndependentXpathBySurroundings {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../..//button[@id='addToCart']")).click();
	}
}
