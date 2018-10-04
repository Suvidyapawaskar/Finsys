#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify LeaseHold Improvement 
  I want to use this template for my feature file

  Background:User is on Home page of finsys application
  When user opens the "chrome" browser
  And user enter the url "http://localhost:90/finsys"
  And user is successfully login into finsys application by using valid login credentials
  And user is on Home page of finsys application
  
  
  @SmokeTest @EndToEnd
  Scenario: Verify that the user able to enter manage leasehold improvement details for the company
    Given user is on Home page of Finsys application
    When user clicks on LeaseHold Improvements 
    Then LeaseHold Improvement tab display in the mid of frame on Home page
    When user clicks on New  
    And user selects Company Name as "Shree Samratha Technologies"
    And user enters Leveling details as "235465464"
    And user enters Electric work as "67686886"
    And user enters Water work as "46576586"
    And user enters Other as "67686746"
    And user clicks on Save
    Then LeaseHold Improvementment details will be saved for the company


@SmokeTest @EndToEnd
  Scenario: Verify that the user able to close manage leasehold improvements window
    Given user is on Home page of Finsys application
    When user clicks on LeaseHold Improvements 
    Then LeaseHold Improvement tab display in the mid of frame on Home page
    When user clicks on New  
    And user clicks on Cancel
    Then manage leasehold improvements window will close

@Smoketest @EndToEnd

 Scenario: Verify that the user able to delete Manage Leasehold Improvements for the selected company

    Given user is on Home page of Finsys application
    When user clicks on LeaseHold Improvements 
    Then LeaseHold Improvement tab display in the mid of frame on Home page
    When user selects the company 
    And user clicks on Destroy  
    Then system throws a message as "Are you sure you want to remove this user?" 
    When user clicks on Ok button in confirm dialogue box
    Then system throws message as "Selected Data Has Been Successfully Deleted!!!"


 
