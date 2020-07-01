package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
		
		@FindBy(id = "email")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(id = "password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(id = "submit-button")
		@CacheLookup
		WebElement btnLogin;
		
		@FindBy(id = "logout")
		@CacheLookup
		WebElement lnkLogout;
		
//		@FindBy(xpath = "//span/mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color' and 1]")
//		@CacheLookup
//		WebElement drpdMenu;
		
		
		public void setUserName(String uname)
		{
			txtEmail.clear();
			txtEmail.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			btnLogin.click();
		}
		
		public void clickLogout()
		{
			lnkLogout.click();
		}
		
//		public void enterMenu()
//		{
//			drpdMenu.click();
//		}
	}
	



