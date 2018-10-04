package ej.finsys.modules;

import ej.finsys.pages.Home;
import ejagruti_finsys.config.Config;

public class Navigate {
	
	public void ExpFinancialAnalysis() throws InterruptedException
	{
		Thread.sleep(5000);
		Home home = new Home();
		home.ExpandFinancialAnalysisAccordianPane();
				
	}
	
	public void ExpCompany()
	{
		Home home= new Home();
		home.ExpandCompany();
	}
	public void ClickonManageCompany() throws InterruptedException
	{
		
		Thread.sleep(5000);
		Home home = new Home();
		home.LoadHomePage();
		home.ClickonManageCompany();
		
	}
	
	public void ClickonCompany() throws InterruptedException
	{
		Thread.sleep(5000);
		Home home = new Home();
		home.LoadHomePage();
		home.ClickonCompany();
	}
	
	public void ClickonLeaseHoldImprovement() throws InterruptedException
	{
		Thread.sleep(5000);
		Home home = new Home();
		home.LoadHomePage();
		home.SelectLeaseholdImprovement();
	}
	
	

	public void SwitchToFrame()
	{
		Config.driver.switchTo().frame(0);
	}
	
	public void SwitchToFrame1()
	{
		Config.driver.switchTo().frame(1);
	}
	
	public void ClickOnLogOut() throws InterruptedException
	{
		Thread.sleep(5000);
		Home home = new Home();
		home.ClickonLogoutLinkOnTheHomePage();
	}
	
	public void CloseBrowser()
	{
		
	}
	
}


