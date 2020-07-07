Feature: test excel

@excel
    Scenario: Add new instructor
       Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title as "APEX - Login"
    When user click on the main menu
    And select the option as Music categories
    When click on Create a new music category button
    And enter the title
    And click on save button
    Then the new music category is added successfully
    And close the browser
