package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterSteps extends BaseClass{
	
	
	
	@When("^click on filter option$")
    public void click_on_filter_option() throws Throwable 
    {
		pageobjectmanager.getfp().clickonFilter();
    }
 
 @And("^select \"([^\"]*)\"$")
    public void select_something(String filter) throws InterruptedException 
    {
		if(filter.equals("All"))
		{
			
			pageobjectmanager.getfp().listoffilterdelements();
			pageobjectmanager.getfp().selectAll();
			System.out.println("Selected all");
		}
		else if(filter.equals("Archive"))
		{
			pageobjectmanager.getfp().selectArchive();
			System.out.println("Selected archive");
		}
		else
		{
			pageobjectmanager.getfp().selectActive();
			System.out.println("Selected active");
		}
    }
 
 @Then("^the filtered list should be visible for \"([^\"]*)\"$")
 public void the_filtered_list_should_be_visible_for_something(String filter) 
    {
	 if(filter.equals("All"))
	 {
		 
		 pageobjectmanager.getfp().checkFilterforAll(filter);
	 }
	 
	 pageobjectmanager.getfp().checkfilteredElement(filter);
	 
	 
    }

}
