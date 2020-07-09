package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

import java.util.List;


public class InstructorPage {

	public WebDriver ldriver;
	
	WaitHelper waithelper;

	public InstructorPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waithelper = new WaitHelper(ldriver);
	}

	//WebElements

	@FindBy(id = "header-menu")
	@CacheLookup
	WebElement Main_menuList;
		
	@FindBy(id = "instructors")
	@CacheLookup
	WebElement Inst_menuitem;
	
	@FindBy(xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElement btnCreateNewInst;
	
	@FindBy(id = "name")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(id = "bio")
	@CacheLookup
	WebElement txtBio;
	
	@FindBy(xpath = "//*[@id=\"is-archived\"]/label/div")
	@CacheLookup
	WebElement checkboxArchive;
	
	@FindBy(xpath = "//*[@id=\"file\"]/div/button/span/input")
	@CacheLookup
	WebElement lnkSelectFile;
	
	@FindBy(id = "submit-button")
	@CacheLookup
	WebElement btnSave_Inst;
	


	//Action Methods
	

	public void clickonMainMenu()
	
	{
		waithelper.WaitForClikableElement(Main_menuList, 10);
		Main_menuList.click();
	}

	public void selectInstOption()
	{
		waithelper.WaitForClikableElement(Inst_menuitem, 10);
		Inst_menuitem.click();
	}
	

	public void createNewInstbtn()
	{
		waithelper.WaitForClikableElement(btnCreateNewInst, 5);
		btnCreateNewInst.click();
	}

	public void enterInstName(String instName)
	{
		txtName.sendKeys(instName);
	}

	public void enterInstBio(String instBio)
	{
		txtBio.sendKeys(instBio);
	}

	public void clickArchived()
	{
		Boolean checekboxDisplay = checkboxArchive.isDisplayed();
		System.out.println("Is the checkbox displayed: " + checekboxDisplay);
		
		Boolean checkboxSelected = checkboxArchive.isSelected();
		System.out.println("Is the checkbox selected: "+ checkboxSelected);
		
		checkboxArchive.click();
		
		Boolean checkboxStatus = checkboxArchive.isSelected();
		System.out.println("The updated status of checkbox is: "+ checkboxStatus);
	}

	public void uploadimage(String filepath)
	{
		lnkSelectFile.sendKeys(filepath);

	}

	public void savenew()
	{
		btnSave_Inst.click();
		
	}

	public void NewInstructor(String newInst)
	{
		
		
		List<WebElement> all = ldriver.findElements(By.xpath("//mat-card-content/h4"));
		
				WebElement newInstructor;
				Boolean result = true;
		
				for(int i=0 ; i<all.size();i++)
				{
		
					newInstructor = all.get(i);
		
					if(newInstructor.getText().equals(newInst))
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
					System.out.println("Instructor is added successfully");
				
				}
				else
				{
					System.out.println("Instructor is not added successfully");
					Assert.assertEquals(false, result);
					
				}
	}
	
	public void clickonNewInst(String newInst)
	{
		
	}
	
	public void existingInstructor()
	{
		List<WebElement> allexistingInst = ldriver.findElements(By.xpath("//mat-card-actions"));
		allexistingInst.get(1).click();
		
	}
	
	public void updateInstName(String instName)
	{
		txtName.clear();
		txtName.sendKeys(instName);
	}

	public void updateInstBio(String instBio)
	{
		txtName.clear();
		txtBio.sendKeys(instBio);
	}

	
	public void archivedInstructor()
	{
		
		Boolean result;
		
		List<WebElement> allexistingInst = ldriver.findElements(By.xpath("//mat-card-content/h4"));
		if(allexistingInst.get(0).getAttribute("class").contains("archived"))
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
	
	








