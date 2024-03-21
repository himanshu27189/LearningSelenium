package javascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToPerformScrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		 * driver.get("https://www.google.com/");
		 * driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		 * driver.findElement(By.linkText("Images")).click();
		 * 
		 * JavascriptExecutor js= (JavascriptExecutor) driver; for(;;) { try {
		 * driver.findElement(By.
		 * xpath("(//div[text()='20 Flowering Plants With Large Blooms'])[2]")).click();
		 * break; } catch(Exception e) { js.executeScript("window.scrollBy(0,300)"); } }
		 */
		
		// To Use Scroll into view
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		WebElement IndianFlag = driver.findElement(By.xpath("//td[text()='India']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",IndianFlag);
		Thread.sleep(5000);
		driver.quit();
	}
}
