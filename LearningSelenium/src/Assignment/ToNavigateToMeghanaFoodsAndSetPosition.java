package Assignment;

import java.awt.Point;

import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateToMeghanaFoodsAndSetPosition {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://meghanafoods.co.in/");
		driver.manage().window().setPosition(new org.openqa.selenium.Point(200, 50));			
	}

}
