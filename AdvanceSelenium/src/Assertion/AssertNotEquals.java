package Assertion;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
	@Test
	public void testCase() {
		String ExpectedResult = "Register";
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		//String ActualResult=driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[1]")).getText();
		//Assert.assertNotEquals(ExpectedResult, ActualResult);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Jack");
		driver.findElement(By.id("LastName")).sendKeys("Sparrow");
		driver.findElement(By.id("Email")).sendKeys("jacksparrowblackpearl@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("blackpearl");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("blackpearl");
		driver.findElement(By.id("register-button")).click();
		String ActualResult=driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[1]")).getText();
		Assert.assertNotEquals(ExpectedResult, ActualResult);
		
		driver.quit();
	}
	
}

