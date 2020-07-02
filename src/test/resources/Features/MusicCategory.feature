@musicCategory
Feature: Ability to add and edit music categories
  As an admin user I want to be able to add a new music categoris as well as edit existing music categories

  
  Background: Login successflly to the APEX CMS portal and select Music Category from main menu
  	Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Music categories"
  
   @addMusic
  Scenario: Add new music category
    When click on "Create a new music category" button
    And enter the title as "Metalica"
    And click on save button
    Then the new music category "Metalica" is added successfully
    And close the browser
    
    @addandEditMusic
    Scenario: Add new music category and edit the same
    When click on "Create a new music category" button
    And enter the title as "Metalica"
    And click on save button
    Then the new music category "Metalica" is added successfully
    When click on the new music category created
    And update the title as "Metalica1"
    And click on save button
    Then the music category is updated successfully
    And close the browser
    
    
    @EditMusic
    Scenario: Edit existing music category
    And click on the existing music category
    And update the title as "MusicCategory1"
    And click on save button
    Then the music category is updated successfully
    And close the browser
    
    
    @archiveMusic
    Scenario: Archive existing music category
    And click on the existing music category
    When the archive option is selected
    And click on save button
    Then the music category is archived
    And close the browser
    
    @filterallMusic
    Scenario: Filter the music category to view all the list
    When click on filter option
    And select "All"
    Then the filtered music categories should be visible
    And close the browser
    
    @filteractiveMusic
    Scenario: Filter the music category to view active list
    When click on filter option
    And select "All"
    Then the filtered music categories should be visible
    And close the browser
    
    @filterarchiveMusic
    Scenario: Filter the music category to view archive list
    When click on filter option
    And select "Active"
    Then the filtered music categories should be visible
    And close the browser
    