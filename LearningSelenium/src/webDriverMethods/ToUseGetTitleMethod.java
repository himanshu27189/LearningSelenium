package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetTitleMethod {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://twitter.com/x");
	Object titleOfWebage = driver.getTitle();
	System.out.println(titleOfWebage);
}
}
