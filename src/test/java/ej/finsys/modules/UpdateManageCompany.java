package ej.finsys.modules;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.utility.Close_browser;
import ej.finsys.utility.Generic;
import ej.finsys.utility.Maximize_LoginPage;

 public class UpdateManageCompany {

	@Test
	@Parameters ({"companyname","address","phonenumber","email","totalemployee"})
	public void updatecompany(String CompanyName,String Address,String Phonenumber,String Email,String TotalEmployee) throws InterruptedException, IOException
	{
		Thread.sleep(5000);	
		if(CompanyName.toLowerCase().startsWith("param_"))
		{
			CompanyName = Generic.getParameterValue("param_companyname_update");
			System.out.println("The CompanyName is:"+CompanyName);
		}
		
		if(Address.toLowerCase().startsWith("param_"))
		{
			Address = Generic.getParameterValue("param_address_update");
			System.out.println("The Address is: "+Address);
		}
		
		if(Phonenumber.toLowerCase().startsWith("param_"))
		{
			Phonenumber=Generic.getParameterValue("param_phonenumber_udate");
			System.out.println("The Phonenumber is: " +Phonenumber );
		}
		
		if(Email.toLowerCase().startsWith("param_"))
		{
			Email = Generic.getParameterValue("param_email_update");
			System.out.println("The Email is:"+Email);
		}
		
		if(TotalEmployee.toLowerCase().startsWith("param_"))
		{
			TotalEmployee=Generic.getParameterValue("param_totalemployee_update");
			System.out.println("TotalEmployee are:"+TotalEmployee);
		}
	    //Login lg = new Login();
		//lg.ExecuteLogin2("dummycfo", "passw0rd", 5000);
		Home home = new Home();
		home.LoadHomePage();
		home.ClickonManageCompany();
	    home.SwitchToFrame();
		Company cp = new Company();
		cp.LoadCompanyPage();
		cp.ViewManageCompany();
		cp.EnterCompanyName(CompanyName);
		cp.EnterAddress(Address);
		cp.EnterPhone(Phonenumber);
		cp.EnterEmail(Email);
		cp.EnterTotalEmployee(TotalEmployee);
		cp.ClickonSaveManageCompany();
		cp.ViewManageCompany();
		Boolean act_result=cp.VerifyUpdatedManageCompanyds();
		System.out.println(act_result);
		Boolean exp_result=true;
		Assert.assertEquals(act_result, exp_result);
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html",5000);
		
		Login lg1 = new Login();
		lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		
		Maximize_LoginPage maxloginpage = new Maximize_LoginPage();
		maxloginpage.MaximizeLoginPage("CH64");
		
		UpdateManageCompany upmanagecp = new UpdateManageCompany();
		upmanagecp.updatecompany("Sairam Technologies","Banglore","9946456546","Suvidya@gmail.com","8000");
	}
	
}
