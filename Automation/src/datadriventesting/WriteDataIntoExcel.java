package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//In order to convert High level data into low level or stream of binaries
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//In order to write data into excel we should create object of Workbook interface using WorkbookFactory.create(fis);
//create(fis) will create workbook object and load the data into the object
	Workbook wb = WorkbookFactory.create(fis);
//Using wb reference we need to get the required sheet using getSheet(String sheetName), using sheet reference we
//need to call getRow(int index), using row reference we need to call getCell(int index), using cell address we should 
//use setCellValue(String value).
//setCellValue(String value) will write the data in low level language
	wb.getSheet("createUser").getRow(1).getCell(2).setCellValue("Darshan@sandalwood.com");
//Whenever we need to enter a new data into cell we should create the cell using createCell(int index)
	wb.getSheet("createUser").getRow(1).createCell(5).setCellValue("Pass");
//In order to convert the low level data into high level data we use FileOutputStream
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//In order to write the high level data into the original excel file we use write(OutputStream fos) from Workbook 
	wb.write(fos);
	wb.close();
}
}
