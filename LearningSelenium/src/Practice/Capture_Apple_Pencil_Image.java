package Practice;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Apple_Pencil_Image {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().minimize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple pencil 2nd generation");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		for(;;) {
		try{
			File temp = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/W/MEDIAX_849526-T2/images/I/41VrYEWgJaL._AC_UY218_.jpg' and @data-image-index='3']")).getScreenshotAs(OutputType.FILE);
			File src = new File("./errorShots/applePencilImage.png");
			FileHandler.copy(temp, src);
		}
		catch(NoSuchElementException e) {
			System.out.println("Screenshot not captured");
		driver.quit();
		}
		}
	}
}
