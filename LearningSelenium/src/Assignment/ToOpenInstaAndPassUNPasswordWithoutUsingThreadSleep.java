package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenInstaAndPassUNPasswordWithoutUsingThreadSleep {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.findElement(By.name("username")).sendKeys("himanshu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("732784tehfkh");
	}
}
