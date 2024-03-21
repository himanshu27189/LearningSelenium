package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToReadDataFromProperty {
	public static void main(String[] args) throws IOException, InterruptedException {
		//To create object of fileinputstream / file reader
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//To create object of properties 
		Properties prop = new Properties();
		
		//To call the methods and load the file
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation Script
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(10000);
		driver.quit();
	}
}
