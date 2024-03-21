package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseClearMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(2000);
		WebElement usrnm = driver.findElement(By.id("username"));
		usrnm.clear();
		Thread.sleep(1000);
		usrnm.sendKeys("himanshu");
		Thread.sleep(1000);
		WebElement psswd = driver.findElement(By.id("password"));
		psswd.clear();
		Thread.sleep(1000);
		psswd.sendKeys("12234@go");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		driver.quit();
	}
}
