package temp;

import java.io.IOException;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.LeaseholdImprovement;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;

public class TC86 {

	public static void main(String[] args) throws IOException, InterruptedException {
    
     //TC_086 details Verify of Deletion of a Company whose revenue and expense related information is available
		
	    LaunchApp lp = new LaunchApp();
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
		lp.CloseBrowser("CH64");

	}

}
