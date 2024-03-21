package webElements_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
		
		for(WebElement element: autoSuggestions)
		{
			System.out.println(element.getText());
		}
		Thread.sleep(10000);
		driver.quit();
	}
}
