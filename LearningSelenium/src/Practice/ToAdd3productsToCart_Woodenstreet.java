package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToAdd3productsToCart_Woodenstreet {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click(); //to close popup
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//img[@alt='L Shaped Sofa']")).click();
		WebElement quickView_Sofa = driver.findElement(By.xpath("(//p[text()='Quick View'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(quickView_Sofa).click().perform();
		String parent_window = driver.getWindowHandle();
		Set<String> all_windows = driver.getWindowHandles();
		for(String wins: all_windows)
		{
			System.out.println(wins);
			if(!wins.equals(parent_window))
			{
				driver.switchTo().window(wins);
			}
		}
		driver.findElement(By.id("button-cart-buy-now")).click();
		driver.switchTo().window(parent_window);
		
		driver.findElement(By.linkText("Bedroom")).click();
		driver.findElement(By.xpath("(//img[@title='Beds'])[2]")).click();
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
				
		driver.findElement(By.id("button-cart-buy-now")).click();
		driver.findElement(By.xpath("(//div[@class='box-modal_close swpmodal-close'])[2]")).click();
				
		driver.findElement(By.linkText("Lamps & Lighting")).click();
		driver.findElement(By.xpath("//img[@title='Floor Lamps']")).click();
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
				
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		/*Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;					<<<<<[To]>>>>
		File tmp = ts.getScreenshotAs(OutputType.FILE);					<<<<<[take]>>>>
		File perm = new File("./errorShots/woodenstreet_cart.jpeg");	<<<<<[screenshot]>>>>
		FileHandler.copy(tmp, perm);*/
		Thread.sleep(10000);
		driver.quit();
	}
}
