package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetMethod {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(4000);
	driver.get("https://twitter.com/x");
}
}
