package ej.finsys.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ej.finsys.utility.LaunchApp;
import ejagruti_finsys.config.Config;


public class Loginpage {

	
	
	//----declaration of user name object
	//@FindBy(xpath="//input[@placeholder='Username']")
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	WebElement ObjUserName =null; 
	
	//----declaration of password object
	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	WebElement objPassword =null;
	
	//----declaration of login button object
	@FindBy(how=How.XPATH,using="//a[@onclick='return ValidateLogin()']")
	WebElement objLoginButton =null;
		

	//----declaration of login error message
	@FindBy(how=How.XPATH,using=".//*[@id='error']")
	WebElement objLoginerror =null;
		
	//----declaration of login error message
	@FindBy(how=How.XPATH,using="//div[@class='panel-title'][.='Login to SBDC']")
	WebElement ObjverifyLoginpg =null;
	
	
	public void LoadLoginPage()
	{
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void VerifyLoginpage()
	{
		ObjverifyLoginpg.click();
		String act_title=ObjverifyLoginpg.getText();
		String exp_title="Login to SBDC";
		if(act_title.equalsIgnoreCase(exp_title))
		{
			System.out.println("The Login page Title is:"+act_title);
		}
	}
	public String EnterUserName(String UserName ) throws InterruptedException 
	{
		Thread.sleep(5000);
		ObjUserName.sendKeys(UserName);
		System.out.println("The UserName is:"+UserName);
		return UserName;
		
	}
	
	public String EnterPassword(String Password) throws InterruptedException
	{
		Thread.sleep(5000);
		objPassword.sendKeys(Password);
		System.out.println("The Password is:"+Password);
		return Password;
	
	}
	public String ClickOnLoginButton()
	{
		objLoginButton.click();
		return "";
		
	}
	
	
	public String WaitTillHomePageFullyLoaded(int TimeOutInSeconds) 
	{
		
		Config.driver.manage().timeouts().pageLoadTimeout(TimeOutInSeconds, TimeUnit.SECONDS);
		return "";
	}
	
	public String errormsg() throws InterruptedException
	{
		Thread.sleep(5000);
		String loginerrormessage= objLoginerror.getText();
		System.out.println("Error message is:"+loginerrormessage);
		return loginerrormessage ;
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
			
		
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
		
		
								
		
	}

}
