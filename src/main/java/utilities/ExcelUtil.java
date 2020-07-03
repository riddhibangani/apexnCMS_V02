package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {
	
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
		fis=new FileInputStream("./TestData/apex-CMS.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(1);
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		//Create a loop over all the rows of excel file to read it

				for (int i = 0; i < rowCount+1; i++) 
				{

					Row row = sheet.getRow(i);
					
					//Create a loop to print cell values in a row
					for (int j = 0; j < row.getLastCellNum(); j++) {

						//Print Excel data in console

						System.out.print(row.getCell(j).toString()+"|| ");

					}

					System.out.println();
				}
			}
		
	}



