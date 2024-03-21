package toHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(2000);
		
		Alert popupAlert = driver.switchTo().alert();
		System.out.println(popupAlert.getText());
		//popupAlert.accept();
		popupAlert.dismiss();
		Thread.sleep(5000);
		driver.quit();
	}
}
