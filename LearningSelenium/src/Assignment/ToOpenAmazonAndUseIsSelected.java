package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenAmazonAndUseIsSelected {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']"));
		System.out.println("Before selecting-> "+checkbox.isSelected());
		checkbox.click();
		Thread.sleep(4000);
		WebElement acheckbox = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']/..//input[@type='checkbox']"));
		System.out.println("After selecting-> "+acheckbox.isSelected());
		Thread.sleep(5000);
		driver.quit();
	}
}
