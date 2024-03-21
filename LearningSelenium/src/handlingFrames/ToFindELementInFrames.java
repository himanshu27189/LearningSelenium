package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToFindELementInFrames {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		//To use frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("98767537427");
		
		//TO use frame by string id or name
		//driver.switchTo().frame("send-sms-iframe");
		//driver.findElement(By.id("regEmail")).sendKeys("1123123231");
		
		//TO use frame by webelement
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		//driver.switchTo().frame(iframe);
		//iframe.sendKeys("2834623864876");
		
		//To switch back driver control
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}
}
