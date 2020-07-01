package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import pageObjects.LoginPage;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) 
	
	{
		readPropertiesFile();
		writePropertiesFile();
	}
		

	public static void readPropertiesFile()
	{
		
		try {

			InputStream input = new FileInputStream("/Users/user/eclipse-workspace/apexnCMS_V02/config.properties");
			prop.load(input);
			
//			System.out.println(prop.getProperty(""));
			
//			LoginPage.setUserName = prop.getProperty("USERNAME");
			
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
	
	
	
	
	public static void writePropertiesFile()
	{
		try {
			OutputStream output = new FileOutputStream("/Users/user/eclipse-workspace/apexnCMS_V02/config.properties");
			prop.setProperty("browser", "Chrome");
			
			prop.store(output, null);
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
	}

}
