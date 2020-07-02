package stepDefinitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.InstructorPage;
import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	
	public LoginPage lp;
	public InstructorPage ip;
	
	public static Logger logger;
	
//	static Properties properties;
//	
//	public static void readPropData() throws IOException
//	{
//		properties = new Properties();
//		File file = new File(System.getProperty("user.dir"+"/apexnCMS_V02/config.properties"));
//		
//		FileReader obj = new FileReader(file); 
//		 properties.load(obj);
//	}
//	
//	public static String getPropObj(String Data) throws IOException
//	{
//		readPropData();
//		String data = properties.getProperty(Data);
//		return data;
//		
//		
//	}
	
	
	//Created for generating randome string for name and bio of instructor which is unique
	
	public static String randomestring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
}
