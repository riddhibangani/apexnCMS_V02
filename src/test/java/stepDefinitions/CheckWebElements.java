package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckWebElements 

{
	public static void main(String[] args) throws InterruptedException {  
		System.setProperty("webdriver.gecko.driver","/Users/user/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();  
		driver.navigate().to("https://qa.apexcms.waracle.dev/login");  
		driver.manage().window().maximize();  

		driver.findElement(By.id("email")).sendKeys("webmaster@waracle.com");
		driver.findElement(By.id("password")).sendKeys("onw53oUbwb1Ol1");
		driver.findElement(By.id("submit-button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span/mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color' and 1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("music-categories")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("title")).sendKeys("TestAuto");
		driver.findElement(By.id("submit-button")).click();
		
		
		
		
//		driver.FindElement(By.xpath(".//*[text()='Our People'] ”)");
//
//		
//				
//				
//				
//			driver.findElements(By.tagName("mat-card")); // option
//
//		List<WebElement> all = driver.findElements(By.xpath("//mat-card"));
//
//		WebElement filter;
//		Boolean result = true;
//
//		for(int i=0 ; i<all.size();i++)
//		{
//
//			filter = all.get(i);
//
//			if(filter.getAttribute("class").contains("archived"))
//			{	
//				result = true;
//			}
//
//			else
//			{
//				result = false;
//				break;
//			}
//		}
//		
//		if(result==true)
//		{
//			Assert.assertEquals(true, result);
//		}
//		else
//		{
//			Assert.assertEquals(false, result);
//		}
//
//
	}

}
