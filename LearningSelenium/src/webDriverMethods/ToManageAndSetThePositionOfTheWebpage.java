package webDriverMethods;

import java.awt.Point;

import org.openqa.selenium.edge.EdgeDriver;

public class ToManageAndSetThePositionOfTheWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().setPosition(new org.openqa.selenium.Point(140, 100));
	}

}
