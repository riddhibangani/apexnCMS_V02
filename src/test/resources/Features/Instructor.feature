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
    #And enter the name as "AutoInst12" and Bio as "Information about AutoInst"
    And enter name and bio
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    #Then the new instructor "AutoInst12" is added successfully
    Then the new instructor is added successfully
    And close the browser

  @addandEditInst
  Scenario: Add new instructor and edit the same
    When click on Create a new instructor button
    And enter name and bio
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    Then the new instructor is added successfully
    When click on the new instructor created
    And update name and bio
    And click on save button
    Then the instructor is updated successfully
    And close the browser

  @EditInst
  Scenario: Edit existing instructor
    And click on the existing instructor
    And update name and bio
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
