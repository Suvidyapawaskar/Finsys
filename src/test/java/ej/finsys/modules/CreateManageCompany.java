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

public class CreateManageCompany {
	
	@Test
	@Parameters ({"companyname","companytype","subtype","address","phonenumber","email","pandetails","tindetails","mobilenumber","websiteurl","country","state","city","totalemployee"})
	public void createcompany(String CompanyName,String CompanyType,String SubType,String Address,String PhoneNumber,String Email,String PanDetails,String Tindetails,String MobileNumber,String WebsiteURL,String Country,String State,String City,String TotalEmployee) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		if(CompanyName.toLowerCase().startsWith("param_"))
		{
			CompanyName = Generic.getParameterValue("param_companyname");
		    System.out.println("The Company name is:" +CompanyName);
		}
		
		if(CompanyType.toLowerCase().startsWith("param_"))
		{
			CompanyType = Generic.getParameterValue("param_companytype");
			System.out.println("The Company Type is:"+CompanyType);
		}
		
		if(SubType.toLowerCase().startsWith("param_"))
		{
			SubType= Generic.getParameterValue("param_subtype");
			System.out.println("The SubTpe is :"+SubType);
		}
		
		if(Address.toLowerCase().startsWith("param_"))
		{
			Address =Generic.getParameterValue("param_address");
			System.out.println("The Address is :"+Address);
		}
		
		if(PhoneNumber.toLowerCase().startsWith("param_"))
		{
			PhoneNumber = Generic.getParameterValue("param_phonenumber");
			System.out.println("The PhoneNumber is:"+PhoneNumber);
		}
		
		if(Email.toLowerCase().startsWith("param_"))
		{
			Email =Generic.getParameterValue("param_email");
			System.out.println("The Email is:"+Email);
		}
		
		if(PanDetails.toLowerCase().startsWith("param_"))
		{
			PanDetails =Generic.getParameterValue("param_pandetails");
			System.out.println("The PanDetails are:"+PanDetails);
		}
		
		if(Tindetails.toLowerCase().startsWith("param_"))
		{
			Tindetails = Generic.getParameterValue("param_tindetails");
			System.out.println("The Tindetails are:"+Tindetails);
		}
		
		if(MobileNumber.toLowerCase().startsWith("param_"))
		{
			MobileNumber= Generic.getParameterValue("param_mobilenumber");
			System.out.println("The MobileNumber is:" +MobileNumber);
		}
			
		if(WebsiteURL.toLowerCase().startsWith("param_"))
		{
			WebsiteURL = Generic.getParameterValue("param_websiteurl");
			System.out.println("The WebsiteURL is:" +WebsiteURL);
		}
		
		if(Country.toLowerCase().startsWith("param_"))
		{
			Country= Generic.getParameterValue("param_country");
			System.out.println("The Country is:"+Country);
		}
		
		if(State.toLowerCase().startsWith("param_"))
		{
			State= Generic.getParameterValue("param_state");
			System.out.println("The State is:"+State );
			
		}
		
		if(City.toLowerCase().startsWith("param_"))
		{
			City =Generic.getParameterValue("param_city");
			System.out.println("The City is:"+City);
		}
		
		if(TotalEmployee.toLowerCase().startsWith("param_"))
		{
			TotalEmployee= Generic.getParameterValue("param_totalemployee");
			System.out.println("TotalEmployee are:"+TotalEmployee);
		}
		
		
	  	// Login lg = new Login();
	    //lg.ExecuteLogin2("dummycfo","passw0rd", 5000);
		Home home = new Home();
		home.LoadHomePage();
		home.ClickonManageCompany();
	    home.SwitchToFrame();
		Company cp = new Company();
		cp.LoadCompanyPage();
		cp.ClickonNewCompany();
		cp.EnterCompanyName(CompanyName);
		cp.SelectCompanyType(CompanyType);
		cp.EnterAddress(Address);
		cp.EnterPhone(PhoneNumber);
		cp.EnterEmail(Email);
		cp.EnterPanDetails(PanDetails);
		cp.EnterTinDetails(Tindetails);
		cp.EnterMobileNumber(MobileNumber);
		cp.EnterWebSiteURL(WebsiteURL);
		cp.SelectCountry(Country);
		cp.SelectState(State);
		cp.SelectCity(City);
		cp.EnterTotalEmployee(TotalEmployee);
		cp.ClickonSaveManageCompany();
		String actual_com_name=cp.SelectManageCompany("Shri Technology");
		System.out.println("The company is selected :"+actual_com_name);
		String exp_com_name="Shri Technology";
		//String Act_ManCom_Name=cp.VerifyManageCompanyonTopofCompanyList();
		home.SwitchToDefaultfromFrame();
		home.ClickonLogoutLinkOnTheHomePage();
		Assert.assertEquals(actual_com_name, exp_com_name);  
	
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html", 5000);
		
		//Login lg1 = new Login();
		//lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		
		Maximize_LoginPage maxloginpage = new Maximize_LoginPage();
		maxloginpage.MaximizeLoginPage("CH64");
		
		
		CreateManageCompany mc = new CreateManageCompany();
		mc.createcompany("Shriram Technology","IT","Service","Warje Pune","2034343553","shriram@gmail.com", "AROPP1507G", "9405465665", "9904545454","www.SrihariTechnologies.com","INDIA","MAHARASHTRA","PUNE","5000");
		
	}
	
}
