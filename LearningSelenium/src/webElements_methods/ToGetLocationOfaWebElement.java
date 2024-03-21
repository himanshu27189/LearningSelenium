package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetLocationOfaWebElement {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(4000);
	
	Point webelementpos = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
	System.out.println(webelementpos);
	System.out.println(webelementpos.getX());
	System.out.println(webelementpos.getY());
	Thread.sleep(5000);
	driver.quit();
	}
}
