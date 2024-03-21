package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAdd_3_ProductsToCart {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWQpjSA7Fz6e_IzligwORRqN7KO2DCJlllstaDuMdga6TxTtNIIB8dUaAnV1EALw_wcB");
	driver.findElement(By.id("loginclose1")).click();
	
	//Actions class
	Actions action = new Actions(driver);
	//For sofa
	{
		WebElement sofaButton = driver.findElement(By.linkText("Sofas"));
		sofaButton.click();
		WebElement lShappedSofaButton = driver.findElement(By.xpath("//img[@alt='L Shaped Sofa']"));
		lShappedSofaButton.click();
		WebElement sofaChosen = driver.findElement(By.xpath("//img[@title='Everett L - Shape Fabric Sofa (Velvet, Dark Olive Green)']"));
		sofaChosen.click();
		String currentPageControl = driver.getWindowHandle();
		System.out.println(currentPageControl);
		Set<String> allWindowID = driver.getWindowHandles();
		
		for(String windows:allWindowID) {
			System.out.println(windows);
				if(!windows.equals(currentPageControl)){
			driver.switchTo().window(windows);
				}
		}
		WebElement addToCart_Sofa = driver.findElement(By.xpath("//a[@id='button-cart-buy-now']"));
		addToCart_Sofa.click();
		}
	// For bedroom
	{
		for(int i=0;i<=2;i++) {
		driver.navigate().back();
		}
		//for driver control to child
		String currentPageControl = driver.getWindowHandle();
		System.out.println(currentPageControl);
		Set<String> allWindowID = driver.getWindowHandles();
		
		for(String windows:allWindowID) {
			System.out.println(windows);
				if(!windows.equals(currentPageControl)){
			driver.switchTo().window(windows);
				}
		}
		WebElement bedroomButton = driver.findElement(By.linkText("Bedroom"));
		bedroomButton.click();
		WebElement bedButton = driver.findElement(By.xpath("//img[@alt='Beds - bedroom furniture | online bed furniture | bedroom furniture stores in India']"));
		bedButton.click();
		WebElement bedChosen = driver.findElement(By.xpath("//img[@title='Walken Sheesham Wood Bed with Full Drawer Storage (Queen Size, Honey Finish)']"));
		bedChosen.click();
		
		WebElement addToCart_Bed = driver.findElement(By.xpath("//a[@id='button-cart-buy-now']"));
		addToCart_Bed.click();
		String currentPageControl1 = driver.getWindowHandle();
		System.out.println(currentPageControl);
		Set<String> allWindowID1 = driver.getWindowHandles();
		
		for(String windows:allWindowID1) {
			System.out.println(windows);
				if(!windows.equals(currentPageControl1)){
			driver.switchTo().window(windows);
				}
		}
	}
	// For lamps and lighting
	{
		for(int i=0;i<=2;i++) {
			driver.navigate().back();
			}
			//for driver control to child
			String currentPageControl = driver.getWindowHandle();
			System.out.println(currentPageControl);
			Set<String> allWindowID = driver.getWindowHandles();
			
			for(String windows:allWindowID) {
				System.out.println(windows);
					if(!windows.equals(currentPageControl)){
				driver.switchTo().window(windows);
					}
			}
		WebElement lampsAndLightButton = driver.findElement(By.linkText("Lamps & Lighting"));
		lampsAndLightButton.click();
		WebElement floorLampsButton = driver.findElement(By.xpath("//img[@title='Floor Lamps']"));
		floorLampsButton.click();
		WebElement floorChosen = driver.findElement(By.xpath("//img[@title='Beige Wooden Floor Lamp with Shelf White Shade']"));
		floorChosen.click();
		String currentPageControl1 = driver.getWindowHandle();
		System.out.println(currentPageControl);
		Set<String> allWindowID1 = driver.getWindowHandles();
		
		for(String windows:allWindowID1) {
			System.out.println(windows);
				if(!windows.equals(currentPageControl1)){
			driver.switchTo().window(windows);
				}
		}
		WebElement addToCart_Lamp = driver.findElement(By.xpath("//a[@id='button-cart-buy-now']"));
		addToCart_Lamp.click();
		driver.findElement(By.xpath("//img[@title='L Shaped Sofa']/../..")).click();
	}
	//action.click(lShapeSofa);
	Thread.sleep(1000);
	
	
	//action.moveToElement(lShapeSofaHover);

	/*WebElement quickViewButton = driver.findElement(By.xpath("(//p[text()='Quick View'])[1]"));
	action.click(quickViewButton);*/
	//driver.switchTo().frame("https://www.woodenstreet.com/everett-l-shape-fabric-sofa-velvet-dark-olive-green");
	//driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
	
	
	
	//driver.switchTo().window("");
	
	Thread.sleep(5000);
	driver.quit();
	}
}
