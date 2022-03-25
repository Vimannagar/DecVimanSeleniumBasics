package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	
	public static void writeData() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheet("TestdataSheet");
		 
		 File fout = new File(path);
		 
		 FileOutputStream fos = new FileOutputStream(fout);
//		to write data for already created row and column
		 sh1.getRow(6).getCell(0).setCellValue("write test");
//		to write for non existing row and existing column 
		 sh1.createRow(22).createCell(2).setCellValue("created row and column");
		 
		 
//		 to write on existing row and non existing column
		 sh1.getRow(5).createCell(6).setCellValue("existing row and new column");
		 
//		 to save the written content
		 wb.write(fos);
		 
	}
	
	
	
	public static void getLastCellRowAndColumn() throws IOException
	{
		
		File src = new File("C:\\Users\\A\\Desktop\\Testdata.xlsx");
		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
	DataFormatter df = new DataFormatter();
	
	int lastrow = sh1.getLastRowNum();
	
	System.out.println("Last row of the sheet is: "+lastrow);
	
	
	int numberofcolumn = sh1.getRow(0).getLastCellNum();
	
	System.out.println(numberofcolumn);
	
	
	
	
	}
	public String readData(int row, int column) throws IOException
	{
File src = new File("C:\\Users\\A\\Desktop\\Testdata.xlsx");
		
//		to load that particular location to read the data
		
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
	DataFormatter df = new DataFormatter();
	
	String value = df.formatCellValue(sh1.getRow(row).getCell(column));
	
	System.out.println(value);
	
	return value;
	
	}
	

	public static void main(String[] args) throws IOException {
		
//		File src = new File("C:\\Users\\A\\Desktop\\Testdata.xlsx");
//		
////		to load that particular location to read the data
//		
//		
//		FileInputStream fis = new FileInputStream(src);
//		
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		
//		 XSSFSheet sh1 = wb.getSheetAt(0);
//		 
////	String value = sh1.getRow(8).getCell(1).getStringCellValue();
////	
////		
////	System.out.println(value);
//	
//	DataFormatter df = new DataFormatter();
//	
//	String value = df.formatCellValue(sh1.getRow(13).getCell(1));
//	
//	String value1 = df.formatCellValue(sh1.getRow(1).getCell(1));
//	System.out.println(value);
//	
//	System.out.println(value1);
//	
//	for(int row=0; row<=5; row++)
//	{
//		for(int column =0; column<=1; column++)
//		{
//		String itr = df.formatCellValue(sh1.getRow(row).getCell(column));
//		
//		System.out.println(itr);
//			
//		}
//	}
//		
//	
//	
//		
//	getLastCellRowAndColumn();
		
	
	writeData();
		
		
	}
	
	
}
