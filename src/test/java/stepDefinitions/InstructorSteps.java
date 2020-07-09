package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.InstructorPage;
import utilities.ConfigFileReader;

public class InstructorSteps extends BaseClass {

//	ConfigFileReader configFileReader= new ConfigFileReader();

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
	
	@And("^enter name and bio$")
    public void enter_name_and_bio() 
    {
		pageobjectmanager.getip().enterInstName(InstName);
		pageobjectmanager.getip().enterInstBio(InstBio);
    }
	
	 @Then("^the new instructor is added successfully$")
	    public void the_new_instructor_is_added_successfully() 
	    {
		 pageobjectmanager.getip().NewInstructor(InstName);
	    }

	@When("^click on select the file to import at \"([^\"]*)\"$")
    public void click_on_select_the_file_to_import_at_something(String filepath) throws InterruptedException {
		
		pageobjectmanager.getip().uploadimage(filepath);
		Thread.sleep(5000);
		
	}

	@And("^click on save button$")
	public void click_on_save_button() 
	{
		pageobjectmanager.getip().savenew();
	}

	
	 
	 
	 // --------------Steps to implement-------------------
	 
	 @When("^click on the new instructor created$")
	    public void click_on_the_new_instructor_created() 
	    {
		 
	    }
	 
	 @Then("^the instructor is updated successfully$")
	    public void the_instructor_is_updated_successfully()
	    {
		 
	    }
	 
	 @And("^click on the existing instructor$")
	    public void click_on_the_existing_instructor() throws InterruptedException 
	    {
		 Thread.sleep(3000);
		 pageobjectmanager.getip().existingInstructor();

	    }
	
	 @And("^update name and bio$")
	    public void update_name_and_bio()
	    {
		  pageobjectmanager.getip().updateInstName(InstName1);
		  pageobjectmanager.getip().updateInstBio(InstBio1);
	    }
	 
	 @When("^the archive option is selected$")
	    public void the_archive_option_is_selected() throws InterruptedException
	    {
		 Thread.sleep(3000);
		  pageobjectmanager.getip().clickArchived();
	    }
	 
	 @Then("^the instructor is archived$")
	    public void the_instructor_is_archived() 
	    {
		 pageobjectmanager.getip().archivedInstructor();
		 
	    }
	 
	 


}

//@Then("^the new instructor \"([^\"]*)\" is added successfully$")
//public void the_new_instructor_is_added_successfully(String newInst)   
//{
//	
//	pageobjectmanager.getip().NewInstructor(newInst);
//}


//@Then("^the \"([^\"]*)\" instructors should be visible$")
//public void the_something_instructors_should_be_visible(String filter) 
//{
//	pageobjectmanager.getfp().checkfilteredElement(filter);
//}

//@And("^enter the name as \"([^\"]*)\" and Bio as \"([^\"]*)\"$")
//public void enter_the_name_and_bio_as(String instName, String instBio) 
//{
//	
//	pageobjectmanager.getip().enterInstName(instName);
//	pageobjectmanager.getip().enterInstBio(instBio);
//}












