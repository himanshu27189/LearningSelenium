package Attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void register() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		Reporter.log("Instagram opened successfully",true);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("8999100002");
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Akshay Kumar");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("akku786");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("CU.p.ZbpC4E!37G");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("Instagram register was successful", true);
		driver.quit();
	}

	@Test(dependsOnMethods = "register")
	public void login() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://www.instagram.com/?hl=en");
		Reporter.log("Instagram opened successfully",true);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("akku786");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("CU.p.ZbpC4E!37G");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("Instagram login successful", true);
		driver.quit();
	}

}
