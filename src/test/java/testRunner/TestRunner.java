package testRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import stepDefinitions.BaseClass;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions

(
		features="src/test/resources/Features/",
		glue= {"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		
		plugin = {"pretty",
				 "html:target/cucumber-reports/HTMLReports/reports.html",
//				 "json:target/cucumber-reports/JSONReports/reports.json",
//				 "junit:target/cucumber-reports/JUNITReports/reports.xml",
//				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				 },
		
		
//		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		
//		plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html"},

//		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		
		tags="@filterInst"
		
)

		
	

public class TestRunner extends BaseClass{
	
	@BeforeClass
	 public static void generateramdomestring() 
	 {
		randomestring();
	 }

	
//	@AfterClass
//    public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File("/Users/user/eclipse-workspace/apexnCMS_V02/TestData/extent-config.xml"));
//    }
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
	

}
