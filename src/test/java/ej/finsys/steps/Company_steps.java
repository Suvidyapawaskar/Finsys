package ej.finsys.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ej.finsys.pages.Company;
import ej.finsys.pages.Home;

public class Company_steps {

	
	Home hm = new Home();
	Company cp = new Company();
	
	@Given("^user is on Home page of Finsys application$")
	public void LoadHome()
	{
		
		hm.LoadHomePage();
	}
	
	
	@And("^user loads Company components$")
	public void LoadCompanypage()
	{
		cp.LoadCompanyPage();
	}
	
	
	@When("^user clicks on Manage Company$") 
	public void ClickonManageCompany() throws InterruptedException
	{
		
		hm.ClickonManageCompany();
	}
	
	
	
	@And("^user clicks on New button$")
		
	public void ClickonNew()
	{
		
		cp.LoadCompanyPage();
		cp.ClickonNewCompany();
	}
	
	
	@And("^user enters Company Name as \"(.*)\" $")
	public void EnterCompanyName(String CompanyName) throws InterruptedException
	{
		
		cp.EnterCompanyName(CompanyName);
	}
	
	@And("^user selects Company Type as \"(.*)\" $")
	public void SelectCompanyType(String CompanyType) throws InterruptedException
	{
		
		cp.SelectCompanyType(CompanyType);
	}
	
	
	@And("^user selects Company Subtype as \"(.*)\" $")
	public void SelectCompanySubType(String CompanySubType) throws InterruptedException
	{
		
		cp.SelectCompanyType(CompanySubType);
	}
	
	
	@And("^user enters Address as \"(.*)\"$")
	public void EnterAddress(String Address) throws InterruptedException
	{
		cp.EnterAddress(Address);
		
	}
	
	@And("^user enters Phone number as \"(.*)\"$")
	public void EnterPhoneNumber(String PhoneNumber) throws InterruptedException
	{
		cp.EnterPhone(PhoneNumber);
	}
		
	@And("^user enters Email as \"(.*)\"$")
	public void EnterEmail(String Email) throws InterruptedException
	{
		cp.EnterEmail(Email);	
		
	}
	
	@And("^user enters Pan Details as \"(.*)\"$")
	public void EnterPanDetails(String PanDetails) throws InterruptedException
	{
		
			cp.EnterPanDetails(PanDetails);
		
		}
		
	
	
	
    @And("^user enters Tin Details as \"(.*)\"$")
    public void EnterTinDetails(String TinDetails) throws InterruptedException
    {
    	
		cp.EnterTinDetails(TinDetails);
		
		}
    
    
    
    
    @And("^user enters Mobile as \"(.*)\"$")
    public void EnterMobileNumber(String MobileNumber) throws InterruptedException
    {
    	
			cp.EnterMobileNumber(MobileNumber);
		    	    	
    }
    
    
   @And("^user enters Web Site as \"(.*)\"$")
   
   public void Enterwebsite(String WebsiteURL) throws InterruptedException
   {
	   cp.EnterWebSiteURL(WebsiteURL);
   }
	   
	   
    @And("^user selects Country as \"(.*)\"$")
    public void SelectCountry(String Country) throws InterruptedException
    {
    	cp.SelectCountry(Country);
    }
    
    @And("^user selects State as \"(.*)\"$")
    public void SelectState(String State) throws InterruptedException
    {
    	cp.SelectState(State);
    }
    
    @And("^user selects City as \"(.*)\"$")
    public void SelectCity(String City) throws InterruptedException
    {
    	cp.SelectCity(City);
    }
    
    @And("^user enters Total Employee \"(.*)\"$")
    public void TotalEmployee(String TotalEmployee) throws InterruptedException
    {
    	cp.EnterTotalEmployee(TotalEmployee);
    }
    
    
    @And("^user clicks on Save$")
    public void ClickonSave() throws InterruptedException
    {
    	cp.ClickonSaveManageCompany();
    }
    
    @Then("^verify that company details will be saved successfully$")
    public void Verifyupdatedcompanyds() throws InterruptedException
    {
    	cp.VerifyUpdatedManageCompanyds();
    }
    
    @And("^verify that the created company details displayed on Top of the company table$")
    public void VerifyManageCompanyonToplist() throws InterruptedException
    {
    	cp.VerifyManageCompanyonTopofCompanyList();
    }
    
    
    
	public static void main(String[] args) {
	
		

	}

}
