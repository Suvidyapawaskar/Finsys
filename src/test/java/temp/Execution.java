package temp;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.LeaseholdImprovement;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;
import ejagruti_finsys.config.Config;

public class Execution {
	
	public void LoadLoginPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Test case83 Verify Creation of a New Company by passing all Valid Details

		
		/*LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(30);
		lp.MaximizeLoginPage();
		
		
		Login login = new Login();
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
		cp.EnterPhone("0204545459");
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
		lp.CloseBrowser("CH64");*/
		
		
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
		System.out.println("User is succesfully login into finsys applcation by using RM role credentials");
		
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
		System.out.println(login.errormsg());
		
		
		//TC084 Verify updated details of the Company are properly reflecting on View Company Page
		
		/*LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(3000);
		lp.MaximizeLoginPage();
		
		Login login = new Login();
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
		lp.CloseBrowser("CH64");*/
		
		//TC085 Verify of Deletion of a Recently added Company whose revenue and expense related information is not available
		
		/*LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(5000);
		lp.MaximizeLoginPage();
		
		Login login= new Login();
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
		cp.SelectManageCompany("Finix");
		cp.DestroyManageCompany();
		cp.VerifyDestroyAlertmessage();
		cp.ClickonOKDestroyConfirmationdg();
		cp.deletionmsg();
		lp.CloseBrowser("CH64");*/
		
		
		
		
		//TC_088 Verify Creation of a New Leasehold Improvements by passing all Valid Details
		
		/*LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(5000);
		lp.MaximizeLoginPage();
				
		Login login = new Login();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		login.WaitTillHomePageFullyLoaded(5000);
				
		Home home = new Home();
		home.LoadHomePage();
		home.SelectLeaseholdImprovement();
		home.SwitchToFrame();
				
		LeaseholdImprovement li = new LeaseholdImprovement();
		li.LoadLeaseholdImprovementPage();
		li.ClickonNewLeaseholdImprovement();
		li.SelectCompany("TCS24(23)");
		li.Levelingdetails("1000");
		li.Electricworkdetails("2000");
		li.Waterworkdetails("3000");
		li.Otherdetails("4000");
		li.ClickonSaveLeaseholdImprovement();*/

		
		//TC_086 details Verify of Deletion of a Company whose revenue and expense related information is available
		
	    /*LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(5000);
		lp.MaximizeLoginPage();
		
		Loginpage login = new Loginpage();
		login.LoadLoginPage();
		login.EnterUserName("dummycfo");
		login.EnterPassword("passw0rd");
		login.ClickOnLoginButton();
		login.WaitTillHomePageFullyLoaded(5000);
		
		Home home = new Home();
		home.LoadHomePage();
		home.SelectLeaseholdImprovement();
		home.SwitchToFrame();
		
		LeaseholdImprovement li = new LeaseholdImprovement();
		li.LoadLeaseholdImprovementPage();
		li.ClickonNewLeaseholdImprovement();
		li.SelectCompany("Avion Technologies(763)");
		li.Levelingdetails("1000");
		li.Electricworkdetails("2000");
		li.Waterworkdetails("3000");
		li.Otherdetails("4000");
		li.ClickonSaveLeaseholdImprovement();
		
		home.SwitchToDefaultfromFrame();
		home.ClickonManageCompany();
		home.SwitchToFrame1();
		
		Company cp = new Company();
		cp.LoadCompanyPage();
		cp.SelectManageCompany("Avion Technologies");
		cp.DestroyManageCompany();
		cp.VerifyDestroyAlertmessage();
		cp.ClickonOKDestroyConfirmationdg();
		cp.errormsgcpleadimprovement("You Can Not Delete This Company As This Company Has a Cascading Relation with Other Functionalities!!!");	
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		lp.CloseBrowser("CH64");*/
		
		//TC087 Export all the cities for all the states to excel file and validate the exported data with database
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
