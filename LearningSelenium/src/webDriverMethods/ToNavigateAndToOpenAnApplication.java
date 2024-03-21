package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateAndToOpenAnApplication {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
	}
}
