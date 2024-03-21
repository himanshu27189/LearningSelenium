package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenYonoSbiAndPerformMoveByOffset {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(eyeIcon, 0, 0).clickAndHold().perform();
		
	}
}
