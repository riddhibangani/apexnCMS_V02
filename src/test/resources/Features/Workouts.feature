@workouts
Feature: Ability to add and edit Workouts
  As an admin user I want to be able to add a new Workouts as well as edit existing Workouts

  
   @addworkouts
  Scenario: Add new workout
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    When click on "Create a new workout" button
    And enter all the mandatory data
    When select Genre
    And select Level
    When specify if the user shoud use weights 
    When select Music category and instructor
    When click on select the file to import
    And click on save button
    Then the new workout is added successfully
    And close the browser
    
     @addworkoutssplits
  Scenario: Add new workout with splits
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    When click on "Create a new workout" button
    And enter all the mandatory data
    When select Genre
    And select Level
    When specify if the user shoud use weights 
    When select Music category and instructor
    When click on select the file to import
    When click on add splits
    And select New split
    When enter all the mandatory data for new split
    And click on segments
    When enter all the mandatory data for segment
    And click on save button
    Then the new workout is added successfully
    And close the browser
    
    @editWorkout
    Scenario: Edit existing workout
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    And click on the existing workout
    And update the mandatory details
    And click on save button
    Then the workout is updated successfully
    And close the browser
    
    @editWorkoutSplit
    Scenario: Edit existing workout
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    And click on the existing workout
    And update the split details
    And click on save button
    Then the workout is updated successfully
    And close the browser
    
    
    @filterallWorkout
    Scenario: Filter the Workout to view all the list
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    When click on filter option
    And select "All"
    Then the filtered workout should be visible
    And close the browser
    
    @filteractiveWorkout
    Scenario: Filter the Workout to view active list
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
   And select the option as "Workouts"
    When click on filter option
    And select "Active"
    Then the filtered workout should be visible
    And close the browser
    
    @filterarchiveWorkouts
    Scenario: Filter the Workout to view archive list
    Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as "Workouts"
    When click on filter option
    And select "Archive"
    Then the filtered workout should be visible
    And close the browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    