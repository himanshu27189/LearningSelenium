package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureDunzoLogo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dunzo.com/bangalore");
		Thread.sleep(5000);
		File temp = driver.findElement(By.xpath("//img[@class='sc-fzoiQi dwzMeO']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/dunzoLogo.png");
		FileHandler.copy(temp, src);
		Thread.sleep(5000);
		driver.quit();
	}
}
