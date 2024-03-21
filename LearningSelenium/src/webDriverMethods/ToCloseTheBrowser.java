package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCloseTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.close();
	}
}
