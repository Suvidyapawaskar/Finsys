package ej.finsys.modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ej.finsys.pages.Home;
import ej.finsys.pages.LeaseholdImprovement;
import ej.finsys.utility.Generic;
import ej.finsys.utility.Maximize_LoginPage;
import ejagruti_finsys.config.Config;

public class CreateLeaseHoldImprovement {

	@Test
	@Parameters ({"companynm","levelingds","electricworkds","waterworkds","otherds"})
	public void Createleadimp(String  Companynm,String Levelingds,String Electricworkds,String Waterworkds,String Otherds) throws InterruptedException, IOException
	{
		
		Thread.sleep(5000);
		if(Companynm.toLowerCase().startsWith("param_"))
		{
			Companynm= Generic.getParameterValue("param_companynm");
			System.out.println("The company selected for LeaseHold Improvement is:"+Companynm);
		}
		
		if(Levelingds.toLowerCase().startsWith("param_"))
		{
			Levelingds= Generic.getParameterValue("param_levelingds");
			System.out.println("The Leveling details are:" +Levelingds);
		}
		
		if(Electricworkds.toLowerCase().startsWith("param_"))
		{
			Electricworkds=Generic.getParameterValue("param_electricworkds");
			System.out.println("The Electric work details are:"+Electricworkds);
		}
		
		if(Waterworkds.toLowerCase().startsWith("param_"))
		{
			Waterworkds=Generic.getParameterValue("param_waterworkds");
			System.out.println("the Water work details are:" +Waterworkds);
		}
		
		if(Otherds.toLowerCase().startsWith("param_"))
		{
			Otherds=Generic.getParameterValue("param_otherds");
			System.out.println("The Other details are: " +Otherds);
		}
		
		//Login lg1 = new Login();
		//lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		Home home = new Home();
		home.LoadHomePage();
		home.SelectLeaseholdImprovement();
		home.SwitchToFrame();
		LeaseholdImprovement li = new LeaseholdImprovement();
		li.LoadLeaseholdImprovementPage();
		li.ClickonNewLeaseholdImprovement();
		li.SelectCompany(Companynm);
		li.Levelingdetails(Levelingds);
		li.Electricworkdetails(Electricworkds);
		li.Waterworkdetails(Waterworkds);
		li.Otherdetails(Otherds);
		li.ClickonSaveLeaseholdImprovement();
		Boolean act_result1=li.VerifyLeaseholdImprovement();
		System.out.println(act_result1);
		Boolean exp_result1=true;
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html",5000);
		
		Login lg1 = new Login();
		lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		
		Maximize_LoginPage maxloginpage = new Maximize_LoginPage();
		maxloginpage.MaximizeLoginPage("CH64");
		
		CreateLeaseHoldImprovement leaseimp = new CreateLeaseHoldImprovement();
		leaseimp.Createleadimp("Aahana Technologies(771)", "1000", "2000","3000","4000");
	}
}
