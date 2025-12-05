package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet st;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static XSSFCellStyle style;
	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		st=wb.getSheet(xlsheet);
		int rowcount=st.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
		
		public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			st=wb.getSheet(xlsheet);
			row=st.getRow(rownum);
			int cellcount=row.getLastCellNum();
			wb.close();
			fi.close();
			return cellcount;
			
		}
		
		public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			st=wb.getSheet(xlsheet);
			row=st.getRow(rownum);
			cell=row.getCell(colnum);
			
			String data;
			try
			{
				data=cell.toString();
				//DataFormatter formetter= new DataFormatter();
				//data=formetter.formatCellValue(cell);
			}
			catch(Exception e)
			{
				data="";
			}
			wb.close();
			fi.close();
			return data;
			}		
}