package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseXpathByContains {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		String errmsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(errmsg);
		Thread.sleep(2000);
		driver.quit();
	}
}
