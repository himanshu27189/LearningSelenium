package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseIsSelected {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//option[text()='INR 100 - INR 199 ( 16 ) ']"));
		System.out.println("Before click-> "+ele.isSelected());
		Thread.sleep(1000);
		ele.click();
		System.out.println("After clcik-> "+ele.isSelected());
		Thread.sleep(5000);
		driver.quit();
	}
}
