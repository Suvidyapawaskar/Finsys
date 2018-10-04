package temp;

import java.io.IOException;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;
import ejagruti_finsys.config.Config;

public class TC83 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Test case83 Verify Creation of a New Company by passing all Valid Details

		
		LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(30);
		lp.MaximizeLoginPage();
				
				
		Loginpage login = new Loginpage();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		login.WaitTillHomePageFullyLoaded(30);
				
		Home home = new Home();
		home.LoadHomePage();
		Thread.sleep(30);
		home.VeifyHomepage();
		//home.ExpandFinancialAnalysisAccordianPane();
		//home.ClickonCompany();
		//home.ExpandCompany();
		home.ClickonManageCompany();
		home.SwitchToFrame();
				
		Company cp = new Company();
		cp.LoadCompanyPage();
		Thread.sleep(3000);
		cp.ClickonNewCompany();
		cp.EnterCompanyName("Aahana Technologies");
		cp.SelectCompanyType("IT");
		cp.SelectSubType("Service");
		Thread.sleep(3000);
		cp.EnterAddress("Pune");
		cp.EnterPhone("2204545459");
		cp.EnterEmail("abc@gmail.com");
		cp.EnterPanDetails("AROPP1507G");
		cp.EnterTinDetails("122334545456890");
		cp.EnterMobileNumber("9970049087");
		cp.EnterWebSiteURL("www.aahanatechnologies.com");
		cp.SelectCountry("INDIA");
		cp.SelectState("MAHARASHTRA");
		cp.SelectCity("PUNE");
		cp.EnterTotalEmployee("50000");
		cp.ClickonSaveManageCompany();
		cp.SelectManageCompany("Aahana Technologies");
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		lp.CloseBrowser("CH64");
				

	}

}
