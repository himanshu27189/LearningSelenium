package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateToActitimeByUsingIdLocator {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.actitime.com/free-online-trial");
	Thread.sleep(3000);
	driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.id("FirstName")).sendKeys("Himanshu");
	Thread.sleep(1000);
	driver.findElement(By.id("LastName")).sendKeys("Saraswat");
	Thread.sleep(5000);
	driver.quit();
}
}
