package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name="cred")
	public String[][] sendData(){
		String[][] data= {
				{"himanshu@gmail.com","1234him"},
				{"kiran@gmail.com","kir1234"},
				{"mayank@gmail.com","may000"}
		};
		return data;
	}
	
	@Test(dataProvider="cred")
	public void toLogin(String email,String password) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
}
