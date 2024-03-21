package webElements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnBooleanMethods {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("Before enetering the data");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	Thread.sleep(2000);
	System.out.println("After enetering the data");
	driver.findElement(By.name("username")).sendKeys("2346876324");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("2837472354");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	Thread.sleep(5000);
	driver.quit();
	}
}
