package Data_Driven_Testing;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Use_ExcelSheet {
	
	EdgeDriver driver = new EdgeDriver();
	
	@Test
	public void register() throws EncryptedDocumentException, IOException{
		// To create file input stream
		FileInputStream fis = new FileInputStream("./test_Data/DemoWebShop_Register (2).xlsx");
		// To create workbook
		Workbook w = WorkbookFactory.create(fis);
		// TO get the sheet
		Sheet s = w.getSheet("Sheet1");
		// To get the cell values
		String gender = s.getRow(0).getCell(0).toString();
		String first_Name = s.getRow(1).getCell(0).toString();
		String last_Name = s.getRow(2).getCell(0).toString();
		String email = s.getRow(3).getCell(0).toString();
		String password = s.getRow(4).getCell(0).toString();
		String confirm_Password = s.getRow(5).getCell(0).toString();
		String register_Link = s.getRow(1).getCell(1).toString();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(register_Link);
		// To enter the data
		if (gender.contains(gender)){
			driver.findElement(By.id("gender-male")).click();
		}
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(first_Name);
		driver.findElement(By.id("LastName")).sendKeys(last_Name);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm_Password);
		driver.findElement(By.id("register-button")).click();
		
	}
	
	@Test(dependsOnMethods = "register")
	public void login() throws EncryptedDocumentException, IOException{	
		
		// To create file input stream
		FileInputStream fis = new FileInputStream("./test_Data/DemoWebShop_Register (2).xlsx");
		// To create workbook
		Workbook w = WorkbookFactory.create(fis);
		// TO get the sheet
		Sheet s = w.getSheet("Sheet1");
		// To get the cell values
		String login_Email = s.getRow(3).getCell(0).toString();
		String login_Password = s.getRow(4).getCell(0).toString();
		String login_Link = s.getRow(0).getCell(1).toString();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(login_Link);
		driver.findElement(By.id("Email")).sendKeys(login_Email);
		driver.findElement(By.id("Password")).sendKeys(login_Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		
		driver.findElement(By.linkText("Log out")).click();
	}
	
}
