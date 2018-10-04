package ej.finsys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ejagruti_finsys.config.Config;

public class LeaseholdImprovement {
	
	
	   
			
		//declaration of objNewLeaseholdImprovement
		@FindBy(how=How.XPATH,using="//a[@onclick='newItem()']/span/span[1]")
		 WebElement objNewLeaseholdImprovement;
		
		//declaration of select new company for Leasehold Improvement		
		@FindBy(how=How.XPATH,using="//select[@name='companyid']")
		WebElement objCompanynm;
	
		//declaration of Leveling		
		@FindBy(how=How.XPATH,using="//td[.='Leveling']/following-sibling::td/span/input[@placeholder='']")
		WebElement objLeveling;
		
		//declaration of Electric work		
		@FindBy(how=How.XPATH,using="//td[.='Electric work']/following-sibling::td/span/input[@placeholder='']")
		WebElement objElectricwork;
		
		//declaration of Water work		
		@FindBy(how=How.XPATH,using="//input[@name='water_work']/preceding-sibling::input[@placeholder='']")
		WebElement objWaterwork;
		
		
		//declaration of Other
		@FindBy(how=How.XPATH,using="//input[@name='other']/preceding-sibling::input[@placeholder='']")
		WebElement objOther;
		
		//declaration of LeaseholdImprovement Save
		@FindBy(how=How.XPATH,using="//a[@onclick='save1(this)']/span/span[1]")
		WebElement objLeaseholdImprovementSave;
		
		//declaration of verification of saved company with leasehold improvement
		@FindBy(how=How.XPATH,using="//td[@field='name']/div[.='Aahana Technologies']|//span[@class='datagrid-row-expander datagrid-row-expand']")
		WebElement objcmpleaseimp;
		
		//declaration of verification of saved company with id
		@FindBy(how=How.XPATH,using="//input[@name='companyid']")
		WebElement objcmpid;
		
		public void LoadLeaseholdImprovementPage()
		{
			
			PageFactory.initElements(Config.driver, this);
		}
	
		
	

	public void ClickonNewLeaseholdImprovement() throws InterruptedException
	{
		Thread.sleep(5000);
		objNewLeaseholdImprovement.click();
	}
	
	public void SelectCompany(String  Companynm) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s5 = new Select(objCompanynm);
		s5.selectByVisibleText(Companynm);
		System.out.println("SelectCompany is:"+Companynm);
		Thread.sleep(5000);
	}
	
	public void Levelingdetails(String Levelingds) throws InterruptedException
	{
		Thread.sleep(5000);
		objLeveling.sendKeys(Levelingds);
		System.out.println("The Leveling details are:" +Levelingds);
	}
	
	public void Electricworkdetails(String Electricworkds) throws InterruptedException
	{
		Thread.sleep(5000);
		objElectricwork.sendKeys(Electricworkds);
		System.out.println("The Electric work details are:" +Electricworkds);
	}
	
	public void Waterworkdetails(String Waterworkds) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Waterworkdetails");
		objWaterwork.sendKeys(Waterworkds);
		System.out.println("The Water work details are:" +Waterworkds);
	}
	
	
	
	public void Otherdetails(String Otherds) throws InterruptedException
	{
		Thread.sleep(5000);
		objOther.sendKeys(Otherds);
		System.out.println("The Other details are:" +Otherds);
	}
	
	public void ClickonSaveLeaseholdImprovement() throws InterruptedException
	{
		Thread.sleep(5000);
		objLeaseholdImprovementSave.click();
		System.out.println("The Leasehold improvement details are saved successfully");
	}
	
	public boolean VerifyLeaseholdImprovement() throws InterruptedException
	{
		Thread.sleep(5000);
		objcmpleaseimp.click();
		Thread.sleep(5000);
		System.out.println("After saving Leasehold improvement details");
		String CompanyID=objcmpid.getAttribute("value");
		System.out.println("The updated company id is:"+CompanyID);
		/*Thread.sleep(5000);
		String Leveling=objLeveling.getAttribute("value");
		System.out.println("The updated Phone number is:"+Phone1);
		Thread.sleep(5000);
		String Email1=objElectricwork.getAttribute("value");
		System.out.println("The updated Email is:"+Email1 );*/
		
		boolean flag =CompanyID.equalsIgnoreCase("771");
		if (flag)
		{
			System.out.println("The company leasehold details are updated correctly");
		}
		else
		{
			System.out.println("The company leasehold details are not updated correctly");
		}
		
		
		return flag;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	}
	
}
