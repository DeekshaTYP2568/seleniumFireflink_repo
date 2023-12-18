package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/TestScriptData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		String username = workbook.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		
		/*LocalDateTime date = workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(day);
		System.err.println(year);
		int number =(int) workbook.getSheetIndex("Login").getRow(1);*/
	}

}
