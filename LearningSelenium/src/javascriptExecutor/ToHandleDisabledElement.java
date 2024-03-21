package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.linkText("jdk-8u391-linux-aarch64.rpm")).click();
		WebElement disabledElement = driver.findElement(By.linkText("Download jdk-8u391-linux-aarch64.rpm"));
		js.executeScript("arguments[0].click()",disabledElement);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
