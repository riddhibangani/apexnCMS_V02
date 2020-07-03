package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions

(
		features="src/test/resources/Features/",
		glue= {"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		
		plugin = {"pretty","html:target/HTMLReports/reports.html"},
		
		tags="@addMusic"
		
)


//monochrome=true,
//
//plugin = {"pretty","html:target/HTMLReports/reports.html",
//		
//		"json:target/JSONReports/reports.json" ,
//		"junit:target/JUNITReports/reports.xml"
//},

//tags="@positive"
		
	

public class TestRunner {

}
