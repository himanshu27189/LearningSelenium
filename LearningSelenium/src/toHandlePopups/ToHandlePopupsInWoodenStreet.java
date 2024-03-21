package toHandlePopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandlePopupsInWoodenStreet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWQpjSA7Fz6e_IzligwORRqN7KO2DCJlllstaDuMdga6TxTtNIIB8dUaAnV1EALw_wcB");
		driver.findElement(By.id("loginclose1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Stores")).click();
		
		String currentPageControl = driver.getWindowHandle();
		System.out.println(currentPageControl);
		Set<String> allWindowID = driver.getWindowHandles();
		
		for(String windows:allWindowID) {
			System.out.println(windows);
				if(!windows.equals(currentPageControl)){
			driver.switchTo().window(windows);
				}
		}
		driver.findElement(By.partialLinkText("Bangalore")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}
}
