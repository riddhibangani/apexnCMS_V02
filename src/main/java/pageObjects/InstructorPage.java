package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

import java.util.List;

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
	
	@FindBy(id = "is-archived-input")
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

	public void chcekisArchived()
	{
		checkboxArchive.click();
	}

	public void uploadimage(String filepath)
	{
		lnkSelectFile.sendKeys(filepath);

	}

	public void savenewInstructor()
	{
		btnSave_Inst.click();
		waithelper.WaitForClikableElement(btnSave_Inst, 10);
	}

	public void NewInstructor(String newInst)
	{
		
//		if(ldriver.getPageSource().contains(newInst))
//		{
//			System.out.println("Instructor is created successfully");
//			Assert.assertTrue(true);
//		}
//		else{
//			Assert.assertEquals(newInst, ldriver.getPageSource().contains(newInst));
//			
//		
//		}
		
		List<WebElement> all = ldriver.findElements(By.xpath("//mat-card-content/h4"));
		
				WebElement newInstructor;
				Boolean result = true;
		
				for(int i=0 ; i<all.size();i++)
				{
		
					newInstructor = all.get(i);
		
					if(newInstructor.getAttribute("class").contains(newInst))
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
	
//	public void existingInstructor()
//	{
//		List<WebElement> allexistingInst = ldriver.findElements(By.xpath("//mat-card-content/h4"));
//		
//	}
}








