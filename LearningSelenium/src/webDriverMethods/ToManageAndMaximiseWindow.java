package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToManageAndMaximiseWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//to minimize
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//to full screen
		driver.manage().window().fullscreen();
	}

}
