package utilities;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class ExtntReports {
	
	public WebDriver driver;
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@Before
	public void setExtent()
	{
		htmlreporter = new ExtentHtmlReporter(new File(System.getProperty("./target/extentmyreport.html")));
		
		htmlreporter.config().setDocumentTitle("Automation Report");
		
		htmlreporter.config().setReportName("Functional Report");
		
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Hostname", "Local");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Tester Name", "Riddhi");
	}
	

	@After
	public void endReport()
	{
		extent.flush();
	}
	
	@Test
	public void testing() 
	{
		test = extent.createTest("Login");
	}
	
	
	@After
	public void teardown()
	{
		
	}
}
