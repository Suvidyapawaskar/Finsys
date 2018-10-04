package ej.finsys.modules;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.utility.Close_browser;
import ej.finsys.utility.Generic;

public class DeleteManageCompany {

	
	@Test
	@Parameters ({"companyname"})
	public void deletecompany(String companyname) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		if(companyname.toLowerCase().startsWith("param_"))
		{
			companyname = Generic.getParameterValue("param_comnm");
			System.out.println("The Company selected for deletion:"+companyname);
		}
		//Launch lc = new Launch();
		//lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html", 5000);
		// lg = new Login();
		//lg.ExecuteLogin2("dummycfo","passw0rd",5000);
		Home home = new Home();
		home.LoadHomePage();
		home.ClickonManageCompany();
		home.SwitchToFrame();
		Company cp = new Company();
		cp.LoadCompanyPage();
		cp.SelectManageCompany(companyname);
		cp.DestroyManageCompany();
		cp.VerifyDestroyAlertmessage();
		cp.ClickonOKDestroyConfirmationdg();
		String act_delmsg= cp.deletionmsg();
		if(act_delmsg.equalsIgnoreCase("Company Has Been Successfully Deleted!!!"))
		{
			System.out.println("The message is displayed as :" +act_delmsg);
		}
		else
		{
			System.out.println("The error message is displayed as :You Can Not Delete This Company As This Company Has a Cascading Relation with Other Functionalities!!!");
		}
		String exp_delmsg= "Company Has Been Successfully Deleted!!!";
		Assert.assertEquals(act_delmsg, exp_delmsg);
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
			
					
	}
	   
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html", 5000);
		
		Login lg1 = new Login();
		lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		
		DeleteManageCompany delmcom = new DeleteManageCompany();
		delmcom.deletecompany("chair23");
				
		
	}*/
	
}
