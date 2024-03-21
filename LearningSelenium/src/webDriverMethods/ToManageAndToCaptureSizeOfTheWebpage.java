package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class ToManageAndToCaptureSizeOfTheWebpage {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Dimension sizeOfWebpage = driver.manage().window().getSize();
		
		System.out.println(sizeOfWebpage);
		System.out.println("Height of webpage is ->	"+ sizeOfWebpage.getHeight());
		System.out.println("Width of webpage is ->"+sizeOfWebpage.getWidth());
	}
}
