package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.InstructorPage;
import utilities.ConfigFileReader;

public class InstructorSteps extends BaseClass {

	ConfigFileReader configFileReader= new ConfigFileReader();

	@When("^user click on the main menu$")
	public void user_click_on_the_main_menu() 
	
	{
		pageobjectmanager.getip().clickonMainMenu();
		
	}

	@And("^select the option as Instructor$")
	public void select_the_option_as_Instructor() 
	{
		
		pageobjectmanager.getip().selectInstOption();
	}

	@When("^click on Create a new instructor button$")
	public void click_on_Create_a_new_instructor_button()  
	{

		
		Assert.assertEquals("APEX - Instructors", getTitle());
		
		pageobjectmanager.getip().createNewInstbtn();
	}

	@And("^enter the name as \"([^\"]*)\" and Bio as \"([^\"]*)\"$")
	public void enter_the_name_and_bio_as(String instName, String instBio) 
	{
		
		pageobjectmanager.getip().enterInstName(instName);
		pageobjectmanager.getip().enterInstBio(instBio);
	}

	@When("^click on select the file to import at \"([^\"]*)\"$")
    public void click_on_select_the_file_to_import_at_something(String filepath) {
		
		pageobjectmanager.getip().uploadimage(filepath);
		
	}

	@And("^click on save button$")
	public void click_on_save_button() 
	{
		pageobjectmanager.getip().savenewInstructor();
	}

	@Then("^the new instructor \"([^\"]*)\" is added successfully$")
	public void the_new_instructor_is_added_successfully(String newInst)   
	{
		
		pageobjectmanager.getip().NewInstructor(newInst);
	}
	
	@When("^click on filter option$")
    public void click_on_filter_option() throws Throwable 
    {
		pageobjectmanager.getfp().clickonFilter();
    }

	@And("^select \"([^\"]*)\"$")
    public void select_something(String filter) 
    {
		if(filter=="All")
		{
			pageobjectmanager.getfp().selectAll();
		}
		else if(filter=="Archive")
		{
			pageobjectmanager.getfp().selectArchive();
		}
		else
		{
			pageobjectmanager.getfp().selectActive();
		}
    }
	
	
	@Then("^the filtered instructors should be visible$")
    public void the_filtered_instructors_should_be_visible() 
    {
		
		
    }
	


}













