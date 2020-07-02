package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class WorkoutPage {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public WorkoutPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper = new WaitHelper(ldriver);
	}

	//WebElements
	
	@FindBy(id = "workouts")
	@CacheLookup
	WebElement Wrkout_menuitem;
	
	@FindBy (xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElement btnCreateNewWorkout;
	
	@FindBy (id ="title")
	@CacheLookup
	WebElement txtworkout_title;
	
	@FindBy (id ="description")
	@CacheLookup
	WebElement txtworkout_description;
	
	@FindBy (id ="videoUrl")
	@CacheLookup
	WebElement txtworkout_videoUrl;
	
	@FindBy (id ="duration")
	@CacheLookup
	WebElement numworkout_duration;
	
	@FindBy (xpath = "//mat-select[@id='genre']/div[@class='mat-select-trigger' and 1]/div[@class='mat-select-arrow-wrapper' and 2]/div[@class='mat-select-arrow' and 1]")
	@CacheLookup
	WebElement drpworkout_genre;
	
	@FindBy (id = "mat-option-0")
	@CacheLookup
	WebElement drpworkout_genre_cardio;
	
	@FindBy (id = "mat-option-1")
	@CacheLookup
	WebElement drpworkout_genre_endurance;
	
	@FindBy (id = "mat-option-2")
	@CacheLookup
	WebElement drpworkout_genre_hiit;
	
	@FindBy (xpath = "//mat-select[@id='level']/div[@class='mat-select-trigger' and 1]/div[@class='mat-select-arrow-wrapper' and 2]/div[@class='mat-select-arrow' and 1]")
	@CacheLookup    
	WebElement drpworkout_level;
	
	@FindBy (id = "mat-option-3")
	@CacheLookup
	WebElement drpworkout_level_beginner;
	
	@FindBy (id = "mat-option-4")
	@CacheLookup
	WebElement drpworkout_level_intermediate;
	
	@FindBy (id = "mat-option-5")
	@CacheLookup
	WebElement drpworkout_level_advanced;
	
	@FindBy (id = "mat-option-6")
	@CacheLookup
	WebElement drpworkout_level_spinninggod;
	
	@FindBy (id = "playlist-id")
	@CacheLookup
	WebElement txtworkout_playlistid;
	
	@FindBy (id = "weights-input")
	@CacheLookup
	WebElement checkworkout_weights;
	
	@FindBy (xpath = "//mat-select[@id='music']/div[@class='mat-select-trigger' and 1]/div[@class='mat-select-arrow-wrapper' and 2]/div[@class='mat-select-arrow' and 1]")
	@CacheLookup
	WebElement drpworkout_musiccategory;
	
	@FindBy (xpath = "//*[contains(text(), 'Pop')]")
	@CacheLookup
	WebElement drpdown_msccat_pop;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
