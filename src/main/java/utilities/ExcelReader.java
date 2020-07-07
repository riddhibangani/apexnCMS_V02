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





/* 			String Instructor_Name = currentrow.getCell(0).getStringCellValue();
			String Instructor_Bio = currentrow.getCell(1).getStringCellValue();
			String Instructor_Thumbnail = currentrow.getCell(2).getStringCellValue();
			String Music_Title = currentrow.getCell(3).getStringCellValue();
			String Workout_Title = currentrow.getCell(4).getStringCellValue();
			String Workout_Description = currentrow.getCell(5).getStringCellValue();
			String Video_URL = currentrow.getCell(6).getStringCellValue();
			int Duration = (int) currentrow.getCell(7).getNumericCellValue();
			String Genre = currentrow.getCell(8).getStringCellValue();
			String Level = currentrow.getCell(9).getStringCellValue();
			String Playlist_ID = currentrow.getCell(10).getStringCellValue();
			String Use_Weights = currentrow.getCell(11).getStringCellValue();
			String Music_Category = currentrow.getCell(12).getStringCellValue();
			String Instructor = currentrow.getCell(13).getStringCellValue();
			String Workout_Tumbnail = currentrow.getCell(14).getStringCellValue();
			String Warmup_Name = currentrow.getCell(15).getStringCellValue();
			int Warmup_Start = (int) currentrow.getCell(16).getNumericCellValue();
			int Warmup_end = (int) currentrow.getCell(17).getNumericCellValue();
			String Workout_Name = currentrow.getCell(18).getStringCellValue();
			int Workout_Start = (int) currentrow.getCell(19).getNumericCellValue();
			int Workout_end = (int) currentrow.getCell(20).getNumericCellValue();
			String Cooldown_Name = currentrow.getCell(21).getStringCellValue();
			int Cooldown_Start = (int) currentrow.getCell(22).getNumericCellValue();
			int Cooldown_end = (int) currentrow.getCell(23).getNumericCellValue();
			
			int Segment_start = (int) currentrow.getCell(24).getNumericCellValue();
			int Segment_end = (int) currentrow.getCell(25).getNumericCellValue();
			int Segment_RMP_Low = (int) currentrow.getCell(26).getNumericCellValue();
			int Segment_RMP_High = (int) currentrow.getCell(27).getNumericCellValue();
			int Segment_Resistant_Low = (int) currentrow.getCell(27).getNumericCellValue();
			int Segment_Resistant_High = (int) currentrow.getCell(29).getNumericCellValue();

*/
