package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateToDominosAndSetSize {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.dominos.co.in/");
		driver.manage().window().setSize(new Dimension(0,800));
	}
}
