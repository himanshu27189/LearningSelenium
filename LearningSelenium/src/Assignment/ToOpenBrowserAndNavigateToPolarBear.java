package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenBrowserAndNavigateToPolarBear {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://polarbear.co.in/");
}
}
