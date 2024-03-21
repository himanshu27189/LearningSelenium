package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.net.PercentEscaper;

public class ToPerformDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashBox = driver.findElement(By.id("trash"));
		WebElement galleryBox = driver.findElement(By.id("gallery"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(image1, trashBox).perform();
		action.dragAndDropBy(image1, 300, 0).perform();
		Thread.sleep(1000);
		//action.dragAndDrop(image2, trashBox).perform();
		action.clickAndHold(image2).moveToElement(trashBox).release().perform();
		Thread.sleep(1000);
		action.dragAndDrop(image3, trashBox).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image4, trashBox).perform();
		Thread.sleep(4000);
		
		action.dragAndDrop(image1, galleryBox).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image2, galleryBox).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image3, galleryBox).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image4, galleryBox).perform();
		
	}
}
