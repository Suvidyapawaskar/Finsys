#StyoryType=WEB
#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@Login
Feature: Login Feature

  Background: user access finsys application URL
    When user opens the "ch64" browser
    And user enter the url "http://localhost:90/finsys"
    And user wait for "5" the Login page loaded
    And user maximize the Login page
    And user load Login components

  @SmokeTest
  Scenario Outline: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "<username>" as username
    And user enters "<password>" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top
    And user successfully logout from Finsys application
    And user closes the "ch64" browser
  
  Examples:
  |username|password|
  |dummyfm |passw0rd|
  |dummycfo|passw0rd|
  |dummyrm |passw0rd|