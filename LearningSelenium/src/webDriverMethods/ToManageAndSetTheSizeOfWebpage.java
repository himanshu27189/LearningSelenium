package webDriverMethods;

import java.awt.Dimension;

import org.openqa.selenium.edge.EdgeDriver;

public class ToManageAndSetTheSizeOfWebpage {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().setSize(new org.openqa.selenium.Dimension(200, 200));
}
}
