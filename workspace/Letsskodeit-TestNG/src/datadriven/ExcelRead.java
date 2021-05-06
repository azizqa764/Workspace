package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {

		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet ;
		XSSFCell Cell ;
		
		//location of the excrl file 
		String path = "C:\\Users\\AZIZ\\Documents\\NikulTest.xlsx";
		String sheetName = "Sheet1";
		
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			
			Cell = ExcelWSheet.getRow(1).getCell(2);
			String cellData= Cell.getStringCellValue();
			System.out.println("Cell Data:"+ cellData);
			
		} catch (Exception e ) {
			e.printStackTrace();
			
		}
	}

}
