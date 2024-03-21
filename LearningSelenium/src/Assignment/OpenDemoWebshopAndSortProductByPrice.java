package Assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenDemoWebshopAndSortProductByPrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demowebshop.tricentis.com/books");
	driver.manage().window().minimize();
	Thread.sleep(2000);
	
	//Object creation of select class and selecting the web element
	WebElement sortBy = driver.findElement(By.id("products-orderby"));
	Select sortByPrice = new Select(sortBy);
	//sortByPrice.selectByVisibleText("Price: High to Low");
	
	//TO fetch all the options
	List<WebElement> allOptions = sortByPrice.getOptions();
	for(WebElement allptn : allOptions)
	{
		System.out.println(allptn.getText());
		Thread.sleep(700);
	}
	Thread.sleep(2000);
	driver.quit();
}
}
