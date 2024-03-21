package Practice;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;

public class PaintByUsing_X_And_Y_Coordinates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mspaint.humanhead.com/#local:b85c410279674");
		WebElement canvasArea = driver.findElement(By.xpath("//div[@class='canvas-area']"));
		Actions action = new Actions(driver);
		action.clickAndHold().perform();
		
		driver.findElement(By.xpath("//div[@title='Pencil']")).click();
		//driver.findElement(By.xpath("//div[@title='Text']")).click();
		//WebElement textBox = driver.findElement(By.xpath("//div[@title='Text']"));
		/*for(int x=0,y=40;y<=120 && x<=40;y++,x++) {
			 		
		action.clickAndHold(canvasArea).moveByOffset(x,y).release().perform();
		y=y+3;
		x=x+3;
		}
		
		for(int x=0,y=-40;y<=120 && x<=40;y++,x++) {
	 		
			action.clickAndHold(canvasArea).moveByOffset(x,y).release().perform();
			y=y+3;
			x=x+3;
			}*/
		//for(int j=40;j>=0;j--) {
			//action.clickAndHold(canvasArea).moveByOffset(i,j).release().perform();
		//}
		
		//for(int x=-40,y=40;x<=40&&y>=-40;x+=5,y-=5) {
			//action.clickAndHold(canvasArea).moveByOffset(x,y).release().perform();
		//}
			
		action.clickAndHold(canvasArea).moveByOffset(5,-35).release().perform();
		action.clickAndHold(canvasArea).moveByOffset(-35,5).release().perform();
		action.clickAndHold(canvasArea).moveByOffset(-30,10).release().perform();
		action.clickAndHold(canvasArea).moveByOffset(10,-30).release().perform();
		
		//dragAndDropBy(canvasArea, 140, 40).perform();
		//WebElement textBox = driver.findElement(By.xpath("//div[@class='on-canvas-object textbox instantiated']"));
		//action.dragAndDropBy(textBox, 10, 40).perform();
		//action.getActivePointer().createPointerDown(40);
		//driver.findElement(By.xpath("//div[@title='Pencil']")).click();
		Thread.sleep(20000);
		driver.quit();
	}
}
