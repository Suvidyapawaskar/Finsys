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
    Then Manage Company tab display in the mid of frame on Home page
    When user clicks on New button 
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


 /*@Smoke Test @EndToEnd
  Scenario: Verify that the user not able to create new company by using existing company name
    Given user is on Home page of Finsys application
    When user clicks on Manage Company 
    Then Manage Company tab display in the mid of frame on Home page
    When user clicks on New button
    And user enters Company Name as "Shree Samratha Technologies"
    And user selects Company Type as "IT"
    And user selects Company Subtype as "Consultancy Services"
    And user enters Address as "Pune"
    And user enters Phone number as "2095656565"
    And user enters Email as "shree@gmail.com"
    And user enters Pan Details as "AROPP1509F"
    And user enters Tin Details as "3534543545"
    And user enters Mobile as "9098453094"
    And user enters Web Site as "https://www.shreesamrathatechnologies.com"
    And user selects Country as "INDIA"
    And user selects State as "MAHARASHTRA"
    And user selects City as "PUNE"
    And user enters Total Employee "10000"
    And user clicks on Save 
    Then System will throw an error message as "Company Already Exists.Please Select different Company Name!!!"
  
    
@Smoke Test @EndToEnd
  Scenario: Verify that the user able to create new company by entering all mandatory details
    Given user is on Home page of Finsys application
    When user clicks on Manage Company 
    Then Manage Company tab display in the mid of frame on Home page
    When user clicks on New button 
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
    Then verify that company details will be saved
    And verify that the company details will be saved successfully
    And verify that the created company details displayed on Top of the company table



@Smoketest @EndToEnd

 Scenario: Verify that the user able to delete the selected company

    Given user is on Home page of Finsys application
    When user clicks on Manage Company 
    Then Manage Company tab display in the mid of frame on Home page
    When user selects the company 
    And user clicks on Destroy button
    Then system throws a message as "Are you sure you want to remove this user?" 
    When user clicks on Ok button in confirm dialogue box
    Then system throws message as "Company Has Been Successfully Deleted!!!"
    
@Smoketest 

Scenario: Verify that the user not able to delete the company with Leasehold improvement details

    Given user is on Home page of Finsys application
    When user clicks on Manage Company 
    Then Manage Company tab display in the mid of frame on Home page
    When user selects the company 
    And user clicks on Destroy button
    Then system throws a message as "Are you sure you want to remove this user?" 
    When user clicks on Ok button in confirm dialogue box
    Then system throws an error message as "You Can Not Delete This Company As This Company Has a Cascading Relation with Other Functionalities!!!"   
    

@SmokeTest

Scenario: Verify that the user able to cancel the Company frame

   Given user is on Home page of Finsys application
   When user clicks on Manage Company
   Then Manage Company tab display in the mid of frame on Home page
   When user clicks on Cancel button in Company frame
   Then Company frame will close*/
   
   
   
   
   
   
   
   




 