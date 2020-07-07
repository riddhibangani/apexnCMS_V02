@instructor
Feature: Ability to add and edit instructors
  As an admin user I want to be able to add a new instructor as well as edit existing instructors

	Background: Login successflly to the APEX CMS portal and select Instructor from main menu
		Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as Instructor
	

  @addInst
  Scenario: Add new instructor
    When click on Create a new instructor button
    And enter the name as "AutoInst" and Bio as "Information about AutoInst"
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    Then the new instructor "AutoInst" is added successfully
    And close the browser

    
    @addandEditInst
    Scenario: Add new instructor and edit the same
    When click on Create a new instructor button
    And enter the name as "Riddhi" and Bio as "Information about Riddhi1"
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    Then the new instructor "Riddhi" is added successfully
    When click on the new instructor created
    And update the name as "Riddhi1" and Bio as "Information about Riddhi2"
    And click on save button
    Then the instructor is updated successfully
    And close the browser
    
    @EditInst
    Scenario: Edit existing instructor
    And click on the existing instructor
    And update the name as "Name1" and Bio as "Information about Name12"
    And click on save button
    Then the instructor is updated successfully
    And close the browser
    
    @archiveInst
    Scenario: Archive existing instructor
    And click on the existing instructor
    When the archive option is selected
    And click on save button
    Then the instructor is archived
    And close the browser
    
    @filterall
    Scenario: Filter the instructor to view all the list
    When click on filter option
    And select "All"
    Then the filtered instructors should be visible
    And close the browser
    
    @filterarchive
    Scenario: Filter the instructor to view active list
    When click on filter option
    And select "Archive"
    #Then the filtered instructors should be visible
    #And close the browser
    
    @filteractive
    Scenario: Filter the instructor ro view archive list
    When click on filter option
    And select "Active"
    Then the filtered instructors should be visible
    And close the browser
    
    
     