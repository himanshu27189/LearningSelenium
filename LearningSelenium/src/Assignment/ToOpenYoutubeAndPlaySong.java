package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenYoutubeAndPlaySong {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ikk Kudi sung by Alia Bhatt & Diljit Dosanjh | Udta Punjab | Amit Trivedi");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='video-title' and @title='Ikk Kudi sung by Alia Bhatt & Diljit Dosanjh | Udta Punjab | Amit Trivedi']")).click();
	}
}
