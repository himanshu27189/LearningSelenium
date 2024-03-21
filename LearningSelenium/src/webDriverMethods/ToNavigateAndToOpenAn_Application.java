package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.devtools.v114.page.model.NavigatedWithinDocument;
import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateAndToOpenAn_Application {
	public static void main(String[] args) throws MalformedURLException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(new URL("https://www.amazon.in/"));
	}
}
