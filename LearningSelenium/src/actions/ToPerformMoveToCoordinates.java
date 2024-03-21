package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveToCoordinates {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWQpjSA7Fz6e_IzligwORRqN7KO2DCJlllstaDuMdga6TxTtNIIB8dUaAnV1EALw_wcB");
		driver.findElement(By.id("loginclose1")).click();
		
		WebElement sofas = driver.findElement(By.xpath("//img[@title='Sofa set online']/.."));
		Actions action = new Actions(driver);
		action.moveByOffset(21, 0).perform();
	}
}
