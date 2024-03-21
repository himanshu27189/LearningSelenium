package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
/**
 * 
 */
public class ToWriteProperAutomationScriptForFacebookLoginValidation {
	public static void main(String[] args) {
		String expectedLoginPage= "https://www.facebook.com/";
		String expectedUsername = "himanshu@gmail.com";
		String expectedPassword = "himanshu090";
		
		//Step 1: Open the browser
		EdgeDriver driver = new EdgeDriver();
		System.out.println("Browser got successfully opened");
		driver.manage().window().maximize();
		System.out.println("Browser got successfully maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2: Enter the URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();		
		if(actualLoginPageTitle.equals(actualLoginPageTitle))
		{
			System.out.println("Successfully navigated to login page");
		}else {
			System.out.println("Failed to navigate to login page");
		}
		
		//Step 3: Enter the username
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.clear();
		emailTextField.sendKeys(expectedUsername);
		String actualUsername = emailTextField.getAttribute("value");
		if(actualUsername.equals(expectedUsername))
		{
			System.out.println("Username got entered successfully");
		}
		else {
			System.out.println("Failed to enter the username");
		}
		
		//Step 4: Enter the password
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys(expectedPassword);
		String actualPassword = passwordTextField.getAttribute("value");
		if(actualPassword.equals(expectedPassword))
		{
			System.out.println("Password is successfully entered");
		}else {
			System.out.println("Password failed to enter");
		}
		
		//Step 5: Click on login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		//Step 6: To close the browser
		System.out.println("Browser SUccessfully closed");
		driver.quit();
		
	}
}
