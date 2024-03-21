package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Automate_Data_Excel {

	@Test(dataProvider = "credentials")
	public void testCase(String username, String password) {
		EdgeDriver driver = new  EdgeDriver();
		
		
	}
	
	@DataProvider(name="credentials")
	public Object [] [] data() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Wolverine\\Downloads\\DemoWebShop_Register (2).xlsx");
		
		Workbook w = WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet("Sheet1");
		
		int row_Size = s.getPhysicalNumberOfRows();
		
		int column_Size = s.getRow(0).getPhysicalNumberOfCells();
		
		Object [][]d = new Object[row_Size][column_Size];
		
		for(int i=0; i<row_Size;i++) {
			for(int j=0; j<column_Size;j++) {
				
				d[i][j]= s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}

}
