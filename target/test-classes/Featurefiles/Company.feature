#StyoryType1=WEB
#Owner=Suvidya Pawaskar
#CreationDate=31-7-2018 Tuesday
@Company
Feature: Create company Feature

  Background:User is on Home page of finsys application
  When user opens the "chrome" browser
  And user enter the url "http://localhost:90/finsys"
  And user enters "dummyfm" as username
  And user enters "passw0rd" as password
  And user clicks on login button
  Then user is on the application home page
  And user gets the message starting with "Welcome" on the top
  And user loads Company components
   
  
  @SmokeTest 
  Scenario: Verify that the user able to create new company by entering valid details
    Given user is on Home page of Finsys application
    When user clicks on Manage Company 
    And user clicks on New button 
    And user enters Company Name as "Shree Samratha Technologies"
    And user selects Company Type as "IT"
    And user selects Company Subtype as "Service"
    And user enters Address as "Warje Pune"
    And user enters Phone number as "2043435343"
    And user enters Email as "shree@gmail.com"
    And user enters Pan Details as "AROPP1507G"
    And user enters Tin Details as "3534543545"
    And user enters Mobile as "9098453094"
    And user enters Web Site as "https://www.shreesamrathatechnologies.com"
    And user selects Country as "INDIA"
    And user selects State as "MAHARASHTRA"
    And user selects City as "PUNE"
    And user enters Total Employee "10000"
    And user clicks on Save 
    Then verify that company details will be saved successfully
    And verify that the created company details displayed on Top of the company table


  