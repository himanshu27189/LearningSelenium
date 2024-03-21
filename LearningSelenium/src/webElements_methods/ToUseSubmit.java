package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseSubmit {
	public static void main(String[] args) throws InterruptedException {
		
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("himanshu@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("hima1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	Thread.sleep(5000);
	driver.quit();
	}
}
