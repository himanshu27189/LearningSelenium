package pomRepos;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		driver.navigate().refresh();
		
		username.sendKeys("1234@gmail.com");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
