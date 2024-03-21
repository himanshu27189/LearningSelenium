package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToValidateFacebbokLogoIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		boolean facebookLogo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(facebookLogo==true)
		{
			System.out.println("Facebbok logo is displayed successfully");
		}else {
			System.out.println("Facebook logo failed to display");
		}
		
		Thread.sleep(10000);
		driver.quit();
	}
}
