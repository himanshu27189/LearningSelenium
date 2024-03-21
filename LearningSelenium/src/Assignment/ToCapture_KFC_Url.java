package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCapture_KFC_Url {
	public static void main(String[] args) {
		
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://online.kfc.co.in/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	}
	}
