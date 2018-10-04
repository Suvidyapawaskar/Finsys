package ej.finsys.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ej.finsys.pages.Loginpage;


public class Login_steps {

	Loginpage lg = new Loginpage();
	
	@Given("^user is on the application login page$")
	public void VerifyLoginpage()
	{
		lg.VerifyLoginpage();
	}
	
    @And("^user load Login components$")
	public void LoadLoginPage()
	{
    	
		lg.LoadLoginPage();
	}
    
	@When("^user enters \"(.*)\" as username$")
	public void EnterUsername(String UserName) throws InterruptedException
	{
		
		lg.EnterUserName(UserName);
	}
	
	
    @And("^user enters \"(.*)\" as password$")
    public void EnterPassword(String Password) throws InterruptedException
    {
    	lg.EnterPassword(Password);
    }
    
    
	@And("^user clicks on login button$")
	public void ClickonLoginbutton()
	{
		lg.ClickOnLoginButton();
	}
	
   
	@Then("^user is on the same login page$")
	public void VerifyLoginpagetitle()
	{
		lg.VerifyLoginpage();
	}
	
	
	@And("^user gets the message \"Please Enter Valid Username or Password!!!\" on login page$")
	public void Verifyloginerrormg() throws InterruptedException
	{
		lg.errormsg();
		
	}
	
	public static void main(String[] args) {
		
		

	}

}
