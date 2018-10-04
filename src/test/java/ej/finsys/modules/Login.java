package ej.finsys.modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.Generic;
import ejagruti_finsys.config.Config;

public class Login {

	@Test 
	@Parameters ({"username","password","timeseconds"})
	
	public void ExecuteLogin(String UserName,String Password,Integer TimeOutInSeconds) throws InterruptedException, IOException
	{
		
		Thread.sleep(5000);
		if(UserName.toLowerCase().startsWith("param_cfo"))
		{
			UserName = Generic.getParameterValue("param_cfo_username");
			System.out.println("Username is :"+UserName);
			
		}
		
		if(UserName.toLowerCase().startsWith("param_fm"))
		{
			UserName = Generic.getParameterValue("param_fm_username");
			System.out.println("UserName is:"+UserName);
		}
		
		if(UserName.toLowerCase().startsWith("param_rm"))
		{
			UserName =Generic.getParameterValue("param_rm_username");
			System.out.println("UserName is:"+UserName);
		}
		
		if(Password.toLowerCase().startsWith("param_"))
		{
			Password= Generic.getParameterValue("param_password");
			System.out.println("Password is:"+Password);
		}
		
		
		
		Loginpage lg = new Loginpage();
		lg.LoadLoginPage();
	    lg.EnterUserName(UserName);
		lg.EnterPassword(Password);
		lg.ClickOnLoginButton();
		lg.WaitTillHomePageFullyLoaded(TimeOutInSeconds);
	
		Home home = new Home();
		home.LoadHomePage();
		home.VeifyHomepage();
		
		String Act_Home_page_Title= Config.driver.findElement(By.xpath("html/body/div[1]/span")).getText();
		
	
	    String Exp_Home_Page_title = "Welcome dummy[CFO]";
		
		if (Act_Home_page_Title.equalsIgnoreCase(Exp_Home_Page_title))
		{
			System.out.println("The Home page Title is displayed correctly");
		}
		else
		{
			System.out.println("The Home page Title is displayed incorrectly");
		}
		
		Assert.assertEquals(Act_Home_page_Title, Exp_Home_Page_title);
		home.ClickonLogoutLinkOnTheHomePage();
					
	}
	
	@Test 
	@Parameters ({"username","password"})
	public void Executeloginwithinvalid(String username,String password) throws InterruptedException, IOException
	{
		
		Thread.sleep(5000);
		if(username.toLowerCase().startsWith("param_itm"))
		{
			
			username = Generic.getParameterValue("param_itm_username");
			System.out.println("The username is :"+username);
		}
		
		if(password.toLowerCase().startsWith("param_"))
		{
			password= Generic.getParameterValue("param_password");
			System.out.println("The password is:"+password);
		}
		
		Loginpage lp = new Loginpage();
		lp.LoadLoginPage();
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		lp.ClickOnLoginButton();
	    String act_login_error= lp.errormsg();
		System.out.println("The login error is:"+act_login_error);
		String exp_login_error= "Please Enter Valid Username or Password!!!";
		Assert.assertEquals(act_login_error, exp_login_error);
		
		
	}
	

	@Test 
	@Parameters ({"username","password","timeseconds"})
	public void ExecuteLogin2(String UserName,String Password,int TimeOutInSeconds) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		if(UserName.toLowerCase().startsWith("param_"))
		{
			UserName=Generic.getParameterValue("param_cfo_username");
		    System.out.println("The UserName is :"+UserName);
		}
		
		if(Password.toLowerCase().startsWith("param_"))
		{
			Password=Generic.getParameterValue("param_password");
			System.out.println("The Password is:" +Password);
		}
		
		Loginpage lg = new Loginpage();
		lg.LoadLoginPage();
	    lg.EnterUserName(UserName);
		lg.EnterPassword(Password);
		lg.ClickOnLoginButton();
		lg.WaitTillHomePageFullyLoaded(TimeOutInSeconds);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html",3000);
		
		Login lg1 = new Login();
		lg1.ExecuteLogin("dummycfo","passw0rd",5000);
		
		
	}
	
}
