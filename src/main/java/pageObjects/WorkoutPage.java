package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WorkoutPage {
	
public WebDriver ldriver;
	
	public WorkoutPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}

	//WebElements
	
	By Wrkout_menuitem=By.id("workouts");
	By btnCreateNewWorkout=By.xpath("//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]");

	

}
