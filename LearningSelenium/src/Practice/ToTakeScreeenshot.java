package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreeenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/JS/tryit.asp?filename=tryjs_prompt");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tmp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./errorShots/w3schools.jpeg");
		FileHandler.copy(tmp, perm);
		
	}
}
