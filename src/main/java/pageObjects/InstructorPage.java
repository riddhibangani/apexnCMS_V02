package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

import org.junit.Assert;

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

	@FindBy(xpath = "//span/mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color' and 1]")
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
	
	@FindBy(id = "is-archived-input")
	@CacheLookup
	WebElement checkboxArchive;
	
	@FindBy(xpath = "//button[@class='mat-icon-button mat-button-base _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElement lnkSelectFile;
	
	@FindBy(id = "submit-button")
	@CacheLookup
	WebElement btnSave_Inst;
	


	//Action Methods
	
	public String getTitle()
	{
		return ldriver.getTitle();
	}

	public void clickonMainMenu()
	
	{
		waithelper.WaitForElement(Main_menuList, 10);
		Main_menuList.click();
	}

	public void selectInstOption()
	{
		waithelper.WaitForElement(Inst_menuitem, 10);
		Inst_menuitem.click();
	}
	

	public void createNewInstbtn()
	{
		waithelper.WaitForElement(btnCreateNewInst, 5);
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

	public void chcekisArchived()
	{
		checkboxArchive.click();
	}

	public void uploadimage()
	{
		lnkSelectFile.click();

		//write the code to upload the image from local
	}

	public void savenewInstructor()
	{
		btnSave_Inst.click();
		waithelper.WaitForElement(btnSave_Inst, 5);
	}

	public void NewInstructor(String newInst)
	{
		
		if(ldriver.getPageSource().contains(newInst))
		{
			System.out.println("Instructor is created successfully");
			Assert.assertTrue(false);
		}
		else{
			Assert.assertEquals(newInst, ldriver.getPageSource().contains(newInst));
			
		
		}
	}
}








