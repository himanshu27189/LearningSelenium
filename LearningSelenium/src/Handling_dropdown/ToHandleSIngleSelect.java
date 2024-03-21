package Handling_dropdown;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSIngleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		//dropdown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		//select class to handle
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);
		
		//call the methods
		daySelect.selectByIndex(26);
		monthSelect.selectByValue("3");
		yearSelect.selectByVisibleText("1993");
		
		//To fetch all options
		List<WebElement> allMonths = monthSelect.getOptions();
		for( WebElement month : allMonths)
		{
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
		}
	}
}
