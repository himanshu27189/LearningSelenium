package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {	//testNg class
	
	@Test(priority= 0)	//To use priority
	public void cricbuzz() {	//test case
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed",true);	//test steps
		driver.quit();
	}
	
	@Test(priority=-1,invocationCount = 0)	//To use priority
	public void bigbasket() {	
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bigbasket.com/");
		Reporter.log("big basket got executed", true);	//test steps
		driver.quit();
		
	}
	@Test(priority= 1,invocationCount = 2,threadPoolSize=2)	//To use priority and invocation count("threadPoolSize is used to execute test case parallely")
	public void amazon() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed",true);	//test steps
		driver.quit();
		
	}
	@Test(enabled = false)	//To skip the execution use false
	public void facebook() {	
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("facebook got executed", true);	//test steps
		driver.quit();
	}
}
