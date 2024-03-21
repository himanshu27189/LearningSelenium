package webElements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TofetchAllTheELementsPresentInTopNavigationBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");

		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch(Exception e){
			Thread.sleep(2000);
			}
		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		
		for(WebElement ele : elements)
		{
			System.out.println(ele.getText());
	}
	}
}
