package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import utilities.ConfigFileReader;

public class LoginSteps extends BaseClass{

	ConfigFileReader configFileReader= new ConfigFileReader();


	@Before
	public void initDriver()
	{
		getDriver();
	}


	@Given("user is on CMS login page")
	public void user_is_on_cms_login_page() throws IOException 
	{

		//		WebDriverManager.chromedriver().setup();

		driver.get(configFileReader.getCMSurl());


	}

	@When("user enters username as and password")
	public void user_enters_username_as_and_password() throws IOException
	{

		pageobjectmanager.getlp().setUserName(configFileReader.getusername());
		pageobjectmanager.getlp().setPassword(configFileReader.getpassword());

	}


	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {

		pageobjectmanager.getlp().clickLogin();
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
			Assert.assertEquals(title, driver.getTitle());
			Assert.assertTrue(false);

		}
	}



	@And("close the browser")
	public void close_the_browser() 
	{
		driver.close();
	}
	

//	try 
//	{
//		throw new FileNotFoundException();
//	}
//	catch(FileNotFoundException e)
//	{
//		captureScreenShot(this.getClass().toString());
//	}

}

