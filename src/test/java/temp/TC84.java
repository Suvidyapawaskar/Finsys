package temp;

import java.io.IOException;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;

public class TC84 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//TC084 Verify updated details of the Company are properly reflecting on View Company Page
		
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
				
				Home home = new Home();
				home.LoadHomePage();
				home.ClickonManageCompany();
				home.SwitchToFrame();
				
				
				Company cp = new Company();
				cp.LoadCompanyPage();
				cp.ViewManageCompany();
				
				cp.EnterAddress("Banglore");
				cp.EnterPhone("9056565565");
				cp.EnterEmail("suvidya@gmail.com");
				cp.ClickonSaveManageCompany();
				cp.ViewManageCompany();
				cp.VerifyUpdatedManageCompanyds();
				home.SwitchToDefaultfromFrame();
				home.ClickonLogoutLinkOnTheHomePage();
				lp.CloseBrowser("CH64");
	
				
				
				

	}

}
