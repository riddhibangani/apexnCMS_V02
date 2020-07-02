package stepDefinitions;

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
	 driver.findElement(By.id("instructors")).click();
	 Thread.sleep(3000);
	 
//	 if(driver.getPageSource().contains("Duncan"))
//		{
//			System.out.println("Instructor is created successfully");
//			Assert.assertTrue(false);
//		}
//		else{
//			Assert.assertEquals("Duncan", driver.getPageSource().contains("Duncan"));
//			System.out.println("Instructor is created successfully");
//		}
//	 
//	 
//	 if(driver.getPageSource().contains("Duncan")){
//		 System.out.println("Text is present");
//		 }else{
//		 System.out.println("Text is absent");
//		 }
//	 driver.findElement(By.xpath("//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")).click();
//	 driver.findElement(By.id("name")).sendKeys("Test12");
//	 driver.findElement(By.id("bio")).sendKeys("Information about test12");
//	 Thread.sleep(3000);
////	 driver.findElement(By.id("is-archived-input")).click();
//	 
//	 WebElement isArchive = driver.findElement(By.id("is-archived-input"));
//	 WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds
//
//	 wait.until(ExpectedConditions.visibilityOf(isArchive)); //this will wait for elememt to be visible for 20 seconds
//	 isArchive.click(); //now it clicks on element
//	 
//	 driver.findElement(By.xpath("//button[@class='mat-icon-button mat-button-base _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")).click(); 
//	 
//	 
////	 uploadFile.sendKeys("/Users/user/Downloads/1589466155796-1024.png");
//	 
//	 
	 
	 
	 
	 
	
}
}
