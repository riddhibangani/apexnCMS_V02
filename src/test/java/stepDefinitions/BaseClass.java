package stepDefinitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.InstructorPage;
import pageObjects.LoginPage;
import pageObjects.MusicCategoryPage;
import utilities.PageObjectManager;

public class BaseClass {

	public static WebDriver driver;

//	public LoginPage lp;
//	public InstructorPage ip;
	public MusicCategoryPage mp;
	public static PageObjectManager pageobjectmanager;

	public void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		pageobjectmanager = new PageObjectManager(driver);		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	

	//Created for generating randome string for name and bio of instructor which is unique

	public static String randomestring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
}
