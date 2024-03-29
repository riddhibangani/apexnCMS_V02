package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class MusicCategoryPage {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public MusicCategoryPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper = new WaitHelper(ldriver);
	}

	//WebElements
	
	@FindBy(id = "music-categories")
	@CacheLookup
	WebElement MscCatgy_menuitem;
	
	@FindBy(xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElement btnCreateNewMsc;
	
	@FindBy(id = "title")
	@CacheLookup
	WebElement txtTitle;
	
	//Action Methods
	
	public void selectMusicCategoryOption()
	{
		waithelper.WaitForElement(MscCatgy_menuitem, 10);
		MscCatgy_menuitem.click();
	}
	
	public void createNewMusicCategorybtn()
	{
		waithelper.WaitForElement(btnCreateNewMsc, 10);
		btnCreateNewMsc.click();
	}
	
	public void enterMscTitle(String MscTitle)
	{
		txtTitle.sendKeys(MscTitle);
	}
	
	public void NewMusicCategory(String newMscCat)
	{
		
		if(ldriver.getPageSource().contains(newMscCat))
		{
			System.out.println("Music Category is created successfully");
			Assert.assertTrue(true);
		}
		else{
			
			System.out.println("Music Category is not created");
			Assert.assertTrue(false);
		
		}
	}
	

}
