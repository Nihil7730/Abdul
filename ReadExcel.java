package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
	/*	String fileLocation="./TestData/TestDataDetails.xlsx";
		XSSFWorkbook Wbook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet=Wbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		for (int i = 0; i < 2; i++) {
			XSSFCell cell = row.getCell(i);
			String Value = cell.getStringCellValue();
			System.out.println(Value);*/
		
		
		
		//String fileLocation="./TestData/TestDataDetails.xlsx";
		FileInputStream fileLocation=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestDataDetails.xlsx");		
		XSSFWorkbook Wbook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet=Wbook.getSheet("sheet1");
		
		int TotalRow=sheet.getLastRowNum();
		int TotalCell=sheet.getRow(0).getLastCellNum();
		
		//System.out.println("Total Number of Row  "+TotalRow);
		//System.out.println("Total Number of cell  "+TotalCell);
		
		for(int r=0;r<=TotalRow;r++) 
		{
		XSSFRow ROW=sheet.getRow(r);
		
		for(int c=0;c<TotalCell;c++) 
		{
		XSSFCell CELL=ROW.getCell(c);
		System.out.print(CELL.toString()+"\t");
			
		}
		System.out.println();
		}
		}
		}

	


