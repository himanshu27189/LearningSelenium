package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseDemoWebShopClassName {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("email")).sendKeys("himanshu@gmail.com");
		
		Thread.sleep(5000);
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("himanshu@gmail.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
