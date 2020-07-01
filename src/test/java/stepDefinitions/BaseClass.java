package stepDefinitions;

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
	
	
	//Created for generating randome string for name and bio of instructor which is unique
	
	public static String randomestring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
}
