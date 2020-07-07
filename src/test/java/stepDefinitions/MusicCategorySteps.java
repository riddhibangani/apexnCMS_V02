package stepDefinitions;

import io.cucumber.java.en.*;

import pageObjects.MusicCategoryPage;
import utilities.ExcelReader;

public class MusicCategorySteps extends BaseClass
{
	private MusicCategoryPage mp;
	
	ExcelReader excelreader = new ExcelReader();

	@And("^select the option as Music categories$")
	public void select_the_option_as_music_categories() 
	{

		pageobjectmanager.getmp().selectMusicCategoryOption();   

	}

	@When("^click on Create a new music category button$")
	public void click_on_create_a_new_music_category_button()
	{
		pageobjectmanager.getmp().createNewMusicCategorybtn();
	}

	@And("^enter the title as \"([^\"]*)\"$")
	public void enter_the_title_as_something(String MscTitle) 
	{

		pageobjectmanager.getmp().enterMscTitle(MscTitle);
	}

	@Then("^the new music category \"([^\"]*)\" is added successfully$")
	public void the_new_music_category_something_is_added_successfully(String newMscCat)
	{
		pageobjectmanager.getmp().NewMusicCategory(newMscCat);
	}

	//-------------------------testing excel----------------------------//

	@Then("^the new music category is added successfully$")
	public void the_new_music_category_is_added_successfully() 
	{

		
	}

	@And("^enter the title$")
	public void enter_the_title() 
	{
		
	}

}
