Feature: test excel

@excel
    Scenario: Add new instructor
        Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
        #When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
        #And clicks on login button sdf
        #Then user can view APEX-Login page
        #When user click on the main menu
        #And select the option as "Instructor"
        #When click on "Create a new instructor" button
        #And enter the name as "Riddhi" and Bio as "Information about Riddhi1"
        #When click on select the file to import
        #And select the correct file
        #And click on "save" button
        #Then the new instructor is added successfully
        #And close the browsersdf
        When user login with username and password with data in excel at "/Users/user/Desktop"

