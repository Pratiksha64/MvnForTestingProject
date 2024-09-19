package FileHandling_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile_ReadSr {

	public static void main(String[] args) throws IOException {

		String filepath ="e://EmployeeData.xlsx";                       // location stored
		FileInputStream fileinputstream = new FileInputStream(filepath);  // read data and provide location
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);               // workbook available
		XSSFSheet sheet = workbook.getSheetAt(0);             // excel sheet count index(0)
		
		//using while loop ------ iterator class
		
		Iterator rowitr = sheet.iterator();
		while(rowitr.hasNext())                             // for row forward print
		{
			XSSFRow row = (XSSFRow)rowitr.next();           // roe class iteration
		
		Iterator cellitr = row.iterator();                  // for column
		while(cellitr.hasNext())                            // column forward print loop
		{
			XSSFCell cell = (XSSFCell)cellitr.next();       // cell class iteration
			
			switch (cell.getCellType())                     //types of data provided
			{
			case STRING: System.out.print(cell.getStringCellValue());
			break;
			case NUMERIC: System.out.print(cell.getNumericCellValue());
			break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());
			break;
			}
			
			System.out.print(" | ");
		}
		System.out.println();
		}
		
	}

}


