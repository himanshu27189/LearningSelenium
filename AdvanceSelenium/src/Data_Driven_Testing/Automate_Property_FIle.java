package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Automate_Property_FIle {
	@Test
	public void login_Logout() throws IOException {
		FileInputStream fis = new FileInputStream("Data.property");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String pass = p.getProperty("password");
		
		Reporter.log(url,true);
		Reporter.log(user,true);
		Reporter.log(pass,true);
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
	}
}
