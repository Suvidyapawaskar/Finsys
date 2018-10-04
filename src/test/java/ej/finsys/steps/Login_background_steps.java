package ej.finsys.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ejagruti_finsys.config.Config;

public class Login_background_steps {

	@When("^user opens the \"(.*)\" browser$")
	public String OpenBrowser(String browserName) throws IOException
	{
		//String output_message=null;
		if(browserName.equalsIgnoreCase("ff32"))
		{
			System.setProperty("webdriver.gecko.driver",Config.getParameterValue("firefox_driver_exe_path_32bit"));
			Config.driver=new FirefoxDriver();
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("firefox_driver_exe_path_32bit"));

		}
		if(browserName.equalsIgnoreCase("ch32"))
		{
			System.setProperty("webdriver.chrome.driver",Config.getParameterValue("chrome_driver_exe_path_32bit"));
			Config.driver=new ChromeDriver();
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("chrome_driver_exe_path_32bit"));

		}
		if(browserName.equalsIgnoreCase("ie32"))
		{
			System.setProperty("webdriver.ie.driver",Config.getParameterValue("ie_driver_exe_path_32bit"));
			Config.driver=new InternetExplorerDriver();
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("ie_driver_exe_path_32bit"));

		}
		if(browserName.equalsIgnoreCase("ff64"))
		{
			System.setProperty("webdriver.gecko.driver",Config.getParameterValue("firefox_driver_exe_path_64bit"));
			Config.driver=new FirefoxDriver();
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("firefox_driver_exe_path_64bit"));
		

		}
		if(browserName.equalsIgnoreCase("ch64"))
		{
			System.setProperty("webdriver.chrome.driver",Config.getParameterValue("chrome_driver_exe_path_64bit"));
			Config.driver=new ChromeDriver();
			Config.wait = new WebDriverWait(Config.driver,2);
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("chrome_driver_exe_path_64bit"));
			
		}
		if(browserName.equalsIgnoreCase("ie64"))
		{
			System.setProperty("webdriver.ie.driver",Config.getParameterValue("ie_driver_exe_path_64bit"));
			Config.driver=new InternetExplorerDriver();
			System.out.println("Browser Successfully Open.BrowserName:"+browserName+",WebDriver Exe Path:"+Config.getParameterValue("ie_driver_exe_path_64bit"));
		}
		return "";
		
	}
	
	@And("^user enter the url \"(.*)\"$")
	public static  String EnterURL(String ApplicationURL)
	{
			
		//-----write a code here which will launch the application url on the opened browser
		Config.driver.get("http://localhost:90/finsys");
		return "";
	}
	
	
	@And ("^user wait for \"(.*)\" the Login page loaded$")
	public String WaitTillLoginPageFullyLoaded(int timeOutSeconds) throws InterruptedException 
	{
		//----Write a code here which will wait till login page appears
		
		//Thread.sleep(timeOutSeconds);
		Config.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		return "Wait till page is successfully loaded";
		
	}
	
	@And("^user maximize the Login page$")
	public String MaximizeLoginPage()
	{
		//----Write a code here which will maximize the login page
		
		Config.driver.manage().window().maximize();
		
		return "The Login page is maximize successfully";
	}
	
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Login_background_steps ls = new Login_background_steps();
		ls.OpenBrowser("ch64");
		ls.EnterURL("http://localhost:90/finsys/login.html");
		ls.WaitTillLoginPageFullyLoaded(5000);
		ls.MaximizeLoginPage();
		Loginpage lg = new Loginpage();
		lg.LoadLoginPage();
	    lg.EnterUserName("dummyfm");
		lg.EnterPassword("passw0rd");
		lg.ClickOnLoginButton();
		lg.WaitTillHomePageFullyLoaded(5000);
		/*Home hm = new Home();
		Thread.sleep(5000);
		hm.LoadHomePage();
		hm.ClickonLogoutLinkOnTheHomePage();
		/*lg.EnterUserName("dummyfm");
		lg.EnterPassword("password");
		lg.ClickOnLoginButton();
		lg.errormsg();*/
		


	}
	
	

}
