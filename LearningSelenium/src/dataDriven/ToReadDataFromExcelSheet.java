package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToReadDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//To create object of fileinputstream / file reader
				FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
				
				Workbook workbook = WorkbookFactory.create(fis);
				
				// call methods
				String url = workbook.getSheet("sheet1").getRow(0).getCell(0).toString();
				String username = workbook.getSheet("sheet1").getRow(1).getCell(0).toString();
				String password = workbook.getSheet("sheet1").getRow(2).getCell(0).toString();
				
				
				//Automation Script
				WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get(url);
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.id("pass")).sendKeys(password);
				
				Thread.sleep(10000);
				driver.quit();
	}
}
