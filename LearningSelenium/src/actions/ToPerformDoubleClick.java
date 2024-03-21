package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement addButton = driver.findElement(By.id("add"));
		
		//To Use Action class
		Actions action = new Actions(driver);
		for(int i =0; i<=3;i++) 
		{
		action.doubleClick(addButton).perform();
		Thread.sleep(1000);
		}
	}
}
