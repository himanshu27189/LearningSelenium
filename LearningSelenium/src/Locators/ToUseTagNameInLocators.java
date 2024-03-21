package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseTagNameInLocators {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		driver.quit();
	}
}
