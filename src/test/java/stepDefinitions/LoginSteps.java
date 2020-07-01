package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class LoginSteps extends BaseClass{

	
	

	@Given("user is on CMS login page at {string}")
	public void user_is_on_cms_login_page_at(String url) {
//		System.setProperty("webdriver.gecko.driver","/Users/user/Downloads/geckodriver");
//		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir"+"//Drivers/geckodriver"));
		
//		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		lp = new LoginPage(driver);
		driver.get(url);
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String email, String password) {

		lp.setUserName(email);
		lp.setPassword(password);
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
