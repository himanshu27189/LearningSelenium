package Data_Driven_Testing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_Test {

	@Test
	public void testCase() throws EncryptedDocumentException, IOException {
		String data = Read_Excel_Utility.data("Sheet1", 1, 0);
		
		Reporter.log(data,true);
	}
}
