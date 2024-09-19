package FileHandling_Practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Create_Prg {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();   //create workbook
		//provide location in eclipse create folder create internal eclipse sheet
		//FileOutputStream f = new FileOutputStream(".//CreateExcelInternalEclipse//EmployeeData.xlsx");   
		
		//create external excel sheet code
		FileOutputStream f = new FileOutputStream("e://EmployeeData.xlsx");   //provide location 
		XSSFSheet ss = wb.createSheet("EmpName");                             // create sheet
		wb.write(f);
		System.out.println("File is created");
	}

}
