package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddToCart_DWS {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		
		driver.findElement(By.xpath("//img[@alt='Picture of 3rd Album']/../../..//input[@value='Add to cart']")).click();
		
	}
}
