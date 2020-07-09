package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class FilterPage 
{

	public WebDriver ldriver;
	public List<String> names = null;
	public int allelements = 0;

	WaitHelper waithelper;
	//	List<WebElement> all = ldriver.findElements(By.xpath("//mat-card"));


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

	@FindAll(@FindBy(xpath = "//mat-card"))
//	@CacheLookup
	List<WebElement> FilterList;

	
	@FindAll(@FindBy(xpath = "//mat-card-content/h4"))
	@CacheLookup
	List<WebElement> FilterListName;

	//Action Methods

	public void clickonFilter()
	{
		waithelper.WaitForClikableElement(drpFilter, 10);
		drpFilter.click();
	}

	public void selectAll()
	{
		clickonFilter();
		waithelper.WaitForClikableElement(FilterAll, 10);
		
		FilterAll.click();
	}

	public void selectActive()
	{
		clickonFilter();
		waithelper.WaitForClikableElement(FilterActive, 10);
		FilterActive.click();

	}

	public void selectArchive()
	{
		clickonFilter();
		waithelper.WaitForClikableElement(FilterArchive, 10);
		FilterArchive.click();

	}

	public void checkfilteredElement(String filter)
	{
		Boolean result = true;
		WebElement all;

		for(int i=0 ; i<FilterList.size();i++)
		{

			all = FilterList.get(i);

			if(all.getAttribute("class").contains("archived") && filter.equals("Archive"))
			{	
				result = true;
			}
			else if (all.getAttribute("class").contains("archived") && filter.equals("Active"))
			{
				result = false;
				break;
			}
			else if (!all.getAttribute("class").contains("archived") && filter.equals("Archive"))
			{
				result = false;
				break;
			}

			else if (!all.getAttribute("class").contains("archived") && filter.equals("Active"))
			{
				result = true;

			}
			else if((all.getAttribute("class").contains("archived") || !all.getAttribute("class").contains("archived")) && filter.equals("All")) 
			{
				
				
				result = true;
			}

			else
			{
				System.out.println("Not a valid filter");
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

	
	public void checkFilterforAll(String filter)
	{
		
		if(FilterList.size()==allelements)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	public void listoffilterdelements() throws InterruptedException 
	{
		selectActive();
		allelements = allelements + FilterList.size();
		System.out.println("The size of active filtered elements" + allelements);
		Thread.sleep(3000);

		selectArchive();
		allelements += FilterList.size();
		System.out.println("The size of archived filtered elements" +allelements);
		
//		List<WebElement> cards = ldriver.findElements(By.xpath("//mat-card-content/h4"));
		
		
		
//	for(int i=0; i<cards.size(); i++)
//	{
//		names.add(cards.get(i).getText());
//	}
//	
	
	
//	for(int i=0; i<cards.size(); i++)
//	{
//		names.add(cards.get(i).getText());
//	}
	
	
	}









}
