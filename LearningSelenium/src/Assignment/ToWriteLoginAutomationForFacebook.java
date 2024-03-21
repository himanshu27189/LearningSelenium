package Assignment;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToWriteLoginAutomationForFacebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testDataFacebookLogin.xlsx");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
