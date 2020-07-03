package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.InstructorPage;
import pageObjects.LoginPage;
import pageObjects.MusicCategoryPage;
import pageObjects.WorkoutPage;

public class PageObjectManager {
	
	
	private static WebDriver driver;
	private static LoginPage lp;
	private static InstructorPage ip;
	private static MusicCategoryPage mp;
	private static WorkoutPage wp;
	
	
	public PageObjectManager(WebDriver driver) 
	{
		 
		 this.driver = driver;
		 
		 }
	
	public LoginPage getlp(){
		 
		 return (lp == null) ? lp = new LoginPage(driver) : lp;
		 
		 }
	
	public InstructorPage getip(){
		 
		 return (ip == null) ? ip = new InstructorPage(driver) : ip;
		 
		 }
	
	public MusicCategoryPage getmp(){
		 
		 return (mp == null) ? mp = new MusicCategoryPage(driver) : mp;
		 
		 }
	
	
	public WorkoutPage getwp(){
		 
		 return (wp == null) ? wp = new WorkoutPage(driver) : wp;
		 
		 }
	
	

}
