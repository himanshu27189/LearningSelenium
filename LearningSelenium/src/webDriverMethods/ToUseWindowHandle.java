package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToUseWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String sessionID = driver.getWindowHandle();
		
		System.out.println(sessionID);
	}
}
