package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureUrlOfTheWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
