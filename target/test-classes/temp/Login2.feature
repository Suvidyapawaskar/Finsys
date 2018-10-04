#StyoryType=WEB
#Owner=Suvidya Pawaskar
#CreationDate=31-7-2018 Tuesday
@Login
Feature: Login Feature

  Background:user access finsys application URL
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
    
   
  @SmokeTest 
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummycfo" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top
    
    
    
    
 