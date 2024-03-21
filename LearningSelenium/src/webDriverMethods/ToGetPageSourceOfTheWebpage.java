package webDriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToGetPageSourceOfTheWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}

}
