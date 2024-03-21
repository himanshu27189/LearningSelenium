package toHandlePopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleHiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip-&ef_id=:G:s&msclkid=aa0e7dc259081f872428184353e3e10c");
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;) {
		try
		{
			driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='19']")).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
