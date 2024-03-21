package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(7000);
		File temp = driver.findElement(By.xpath("//img[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/googleLogo.png");
		FileHandler.copy(temp, src);
		Thread.sleep(5000);
		driver.quit();
	}
}
