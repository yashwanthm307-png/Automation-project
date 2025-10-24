package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() is used to get the index of the last row containing data in the Sheet
//	int lastRow = wb.getSheet("invalidData").getLastRowNum();
//	System.out.println(lastRow);
//	for(int i=0;i<=lastRow;i++) {
//		String data = wb.getSheet("invalidData").getRow(i).getCell(0).getStringCellValue();
//		System.out.println(data);
//	}
//getLastCellNum() is used to get the count of last cell containing the data in the row
//	short lastCell = wb.getSheet("invalidData").getRow(0).getLastCellNum();
//	System.out.println(lastCell);
//	for(int i=0;i<lastCell;i++) {
//		String data = wb.getSheet("invalidData").getRow(0).getCell(i).getStringCellValue();
//		System.out.println(data);
//	}
	int lastRow = wb.getSheet("invalidData").getLastRowNum();
	for(int i=0;i<=lastRow;i++) {//In order to iterate rows in the sheet
		short lastCell = wb.getSheet("invalidData").getRow(i).getLastCellNum();
		for(int j=0;j<lastCell;j++) {//In order to iterate cells in a row
			String data = wb.getSheet("invalidData").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+"    ");
		}
		System.out.println();
	}
}
}
