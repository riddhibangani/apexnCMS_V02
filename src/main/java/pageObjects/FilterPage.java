package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class FilterPage 
{
	
public WebDriver ldriver;
	
	WaitHelper waithelper;

	public FilterPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper = new WaitHelper(ldriver);
	}

	//WebElements
	
	@FindBy(xpath = "//button[@id='filter-menu']/span[@class='mat-button-wrapper' and 1]/mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color' and 1]")
	@CacheLookup
	WebElement drpFilter;
	
	@FindBy(xpath = "entity-filter-All")
	@CacheLookup
	WebElement FilterAll;
	
	@FindBy(xpath = "entity-filter-Active")
	@CacheLookup
	WebElement FilterActive;
	
	@FindBy(xpath = "entity-filter-Archived")
	@CacheLookup
	WebElement FilterArchive;
	
	
	//Action Methods
	
	public void clickonFilter()
	{
		waithelper.WaitForElement(drpFilter, 10);
		drpFilter.click();
	}
	
	public void selectAll()
	{
		waithelper.WaitForElement(FilterAll, 10);
		FilterAll.click();
	}
	
	public void selectActive()
	{
		waithelper.WaitForElement(FilterActive, 10);
		FilterActive.click();
	}
	
	public void selectArchive()
	{
		waithelper.WaitForElement(FilterArchive, 10);
		FilterArchive.click();
	}

}
