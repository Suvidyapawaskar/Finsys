package ej.finsys.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ejagruti_finsys.config.Config;


public class Home {


	//declaration of veify homepage
	@FindBy(how=How.XPATH,using="html/body/div[1]/span")
	WebElement objHomepageTitle;
	
	
	
	//declaration of AccordionPane 
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Financial Analysis')] /following-sibling::div/a[@class='accordion-collapse accordion-expand']")
	WebElement objAccordionPane;
	
	//declaration of Company 
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Company')]")
	WebElement ObjCompany;
	
	//declaration of Expand Company 
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Company')]/preceding-sibling ::span[@class='tree-hit tree-collapsed']")
	WebElement objExpandCompany ;
	
	//declaration of Manage Company
	@FindBy(how=How.XPATH,using="//a[@title='Manage Company']")
	WebElement objManageCompany;
	
	//declaration of Logout
	
	@FindBy(how=How.XPATH,using="//a[.='LOGOUT']")
	WebElement objLogout;
	
	//declaration of select Leasehold Improvement
	@FindBy(how=How.XPATH,using="//a[@title='Leasehold Improvements']")
	WebElement objLeaseholdImprovement;
	
	
	//declaration of Switch To frame
	
	public void SwitchToFrame() throws InterruptedException
	{
		Thread.sleep(5000);
		Config.driver.switchTo().frame(0);
	}
	
	public void SwitchToFrame1() throws InterruptedException
	{
		Thread.sleep(5000);
		Config.driver.switchTo().frame(1);
	}
	
	//declaration of Switch to default from frame
	public void SwitchToDefaultfromFrame() throws InterruptedException
	{
		Thread.sleep(5000);
		Config.driver.switchTo().defaultContent();
	}
	
	public void LoadHomePage()
	{
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ClickonCompany ()
	
	{
		ObjCompany.click();
		
	}
	
	public void ExpandCompany ()
	{
		objExpandCompany.click();
		
	}
	
	public void ClickonManageCompany () throws InterruptedException
	{
		Thread.sleep(5000);
		objManageCompany.click();
		
	}
	public void ExpandFinancialAnalysisAccordianPane()
	{
		objAccordionPane.click();
		
	}
	
	public String VeifyHomepage() throws InterruptedException
	{
		Thread.sleep(5000);
		String Title =objHomepageTitle.getText();
		System.out.println("The Home page title is:"+Title);
		return Title;
		
	}
	
	public void ClickonLogoutLinkOnTheHomePage() throws InterruptedException
	{
		Thread.sleep(5000);
		objLogout.click();
		System.out.println("User is successfully logout from finsys application");
	}
	
	public void SelectLeaseholdImprovement() throws InterruptedException
	{
		Thread.sleep(5000);
		objLeaseholdImprovement.click();
		System.out.println("Enter details of Leasehold Improvement for manage company ");
	}
	
	

}
