package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkOnGlobalSqa {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
	driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
	WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
	driver.switchTo().frame(iframe);
	WebElement cantBeDroppedBox = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
	WebElement draggableBox = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppableBox = driver.findElement(By.xpath("//div[@id='droppable']"));
	// Action class
	Actions action = new Actions(driver);

	action.clickAndHold(cantBeDroppedBox).dragAndDropBy(droppableBox, 100, 0).release().perform();
	
	Thread.sleep(2000);
	for(int i=110;i<=112;i++) {
	Thread.sleep(200);
	//Thread.sleep(5000);
	action.dragAndDropBy(draggableBox,i,0).perform();
	//Thread.sleep(1000);
	}
	//moveToElement(droppableBox,400, 140).release(draggableBox).perform();
	Thread.sleep(5000);
	driver.quit();
}
}
