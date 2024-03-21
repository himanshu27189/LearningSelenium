package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWQpjSA7Fz6e_IzligwORRqN7KO2DCJlllstaDuMdga6TxTtNIIB8dUaAnV1EALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.id("loginclose1")).click();
		
		// Action class
		Actions action = new Actions(driver);
		WebElement hoverELe = driver.findElement(By.linkText("Storage"));
		action.moveToElement(hoverELe).perform();
	}
}
