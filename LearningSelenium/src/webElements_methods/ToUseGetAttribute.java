package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		
		String attrvalue = driver.findElement(By.linkText("Try Free")).getAttribute("class");
		System.out.println(attrvalue);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
