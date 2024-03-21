package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToManageAndGetThePositionOfTheWebpage {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	Point position = driver.manage().window().getPosition();
	System.out.println(position);
}
}
