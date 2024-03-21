package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetTagname {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		String tagname = driver.findElement(By.linkText("Try Free")).getTagName();
		System.out.println(tagname);
		Thread.sleep(5000);
		driver.quit();
	}
}
