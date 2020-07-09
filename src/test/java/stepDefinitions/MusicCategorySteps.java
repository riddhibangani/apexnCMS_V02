package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;


public class MusicCategorySteps extends BaseClass
{

	@And("^select the option as Music categories$")
	public void select_the_option_as_music_categories() throws InterruptedException 
	{

		pageobjectmanager.getmp().selectMusicCategoryOption();  
		Thread.sleep(3000);

	}

	@When("^click on Create a new music category button$")
	public void click_on_create_a_new_music_category_button() throws InterruptedException
	{
		Assert.assertEquals("APEX - Music categories", getTitle());
		
		pageobjectmanager.getmp().createNewMusicCategorybtn();
		Thread.sleep(3000);
	}
	
	@And("^enter the title for music$")
    public void enter_the_title_for_music() throws InterruptedException 
    {
		pageobjectmanager.getmp().enterMscTitle(MscTitle);
		Thread.sleep(3000);
    }
	
	
	@Then("^the new music category is added successfully$")
	public void the_new_music_category_is_added_successfully() throws InterruptedException 
	{
		Thread.sleep(3000);
		pageobjectmanager.getmp().NewMusicCategory(MscTitle);
		
	}
	
	//----------------------------Steps to add234567890-oiuhgfhjkl;oiuytr5432567890-8iyutgdfghjkl
	
	@When("^click on the new music category created$")
    public void click_on_the_new_music_category_created() 
    {
		
    }
	
	@And("^click on the existing music category$")
    public void click_on_the_existing_music_category()
    {
		pageobjectmanager.getmp().existingMusicCat();
    }
	
	@And("^update the title for music$")
    public void update_the_title_for_music() throws InterruptedException
    {
		Thread.sleep(3000);
		pageobjectmanager.getmp().updateMscTitle(MscTitle1);
    }
	
	@Then("^the music category is updated successfully$")
    public void the_music_category_is_updated_successfully() throws InterruptedException
    {
		Thread.sleep(3000);
		pageobjectmanager.getmp().NewMusicCategory(MscTitle1);
    }

	
	@Then("^the music category is archived$")
    public void the_music_category_is_archived()
    {
		pageobjectmanager.getmp().archivedMusic();
		
    }
	
	
	
	

//	@Then("^the new music category \"([^\"]*)\" is added successfully$")
//	public void the_new_music_category_something_is_added_successfully(String newMscCat)
//	{
//		pageobjectmanager.getmp().NewMusicCategory(newMscCat);
//	}


}
