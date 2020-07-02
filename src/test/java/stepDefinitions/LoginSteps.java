package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import utilities.ConfigFileReader;

public class LoginSteps extends BaseClass{
	
	ConfigFileReader configFileReader= new ConfigFileReader();

	@Given("user is on CMS login page")
	public void user_is_on_cms_login_page() throws IOException 
	{
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		
		driver.get(configFileReader.getCMSurl());
		
		
	}

	@When("user enters username as and password")
	public void user_enters_username_as_and_password() throws IOException
	{
	   
	   lp.setUserName(configFileReader.getusername());
	   lp.setPassword(configFileReader.getpassword());
		
	}
	

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {

		lp.clickLogin();
		Thread.sleep(3000);
	}

	@Then("user is navigated to home page with page title as {string}")
	public void user_is_navigated_to_home_page_with_page_title_as(String title) {
		if (driver.getPageSource().contains("Incorrect username or password.")) {
			System.out.println("----Incorrect username or password----");
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	
	}
	
	@Then("^user is not navigated to home page with page title as \"([^\"]*)\"$")
    public void user_is_not_navigated_to_home_page_with_page_title_as_something(String title) 
	{
        if(driver.getPageSource().contains("Incorrect username or password."))
        {
        	System.out.println("----Incorrect username or password.----");
        	driver.close();
        	Assert.assertTrue(true);
        }
        else
        {
        	
        	System.out.println("----The user can login with incorrect credentials----");
//        	Assert.assertEquals(title, driver.getTitle());
        	Assert.assertTrue(false);
        	
        }
    }

	

	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	

	
//	@When("^user login with username and password with data in excel at \"([^\"]*)\"$")
//    public void user_login_with_username_and_password_with_data_in_excel_at_something(String path) throws Throwable {
//        throw new PendingException();
//    }
}
