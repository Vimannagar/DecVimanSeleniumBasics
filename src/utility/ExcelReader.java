package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\A\\Desktop\\Testdata.xlsx");
		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
	String value = sh1.getRow(4).getCell(1).getStringCellValue();
	
		
	System.out.println(value);
		
		
		
		
		
		
	}
	
	
}
