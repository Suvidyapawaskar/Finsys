package temp;

import java.io.IOException;

import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;

public class TC82 {
	
	/*LaunchApp lp = new LaunchApp();
	Loginpage login = new Loginpage();
	Home home = new Home();
	
	public void LoginwithCFO() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		//LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
				
		//Loginpage login = new Loginpage();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using CFO role credentials");
				
		//Home home = new Home();
		home.LoadHomePage();
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
	}
	
	public void LoginwithFM() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
				
			
		login.EnterUserName("dummyfm");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using FM role credentials");
				
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
		
	}
	
	public void LoginwithRM() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
		
		login.EnterUserName("dummyrm");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using RM role credentials");
				
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
	}*/

	public static void main(String[] args) throws IOException, InterruptedException {
		//Tc082 Verify Authentication process of a finsys user having role of either CFO/FM/COH/RM/ITM/ABM

		LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
				
		Loginpage login = new Loginpage();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using CFO role credentials");
				
		Home home = new Home();
		home.LoadHomePage();
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
				
		//Verify Authentication process of a finsys user having role FM
			
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
				
			
		login.EnterUserName("dummyfm");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using FM role credentials");
				
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
				
				
				
				
		//Verify Authentication process of a finsys user having role rm
				
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
		
		login.EnterUserName("dummyrm");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		System.out.println("User is succesfully login into finsys application by using RM role credentials");
				
		home.VeifyHomepage();
		home.ClickonLogoutLinkOnTheHomePage();
		//lp.CloseBrowser("CH64");
				
		//Verify Authentication process of a finsys user having role itm
				
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
						
		login.EnterUserName("dummyitm");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
						
		System.out.println("Invalid credentials of role itm");
		login.errormsg();
		lp.CloseBrowser("CH64");

	}

}
