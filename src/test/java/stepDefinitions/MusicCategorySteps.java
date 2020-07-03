package stepDefinitions;

import io.cucumber.java.en.*;

public class MusicCategorySteps extends BaseClass
{

	
	@And("^select the option as Music categories$")
    public void select_the_option_as_music_categories() 
	{
        mp.selectMusicCategoryOption();   
        
	}
	
	@When("^click on Create a new music category button$")
    public void click_on_create_a_new_music_category_button()
	{
        mp.createNewMusicCategorybtn();
    }
	
	@And("^enter the title as \"([^\"]*)\"$")
    public void enter_the_title_as_something(String MscTitle) 
	{
		
		mp.enterMscTitle(MscTitle);
    }
	
	@Then("^the new music category \"([^\"]*)\" is added successfully$")
    public void the_new_music_category_something_is_added_successfully(String newMscCat)
    {
		mp.NewMusicCategory(newMscCat);
    }
}
