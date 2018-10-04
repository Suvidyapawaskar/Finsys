package ej.finsys.modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ej.finsys.pages.Home;
import ej.finsys.utility.Generic;
import ej.finsys.utility.LaunchApp;
import ejagruti_finsys.config.Config;

public class Launch {

	@Test
	@Parameters ({"browser","url","timeoutseconds"})
	
	public void ExecuteLaunch(String Browser,String URL,int TimeOutSeconds) throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		if(Browser.toLowerCase().startsWith("param_"))
		{
			Browser=  Generic.getParameterValue("param_browser");
			System.out.println("The Browsername is:" +Browser);
		}
			
		if(URL.toLowerCase().startsWith("param_"))
		{
		    URL = Generic.getParameterValue("param_url");
		    System.out.println("The URL is: "+URL);
		}
		
		/*if(TimeOutSeconds.toLowerCase().startsWith("param_"))
		{
			TimeOutSeconds = Generic.getParameterValue("param_timeoutseconds");
		}*/
		
			
		LaunchApp la = new LaunchApp();
		la.OpenBrowser(Browser);
		la.EnterURL(URL);
		la.WaitTillLoginPageFullyLoaded(TimeOutSeconds);
		Config.driver.manage().window().maximize();
		String Act_Login_Page_Title= Config.driver.findElement(By.xpath("//div[@class='panel-title']")).getText();
		String Exp_Login_Page_Title = "Login to SBDC";
		
		if(Act_Login_Page_Title.equalsIgnoreCase(Exp_Login_Page_Title))
		{
			System.out.println("The Login Page Title is displayed correctly");
			
		}
		
		else
		{
			System.out.println("The Login Page Tile is displayed incorrectly");
			
		}
								
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Launch lc = new Launch();
		lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html",3000);
		
	}
	
	
	
	
	

}
