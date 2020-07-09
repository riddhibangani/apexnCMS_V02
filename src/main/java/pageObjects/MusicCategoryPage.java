package pageObjects;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
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
		waithelper.WaitForClikableElement(MscCatgy_menuitem, 10);
		MscCatgy_menuitem.click();
	}

	public void createNewMusicCategorybtn()
	{
		waithelper.WaitForClikableElement(btnCreateNewMsc, 10);
		btnCreateNewMsc.click();
	}

	public void enterMscTitle(String MscTitle)
	{
		txtTitle.sendKeys(MscTitle);
	}

	public void updateMscTitle(String MscTitle1)
	{
		txtTitle.clear();
		txtTitle.sendKeys(MscTitle1);

	}

	public void existingMusicCat()
	{
		List<WebElement> allexistingMsc = ldriver.findElements(By.xpath("//mat-card-actions"));
		allexistingMsc.get(1).click();

	}

	public void NewMusicCategory(String newMscCat)
	{

		List<WebElement> allMusic = ldriver.findElements(By.xpath("//mat-card-content/h4"));

		WebElement newMusicCategory;
		Boolean result = true;

		for(int i=0 ; i<allMusic.size();i++)
		{

			newMusicCategory = allMusic.get(i);

			if(newMusicCategory.getText().equals(newMscCat))
			{	
				result = true;
				break;
			}

			else
			{
				result = false;

			}
		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Music Category is added successfully");

		}
		else
		{
			System.out.println("Music Category is not added successfully");
			Assert.assertEquals(false, result);

		}
	}


	public void UpdatedMusicCategory(String upMscCat)
	{

		List<WebElement> allMusic = ldriver.findElements(By.xpath("//mat-card-content/h4"));

		WebElement updatedMscCat;
		Boolean result = true;

		for(int i=0 ; i<allMusic.size();i++)
		{

			updatedMscCat = allMusic.get(i);

			if(updatedMscCat.getText().equals(upMscCat))
			{	
				result = true;
				break;
			}

			else
			{
				result = false;

			}
		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Music Category is updated successfully");

		}
		else
		{
			System.out.println("Music Category is not updated successfully");
			Assert.assertEquals(false, result);

		}
	}

	public void archivedMusic()
	{
		Boolean result;

		List<WebElement> allexistingMusic = ldriver.findElements(By.xpath("//mat-card-content/h4"));
		if(allexistingMusic.get(0).getAttribute("class").contains("archived"))
		{
			result = true;
		}
		else 
		{
			result = false;
		}
		if(result==true)
		{
			Assert.assertEquals(true, result);
		}
		else
		{
			Assert.assertEquals(false, result);
		}
	}


}
