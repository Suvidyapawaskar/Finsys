package ej.finsys.steps;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import ej.finsys.pages.Home;
import ej.finsys.utility.Close_browser;

public class Home_steps {

	Home hm = new Home();
	
	
	@Then("^user is on the application home page$")
	public void homepageload()
	{
		
		hm.LoadHomePage();
	}
	
	@And("^user gets the message starting with \"Welcome\" on the top$")
	public void verifyhomepage() throws InterruptedException
	{
		
		hm.VeifyHomepage();
	}
    
	@And("^user successfully logout from Finsys application$")
	public void Logoutfinsys() throws InterruptedException
	{
		hm.ClickonLogoutLinkOnTheHomePage();
	}
	
	@And("^user closes the \"(.*)\" browser$")
	public void Closebrowser(String Browsername) throws InterruptedException, IOException
	{
		Close_browser clbr = new Close_browser();
		clbr.closebrowser(Browsername);
	}

}
