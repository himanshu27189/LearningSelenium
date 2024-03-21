package Assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class ToGetTheTitleOfBaskinrobbins {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://careers.baskinrobbins.com/us/en/");
	String titleOfWebpage = driver.getTitle();
	System.out.println(titleOfWebpage);
}
}
