package Handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement listBox = driver.findElement(By.id("cars"));
		// select cars
		
		Select multiSelect = new Select(listBox);
		System.out.println(multiSelect.isMultiple());
		
		//to select 
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("199");
		Thread.sleep(5000);
		
		// To deselect
		//multiSelect.deselectByIndex(0);
		//multiSelect.deselectByValue("199");
		multiSelect.deselectAll();
	}
}
