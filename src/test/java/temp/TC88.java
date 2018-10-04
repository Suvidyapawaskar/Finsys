package temp;

import java.io.IOException;

import ej.finsys.pages.Home;
import ej.finsys.pages.LeaseholdImprovement;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.LaunchApp;

public class TC88 {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//TC_088 Verify Creation of a New Leasehold Improvements by passing all Valid Details
		
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
				li.SelectCompany("TCS24(53)");
				li.Levelingdetails("1000");
				li.Electricworkdetails("2000");
				li.Waterworkdetails("3000");
				li.Otherdetails("4000");
				li.ClickonSaveLeaseholdImprovement();
				home.SwitchToDefaultfromFrame();
				home.ClickonLogoutLinkOnTheHomePage();
				lp.CloseBrowser("CH64");

	}

}
