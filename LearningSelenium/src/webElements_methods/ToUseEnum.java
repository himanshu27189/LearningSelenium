package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseEnum {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
	Thread.sleep(5000);
	driver.quit();
}
}
