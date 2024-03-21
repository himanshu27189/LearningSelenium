package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class TOGetSizeOfaWebElement {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		Dimension webelementsize = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		System.out.println(webelementsize);
		System.out.println(webelementsize.getHeight());
		System.out.println(webelementsize.getWidth());
		Thread.sleep(5000);
		driver.quit();
		
	}
}
