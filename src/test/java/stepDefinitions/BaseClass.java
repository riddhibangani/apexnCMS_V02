package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PageObjectManager;





public class BaseClass {

	public static WebDriver driver;

	public static PageObjectManager pageobjectmanager;
	public static String InstName = null;
	public static String InstBio = null;
	public static String MscTitle = null;
	
	public static String InstName1 = null;
	public static String InstBio1 = null;
	public static String MscTitle1 = null;
	
	
	public void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageobjectmanager = new PageObjectManager(driver);

		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	

	//Created for generating randome string for name and bio of instructor which is unique

	public static void randomestring()
	{
	 InstName = RandomStringUtils.randomAlphanumeric(5);
	 InstBio = RandomStringUtils.randomAlphanumeric(20);
	 MscTitle = RandomStringUtils.randomAlphanumeric(6);
	 
	 InstName1 = RandomStringUtils.randomAlphanumeric(5);
	 InstBio1 = RandomStringUtils.randomAlphanumeric(20);
	 MscTitle1 = RandomStringUtils.randomAlphanumeric(10);

	}
}
