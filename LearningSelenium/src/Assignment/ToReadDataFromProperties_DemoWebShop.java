package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToReadDataFromProperties_DemoWebShop {
	public static void main(String[] args) throws InterruptedException, IOException {
		//To create object of fileinputstream / file reader
				FileInputStream fis = new FileInputStream("./testData/DemoWebShopTestData.properties");
				
				//To create object of properties 
				Properties prop = new Properties();
				
				//To call the methods and load the file
				prop.load(fis);
				String url = prop.getProperty("url");
				String firstname = prop.getProperty("firstname");
				String lastname = prop.getProperty("lastname");
				String email = prop.getProperty("email");
				String password = prop.getProperty("password");
				String confirmpassword = prop.getProperty("confirmpassword");
				
				
				
				//Automation Script
				WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get(url);
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys(firstname);
				driver.findElement(By.id("LastName")).sendKeys(lastname);
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
				driver.findElement(By.id("register-button")).click();
				
				Thread.sleep(5000);
				driver.quit();
	}
}
