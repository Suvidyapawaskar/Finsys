package ej.finsys.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ejagruti_finsys.config.Config;



public class LaunchApp {
	
  
	
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
	public static  String EnterURL(String ApplicationURL)
	{
			
		//-----write a code here which will launch the application url on the opened browser
		Config.driver.get(ApplicationURL);
		return "";
	}
	public String WaitTillLoginPageFullyLoaded(int timeOutSeconds) throws InterruptedException 
	{
		//----Write a code here which will wait till login page appears
		
		//Thread.sleep(timeOutSeconds);
		Config.driver.manage().timeouts().pageLoadTimeout(timeOutSeconds, TimeUnit.SECONDS);
		return "Wait till page is successfully loaded";
		
	}
	
	public String MaximizeLoginPage()
	{
		//----Write a code here which will maximize the login page
		
		Config.driver.manage().window().maximize();
		
		return "The Login page is maximize successfully";
	}
	
	public String CloseBrowser(String browserName) throws InterruptedException
	{
		Thread.sleep(5000);
		Config.driver.close();
		return "Browser is successfully closed";
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		//---------------------------suppose user wants to open the browser in Firefox on 32 bit OS
	/*	String op_from_OpenBrowserMethod_for_ff32=LaunchApp.OpenBrowser("FF32");
		String op_from_enterurl_method=LaunchApp.EnterURL("https://www.google.com/");
		String op_from_WaitTillLoginPageFullyLoaded= LaunchApp.WaitTillLoginPageFullyLoaded(30);
		String op_from_maximize_method=LaunchApp.MaximizeLoginPage();*/
										//or
		//---------------------------suppose user wants to open the browser in Internet Explorer on 32 bit OS
	    /*String op_from_OpenBrowserMethod_for_ie32=LaunchApp.OpenBrowser("IE64");
		String op_from_enterurl_method_ie=LaunchApp.EnterURL("http://192.168.0.222:1979/ejagruti/");
		String op_from_WaitTillLoginPageFullyLoaded_ie= LaunchApp.WaitTillLoginPageFullyLoaded(10);
		String op_from_maximize_method_ie=LaunchApp.MaximizeLoginPage();*/		
		
									  //or
		//---------------------------suppose user wants to open the browser in chrome on 64 bit OS
		LaunchApp lp = new LaunchApp();
		lp.OpenBrowser("CH64");
		lp.EnterURL("http://localhost:90/finsys/login.html");
		lp.WaitTillLoginPageFullyLoaded(30);
		lp.MaximizeLoginPage();
		
		
		//-----like wise you can do it for CH32,FF64,IE64
	}

}
