package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseClickAndGetText {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("abcd");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		String errmsg = driver.findElement(By.xpath("")).getText();
		System.out.println(errmsg);
	}
}
