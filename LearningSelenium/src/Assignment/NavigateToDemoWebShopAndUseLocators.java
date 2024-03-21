package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToDemoWebShopAndUseLocators {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Himanshu");
		Thread.sleep(1000);
		
		driver.findElement(By.id("LastName")).sendKeys("Saraswat");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("himanshu@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("1234@hi");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234@hi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
