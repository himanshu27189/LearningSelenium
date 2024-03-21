package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetCssValue {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		
		WebElement tryfree = driver.findElement(By.linkText("Try Free"));
		
		System.out.println(tryfree.getCssValue("font-size"));
		System.out.println(tryfree.getCssValue("font-family"));
		System.out.println(tryfree.getCssValue("background-color"));
		System.out.println(tryfree.getCssValue("border-radius"));
		
		Thread.sleep(10000);
		driver.quit();
	}
}
