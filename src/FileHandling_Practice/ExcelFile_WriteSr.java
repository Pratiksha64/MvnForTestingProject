package FileHandling_Practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile_WriteSr {

	public static void main(String[] args) throws IOException {
    
		XSSFWorkbook workbook = new XSSFWorkbook();               // create workbook
		XSSFSheet sheet = workbook.createSheet("EmpData");        // XSSFSheet create in workbook and stored in sheet
		Object employee[][] = {{"Emp Id","Emp name","Emp Profile"},  // object class - defined data
				               {101,"AAA","Tester"},
				               {102,"BBB","Develop"},
				               {103,"CCC","Business Analsyt"},
				               {104,"DDD","Manager"},
				               {105,"EEE","Hr"}};
		
		int rows =employee.length;
		int columns = employee[0].length;    // 0 is a index of row
		
		System.out.println("rows length : "+rows);
		System.out.println("columns length : "+columns);
		
		for(int r=0;r<rows;r++)                    // for row (rows = length counting)
		{
			XSSFRow row = sheet.createRow(r);       // rows launch through sheet
			
			for(int c=0;c<columns;c++)             // for column loop started
			{
				XSSFCell cell = row.createCell(c);  // column launch through rows
				
				Object value = employee[r][c];      // example of various data --- allow to write in cell
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValueImpl((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		FileOutputStream fw = new FileOutputStream(".//CreateExcelInternalEclipse//EmployeeData.xlsx");  // file location
		workbook.write(fw);
		
		System.out.println("the data is executed");
	}

}
