package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenOliveGardenWithUsingToNavigate {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.olivegarden.com/home");
	}
}
