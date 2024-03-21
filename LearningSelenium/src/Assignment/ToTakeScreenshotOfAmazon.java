package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToTakeScreenshotOfAmazon {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(8000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File src = new File("./errorShots/amazon.jpeg");
	org.openqa.selenium.io.FileHandler.copy(temp, src);
	Thread.sleep(5000);
	driver.quit();
}
}
