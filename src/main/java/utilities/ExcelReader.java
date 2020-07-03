package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelReader 

{
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static String row;
	public static XSSFCell cell;
	
	
	public static void main(String[] args) throws IOException 
	{

		getCellData();
	}
	
	
	public static void getCellData() throws IOException
	{
		
		//Read the file
		fis = new FileInputStream("./TestData/apex-CMS.xlsx");
		
		//Enter workbook
		wb = new XSSFWorkbook(fis);
		
//		XSSFSheet sheet = workbook.getSheet("Sheet1"); //providing sheet name
		
		//Get the sheet
		sheet = wb.getSheetAt(1); // provide sheet index
		
		//Get the number of rows and columns 
		
		int rowcount = sheet.getLastRowNum();  //returns row count
		
		int colcount = sheet.getRow(0).getLastCellNum(); //returns column/cell count
		
		for (int i=0; i<rowcount; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);  // focus on current row
			
			for(int j=0; j<colcount; j++ )
			{
				String value = currentrow.getCell(j).toString(); // read the value from the cell
				System.out.println(value);
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

	
}
