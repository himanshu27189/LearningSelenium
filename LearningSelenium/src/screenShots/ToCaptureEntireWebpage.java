package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureEntireWebpage {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new EdgeDriver(); //to perform crossBrowser testing
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File src = new File("./errorShots/youTube.jpeg");
	org.openqa.selenium.io.FileHandler.copy(temp, src);
	Thread.sleep(10000);
	driver.quit();
}
}
