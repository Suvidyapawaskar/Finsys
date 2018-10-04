#StyoryType=WEB
#Owner=Suvidya Pawaskar
#CreationDate=31-7-2018 Tuesday
@Login
Feature: Login Feature

  Background: user access finsys application URL
    When user opens the "ch64" browser
    And user enter the url "http://localhost:90/finsys"
    And user wait for "5" the Login page loaded
    And user maximize the Login page
    And user load Login components

  @SmokeTest
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top
    And user successfully logout from Finsys application
    And user closes the "ch64" browser
   

  @SmokeTest
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummycfo" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top
    And user successfully logout from Finsys application
    And user closes the "ch64" browser

  @SmokeTest
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummyrm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top
    And user successfully logout from Finsys application
    And user closes the "ch64" browser

  @SmokeTest
  Scenario: Login Functionality for valid username and invalid password
    Given user is on the application login page
    When user enters "dummyfm" as username
    And user enters "Password" as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
    

  @SmokeTest
  Scenario: Login Functionality for invalid username and valid password
    Given user is on the application login page
    When user enters "dummy" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
    

  @SmokeTest
  Scenario: Login Functionality for blank username and  password
    Given user is on the application login page
    When user enters " " as username
    And user enters " " as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
    
    
  @SmokeTest
  Scenario: Login Functionality for blank username and valid password
    Given user is on the application login page
    When user enters " " as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
   

  @SmokeTest
  Scenario: Login Functionality for valid username and blank password
    Given user is on the application login page
    When user enters "dummycfo" as username
    And user enters " " as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
    

  @SmokeTest
  Scenario: Login Functionality by passing special characters in username and invalid password
    Given user is on the application login page
    When user enters "@$#%$%&" as username
    And user enters "password" as password
    And user clicks on login button
    Then user is on the same login page
    And user gets the message "Please Enter Valid Username or Password!!!" on login page
    And user closes the "ch64" browser
   
