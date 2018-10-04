package ej.finsys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ejagruti_finsys.config.Config;

public class Company {


	//declaration of New Company 
	@FindBy(how=How.XPATH,using="//a[@onclick='newItem()']/*[1]/*")
	WebElement objNewCompany;	
	
	//declaration of Company Name
	@FindBy(how=How.XPATH,using="//input[@name='name']")
	WebElement objCompanyName;
	
	//declaration of Company Type
	@FindBy(how=How.XPATH,using="//select[@id='companytype']")
	WebElement objCompanyType;
	
	//declaration of Company Subtype
	@FindBy(how=How.XPATH,using=".//*[@id='subtype']/select")
	WebElement objCompanySubtype;
	
	//declaration of Address
	@FindBy(how=How.XPATH,using="//td[.='Address']/following-sibling::td/span/textarea[@placeholder='']")
	WebElement objAddress;
	
	//declaration of Phone
	@FindBy(how=How.XPATH,using="//td[.='Phone']/following-sibling::td/span/input[@placeholder='']")
	WebElement objPhone;
	
	//declaration of Email
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement objEmail; 
	
	//declaration of PanDetails
	@FindBy(how=How.XPATH,using="//input[@name='pan']")
	static
	WebElement objPanDetails;
	
	//declaration of TinDetails
	@FindBy(how=How.XPATH,using="//input[@name='tin']")
	static
	WebElement objTinDetails; 
	
	//Declaration of  Mobile
	@FindBy(how=How.XPATH,using="//td[.='Mobile']/following-sibling::td/span/input[@placeholder='']")
	WebElement objMobile; 
	
	//declaration of WebSite
	@FindBy(how=How.XPATH,using="//input[@name='website']")
	WebElement objWebSite; 
	
	//declaration of Country
	@FindBy(how=How.XPATH,using=".//*[@id='countryid']")
	WebElement objCountry; 
	
	//declaration of State
	@FindBy(how=How.XPATH,using=".//*[@id='stateidlist']")
	WebElement objState; 
	
	
	//declaration of City
	@FindBy(how=How.XPATH,using=".//*[@id='citylist']")
	WebElement objCity; 
	
		
	//declaration of Total Employee
	@FindBy(how=How.XPATH,using="//td[.='Total Employee']/following-sibling::td/span/input[@placeholder='']")
	WebElement objTotalEmployee; 
	
	//declaration of Save Manage Company
	@FindBy(how=How.XPATH,using="//a[@onclick='save1(this)']/*[1]/*")
	WebElement objSaveManageCompany;
	
	WebElement objVerifyManageCompany;//declaration of Verify Manage Company
	
	//declaration of View Manage Company
	@FindBy(how=How.XPATH,using=".//*[@id='datagrid-row-r1-1-1']/td/div/span")
	WebElement objViewManageCompany;
	
	//declaration of Select Company
	//@FindBy(how=How.XPATH,using=".//*[@id='datagrid-row-r1-1-1']/td/div/span")
	WebElement objSelectManageCompany;
	
	//declaration of Destroy Company
	@FindBy(how=How.XPATH,using="//a[@onclick='destroyItem()']/span/span[1]")
	WebElement ObjManageCompanyDestroy;
		
	//declaration of verify alert message destroy
	@FindBy(how=How.XPATH,using="//div[@class='panel window messager-window']/div[2]/div[2]")
	WebElement ObjVerifyAlertmessageDestroy;
	
	//declaration of verify alert message destroy
	@FindBy(how=How.XPATH,using="//div[@class='messager-button']/a[1]")
	WebElement objOkDestroy;
	
	
	
	//declaration of alert message destroy for company having Leasehold improvement
	@FindBy(how=How.XPATH,using="//div[@id='result']/h1")
	WebElement objalertmsg;
	
	
	public void LoadCompanyPage()
	{
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ClickonNewCompany() 
	{
		
		objNewCompany.click();
	}
	
	public void EnterCompanyName(String CompanyName) throws InterruptedException 
	{
		Thread.sleep(5000);
		objCompanyName.clear();
		objCompanyName.sendKeys(CompanyName);
		System.out.println("The Company name is:"+CompanyName);
	}
	
	
	public void SelectCompanyType(String CompanyType) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s = new Select(objCompanyType);
		s.selectByVisibleText(CompanyType);
		System.out.println("The Company Type is :"+CompanyType);
		Thread.sleep(3000);
	}
	
	
	
	public void SelectSubType(String CompanySubtype) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s1 = new Select(objCompanySubtype);
		//s1.selectByValue(CompanySubtype);
		s1.selectByVisibleText(CompanySubtype);
		System.out.println("The CompanySubtype is:"+CompanySubtype);
		Thread.sleep(5000);
	
	}
	
	
	
	public String EnterAddress(String Address) throws InterruptedException
	{
		
		Thread.sleep(5000);
		objAddress.clear();
		objAddress.sendKeys(Address);
		System.out.println("The address details are:"+Address);
		return Address;
	}
	
	
	public void EnterPhone(String Phonenumber) throws InterruptedException
	{
		Thread.sleep(5000);
		objPhone.clear();
		objPhone.sendKeys(Phonenumber);
		System.out.println("The Phone number is:"+Phonenumber);
		
	}
	
	
	public void EnterEmail(String Email) throws InterruptedException
	{
		Thread.sleep(5000);
		objEmail.clear();
		objEmail.sendKeys(Email);
		System.out.println("The Email is:"+Email);
	}
	
	
	public String EnterPanDetails(String PanDetails) throws InterruptedException
	{
		Thread.sleep(5000);
		objPanDetails.sendKeys(PanDetails);
		System.out.println("The PanDetails are:"+PanDetails);
		return"";
	}
	
	
	public String EnterTinDetails(String Tindetails) throws InterruptedException
	{
		Thread.sleep(5000);
		objTinDetails.sendKeys(Tindetails);
		System.out.println("The TinDetails are :"+Tindetails);
		return"";
	}
	
	public void EnterMobileNumber(String MobileNumber) throws InterruptedException
	{
		Thread.sleep(5000);
		objMobile.sendKeys(MobileNumber);
		System.out.println("The Mobile Number is:"+MobileNumber);
	}
	
	public void EnterWebSiteURL(String WebsiteURL) throws InterruptedException
	{
		Thread.sleep(5000);
		objWebSite.sendKeys(WebsiteURL);
		System.out.println("The WebSite URL is:"+WebsiteURL);
	}
	
	public void SelectCountry(String Country) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s2 = new Select(objCountry);
		s2.selectByVisibleText(Country);
		System.out.println("The Country is:"+Country);
	}
	public void SelectState(String State) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s3 = new Select(objState);
		s3.selectByValue(State);
		System.out.println("The State is:"+State);
	}
	
	//pune
	public void SelectCity(String City) throws InterruptedException
	{
		Thread.sleep(5000);
		Select s4 =new Select(objCity);
		s4.selectByVisibleText(City);
		System.out.println("The City is:" +City);
	}
	

	
	public void EnterTotalEmployee(String TotalEmployee) throws InterruptedException
	{
		Thread.sleep(5000);
		objTotalEmployee.clear();
		objTotalEmployee.sendKeys(TotalEmployee);
		System.out.println("The TotalEmployee are :"+TotalEmployee );
		
	}
	
	
	
	public void ClickonSaveManageCompany() throws InterruptedException
	{
		Thread.sleep(5000);
		objSaveManageCompany.click();
	}
	
	
	
	public String VerifyManageCompanyonTopofCompanyList() throws InterruptedException
	{
		Thread.sleep(5000);
		String Man_Com_Name=objCompanyName.getAttribute("value");
		return Man_Com_Name;
	}
	
	public void ViewManageCompany() throws InterruptedException
	{
		Thread.sleep(5000);
		//objViewManageCompany = Config.driver.findElement(By.xpath("//td[@field='name']/div[.='"+Cname1+"']"));
		//objViewManageCompany = Config.driver.findElement(By.xpath("//td[@field='name']/div[.='"+Cname1+"']"));
		
		objViewManageCompany.click();	
		
	}
	
	
	public Boolean  VerifyUpdatedManageCompanyds() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("After saving updated Company,Address,Phone number,Email id ,Total Employee details");
		String Companyname1=objCompanyName.getAttribute("value");
		System.out.println("The updated company name is :"+Companyname1);
		Thread.sleep(5000);
		String Address1=objAddress.getAttribute("value");
		System.out.println("The updated Address details are :"+Address1);
		Thread.sleep(5000);
		String Phone1=objPhone.getAttribute("value");
		System.out.println("The updated Phone number is:"+Phone1);
		Thread.sleep(5000);
		String Email1=objEmail.getAttribute("value");
		System.out.println("The updated Email is:"+Email1 );
		Thread.sleep(5000);
		String Total_Employee=objTotalEmployee.getAttribute("value");
		System.out.println("The updated Total Employee are:"+Total_Employee );
		
		boolean flag =Address1.equalsIgnoreCase("Banglore");
		if (flag)
				
		{
			System.out.println("The address is updated correctly");
		}
		else
		{
			System.out.println("The address is not updated");
		}
		
		if(Phone1.equals("9056565565"))
		{
			System.out.println("The phone number is udpated correctly");
		}
		else
		{
			System.out.println("The phone number is not updated");
			
		}
		if(Email1.equals("suvidya@gmail.com"))
		{
			System.out.println("The email is updated correctly");
		}
		else
		{
			System.out.println("The email is not updated");
		}
		return flag;
		
	}
	
	public String SelectManageCompany(String Cname) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Select Manage Company");	
		objSelectManageCompany = Config.driver.findElement(By.xpath("//td[@field='name']/div[.='"+Cname+"']"));
	    objSelectManageCompany.click();
		System.out.println("The manage company is selected:"+Cname);
		return Cname;
		
	}
	
	public void DestroyManageCompany() throws InterruptedException
	{
		Thread.sleep(5000);
		ObjManageCompanyDestroy.click();
	}
	
	public String VerifyDestroyAlertmessage() throws InterruptedException
	{
		Thread.sleep(5000);
		//String Errormsg=Config.driver.switchTo().alert().getText();
		String Errormsg1 = ObjVerifyAlertmessageDestroy.getText();
		//System.out.println(Errormsg);
		System.out.println("Destroy alert message is :"+Errormsg1);
		return Errormsg1;
	}
	
	public void ClickonOKDestroyConfirmationdg() throws InterruptedException
	{
	
		Thread.sleep(5000);
	
		objOkDestroy.click();
	
	}
	
	public void errormsgcpleadimprovement(String act_alertmsg) throws InterruptedException
	{
		Thread.sleep(5000);
		String alertmsg=objalertmsg.getText();
		System.out.println("The error message is:"+alertmsg);
		
	    String exp_alertmsg = "You Can Not Delete This Company As This Company Has a Cascading Relation with Other Functionalities!!!";
		if (act_alertmsg.equals(exp_alertmsg))
		{
			System.out.println("The alert message is displayed correctly");
		}
		else
		{
			System.out.println("The alert message is not displayed correctly");
			
		}
	}
	
	public String deletionmsg() throws InterruptedException
	{
		Thread.sleep(5000);
		String alertmsg=objalertmsg.getText();
		System.out.println("The error message is:"+alertmsg);
		return alertmsg;
		
	}
	
	
}
