//package utilities;
//
//import java.io.File;
//import java.io.IOException;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//import io.cucumber.java.Scenario;
//
//@SuppressWarnings("deprecation")
//public class CustomExtentREporter
//{
//	private ExtentHtmlReporter extenthtmlreporter;
//	private ExtentReports extentreports;
//
//
//
//	
//	public CustomExtentREporter (String reportLocation)
//
//	{
//		extenthtmlreporter = new ExtentHtmlReporter(new File(reportLocation));
//
//		extentreports = new ExtentReports();
//		extentreports.attachReporter(extenthtmlreporter);
//	}
//
//	public void createTest(Scenario scenario, String screenshotFile) throws IOException
//	{
//		if(scenario!=null)
//		{
//			String testName = getScenarioTitle(scenario);
//			
//			switch (scenario.getStatus())
//			{
//			case PASSED:
//				extentreports.createTest(testName).pass("Passed");
//				break;
//				
//			case FAILED:
//				extentreports.createTest(testName).fail("Failed").addScreenCaptureFromPath(getScreenshotLocation(screenshotFile));
//				break;
//				
//			default:
//				extentreports.createTest(testName).skip("Skipped");
//				
//			}
//		}
//	}
//	
//	public void writeToReport()
//	{
//		if(extentreports!=null)
//		{
//			extentreports.flush();
//		}
//	}
//	
//	private String getScreenshotLocation(String aLocation)
//	{
//		return "file:///" + aLocation.replaceAll("\\", "//");
//	}
//	
//	private String getScenarioTitle(Scenario scenario)
//	{
//		return scenario.getName().replaceAll(" ", "") ;
//	}
//
//}