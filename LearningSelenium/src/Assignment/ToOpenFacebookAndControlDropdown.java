package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenFacebookAndControlDropdown {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//option[@value='27']")).click();
		driver.findElement(By.xpath("//option[text()='Mar']")).click();
		driver.findElement(By.xpath("//option[text()='1993']")).click();
	}
}
