package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;

	private final String propertyFilePath =  "./TestData/config.properties";

	private String url;
	private String username;
	private String password;

	public ConfigFileReader() 
	{
		readPropertyfile();
		url = properties.getProperty("URL");
		username = properties.getProperty("USER");
		password = properties.getProperty("PASSWORD");
	}

	public void readPropertyfile()
	{
		BufferedReader reader;
		try
		{
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();

			try
			{
				properties.load(reader);
				reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at "+ propertyFilePath);
		}

	}

	public String getCMSurl()
	{
	
			if(url!= null)
			return url;
			else throw new RuntimeException("URL not specified in cofig.property");
	}
	
		public String getusername()
		{
			
			if(username!= null)
			return username;
			else throw new RuntimeException("USER not specified in cofig.property");
		}
		
		public String getpassword()
		{
			
			if(password!= null)
			return password;
			else throw new RuntimeException("PASSWORD not specified in cofig.property");
		}

}
