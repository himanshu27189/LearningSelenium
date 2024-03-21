package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToWorkOnHiddenElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("Create new account")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
		
		js.executeScript("arguments[0].value='Have a good day'",hiddenElement);
		
		Thread.sleep(10000);
		driver.quit();
	}
}
