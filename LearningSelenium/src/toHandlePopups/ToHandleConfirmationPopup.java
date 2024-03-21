package toHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		Alert confirmationPopup = driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		
		confirmationPopup.accept();
		//confirmationPopup.dismiss();
		Thread.sleep(10000);
		driver.quit();
		
	}
}
