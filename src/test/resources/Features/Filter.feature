@filter
Feature: Apply filters on Instructors, Music and Workouts

Background: Initial login for filter scenarios
Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    

  @filterInst
  Scenario Outline: Check filters for Instructors
    When user click on the main menu
    And select the option as Instructor
    #When click on filter option
    And select "<filter>"
    Then the filtered list should be visible for "<filter>"
    And close the browser

    Examples: 
      | filter  |
      | All     |
      | Active  |
      | Archive |

  @filterMusic
  Scenario Outline: Check filters for Instructors
    When user click on the main menu
    And select the option as Music categories
    #When click on filter option
    And select "<filter>"
    Then the filtered list should be visible for "<filter>"
    And close the browser

    Examples: 
      | filter  |
      | All     |
      | Active  |
      | Archive |

  #@filterWorkouts
  #Scenario Outline: Check filters for Instructors
    #Given user is on CMS login page
    #When user enters username as and password
    #And clicks on login button
    #Then user is navigated to home page with page title as "APEX - Login"
    #When user click on the main menu
    #And select the option as Workout
    #When click on filter option
    #And select "<filter>"
    #Then the filtered list should be visible
    #And close the browser
#
    #Examples: 
      #| filter  |
      #| All     |
      #| Active  |
      #| Archive |
