package temp;

import java.io.IOException;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;

public class TC85 {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//TC085 Verify of Deletion of a Recently added Company whose revenue and expense related information is not available
		
		LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(5000);
		lp.MaximizeLoginPage();
		
		Loginpage login= new Loginpage();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		login.WaitTillHomePageFullyLoaded(5000);
		
		Home home = new Home();
		home.LoadHomePage();
		home.VeifyHomepage();
		home.ClickonManageCompany();
		home.SwitchToFrame();
		
		
		Company cp = new Company();
		cp.LoadCompanyPage();
		cp.SelectManageCompany("Saiee Technologies");
		cp.DestroyManageCompany();
		cp.VerifyDestroyAlertmessage();
		cp.ClickonOKDestroyConfirmationdg();
		cp.deletionmsg();
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		lp.CloseBrowser("CH64");

	}

}
