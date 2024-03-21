package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetRect {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();	
		//System.out.println(rect);
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		Thread.sleep(5000);
		driver.quit();
		}
}
