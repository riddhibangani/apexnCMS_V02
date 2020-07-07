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
	
	@FindBy(id = "filter-menu")
	@CacheLookup
	WebElement drpFilter;
	
	@FindBy(id = "entity-filter-All")
	@CacheLookup
	WebElement FilterAll;
	
	@FindBy(id = "entity-filter-Active")
	@CacheLookup
	WebElement FilterActive;
	
	@FindBy(id = "entity-filter-Archived")
	@CacheLookup
	WebElement FilterArchive;
	
	
	
	
	//Action Methods
	
	public void clickonFilter()
	{
		waithelper.WaitForClikableElement(drpFilter, 10);
		drpFilter.click();
	}
	
	public void selectAll()
	{
		waithelper.WaitForClikableElement(FilterAll, 10);
		FilterAll.click();
	}
	
	public void selectActive()
	{
		waithelper.WaitForClikableElement(FilterActive, 10);
		FilterActive.click();
		
		ldriver.findElements(By.tagName("mat-card")); // option
		
		List<WebElement> all = ldriver.findElements(By.xpath("//mat-card"));

		WebElement filter;
		Boolean result = true;

		for(int i=0 ; i<all.size();i++)
		{

			filter = all.get(i);

			if(filter.getAttribute("class").contains("archived"))
			{	
				result = false;
			}

			else
			{
				result = true;
				break;
			}
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
	
	public void selectArchive()
	{
		waithelper.WaitForClikableElement(FilterArchive, 10);
		FilterArchive.click();
		
		ldriver.findElements(By.tagName("mat-card")); // option
		
		List<WebElement> all = ldriver.findElements(By.xpath("//mat-card"));

		WebElement filter;
		Boolean result = true;

		for(int i=0 ; i<all.size();i++)
		{

			filter = all.get(i);

			if(filter.getAttribute("class").contains("archived"))
			{	
				result = true;
			}

			else
			{
				result = false;
				break;
			}
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
