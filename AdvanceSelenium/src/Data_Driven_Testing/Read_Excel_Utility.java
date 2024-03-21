package Data_Driven_Testing;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel_Utility {

	public static String data(String sheet, int row, int column) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Wolverine\\Downloads\\DemoWebShop_Register (2).xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		String data = s.getRow(row).getCell(column).toString();
		return data;
	}
}
