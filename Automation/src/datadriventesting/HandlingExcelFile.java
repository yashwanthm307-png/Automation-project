package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//In order to convert High level data into low level or stream of binaries
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//In order to read data from excel we should create object of Workbook interface using WorkbookFactory.create(fis);
//create(fis) will create workbook object and load the data into the object
	Workbook wb = WorkbookFactory.create(fis);
//Using wb reference we need to get the required sheet using getSheet(String sheetName), using sheet reference we
//need to call getRow(int index), using row reference we need to call getCell(int index), using cell address we need
//to get the string data using getStringCellValue() or numeric data using getNumericCellValue()
	String data = wb.getSheet("createUser").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
