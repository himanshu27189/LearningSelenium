package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseKeyboardKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("1234567890");
		Thread.sleep(1000);
		
		un.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		
		un.sendKeys(Keys.CONTROL+"c");
		
		WebElement pwd = driver.findElement(By.name("password"));
		Thread.sleep(1000);
		pwd.sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
