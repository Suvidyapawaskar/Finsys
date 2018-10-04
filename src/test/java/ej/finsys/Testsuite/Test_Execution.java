package ej.finsys.Testsuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ej.finsys.modules.CreateLeaseHoldImprovement;
import ej.finsys.modules.CreateManageCompany;
import ej.finsys.modules.DeleteManageCompany;
import ej.finsys.modules.Launch;
import ej.finsys.modules.Login;
import ej.finsys.modules.Navigate;
import ej.finsys.modules.UpdateManageCompany;
import ej.finsys.pages.Company;
import ej.finsys.pages.Home;
import ej.finsys.pages.Loginpage;
import ej.finsys.utility.Close_browser;
import ej.finsys.utility.Maximize_LoginPage;
import ejagruti_finsys.config.Config;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test_Execution {
	public String Act_Home_page_Title=null;
	public String Exp_Home_Page_title=null; 
    public String Act_del_msg = null;
    public String Exp_del_msg = null;
	
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }*/
  
 @Test(dataProvider="getdata")
  
  public void LoginFinsys(String username,String password) throws InterruptedException, IOException
  {
	  Thread.sleep(5000);
	  Login lg = new Login();
	  lg.ExecuteLogin(username,password,5000);
	 /* Act_Home_page_Title= Config.driver.findElement(By.xpath("html/body/div[1]/span")).getText();
	  Exp_Home_Page_title = "Welcome dummy[CFO]";
	  Assert.assertEquals(Exp_Home_Page_title, Act_Home_page_Title);*/
	 
	  	  	 
  }
  
 /* @Test(priority =2)
  public void LoginwithFM() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Login lg = new Login();
	  lg.ExecuteLogin("dummyfm", "passw0rd", 5000);
	  Act_Home_page_Title= Config.driver.findElement(By.xpath("html/body/div[1]/span")).getText();
	  Exp_Home_Page_title = "Welcome dummy[FM]";
	  Assert.assertEquals(Exp_Home_Page_title, Act_Home_page_Title);
  }
  
  @Test (priority=3)
  public void LoginwithRM() throws InterruptedException
  
  {
	  Thread.sleep(5000);
	  Login lg = new Login();
	  lg.ExecuteLogin("dummyrm", "passw0rd", 5000);
	  Act_Home_page_Title= Config.driver.findElement(By.xpath("html/body/div[1]/span")).getText();
	  Exp_Home_Page_title = "Welcome dummy[RM]";
	  Assert.assertEquals(Exp_Home_Page_title, Act_Home_page_Title);
  }
  
  @Test (priority=4)
  public void LoginwithITM() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Login lg = new Login();
	  String Act_error_msg=lg.Executeloginwithinvalid("dummyitm","passw0rd");
	  System.out.println("The error message is:"+ Act_error_msg);
	  String Exp_error_msg= "Please Enter Valid Username or Password!!!";
	  Assert.assertEquals(Act_error_msg, Exp_error_msg);
	  
  }
  
 @Test(priority =5)
  public void createManageCompanyTest() throws InterruptedException
  {
	  Thread.sleep(5000);
	 
	  CreateManageCompany cmc = new CreateManageCompany();
	  String Act_mcomp_Name=cmc.Createcompany("Shriram Technology","IT","Service","Warje Pune","2034343553","saiee@gmail.com","AROPP1607G","9807545898","9904545454","www.SaieeTechnology.com","INDIA","MAHARASHTRA","PUNE","2000");
	  
	  String Exp_mcom_name="Shriram Technology";
	  Assert.assertEquals(Act_mcomp_Name, Exp_mcom_name);   
	  
  }

 
 @Test(priority=6)
 public void updatemanagecompany() throws InterruptedException
 {
	  Thread.sleep(5000);
	  UpdateManageCompany upmancom = new UpdateManageCompany();
	  Boolean Act_result1 =upmancom.updatecompany("Banglore","9946456546","Suvidya@gmail.com");
	  Boolean Exp_result1=true;
	  Assert.assertEquals(Act_result1, Exp_result1);
 }
 
 
 @Test(priority=7)
 
 public void deletecompany() throws InterruptedException, IOException
 {
	 Thread.sleep(5000);
	 DeleteManageCompany delmc= new DeleteManageCompany();
	 Act_del_msg=delmc.deletecompany("chair22");
	 Exp_del_msg="Company Has Been Successfully Deleted!!!";
     Assert.assertEquals(Act_del_msg, Exp_del_msg);
	 
 }
 
 @Test(priority=8)

	public void deletecompanywithLI() throws InterruptedException, IOException
	{
	
	Thread.sleep(5000);
	DeleteManageCompany delmc= new DeleteManageCompany();
	Act_del_msg=delmc.deletecompany("DELL2");
    Exp_del_msg="You Can Not Delete This Company As This Company Has a Cascading Relation with Other Functionalities!!!";
	Assert.assertEquals(Act_del_msg, Exp_del_msg);
 
	}
 
 @Test (priority=9)
  public void createleaseholdimp() throws InterruptedException
  {
	  Thread.sleep(5000);
	  CreateLeaseHoldImprovement leaseholdimp = new CreateLeaseHoldImprovement();
	  Boolean Act_result1=leaseholdimp.Createleadimp("Aahana Technologies(771)","1000","2000","3000","4000");
	  Boolean Exp_result1= true;
	  Assert.assertEquals(Act_result1, Exp_result1);
  }*/
    
  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException {
	  Launch lc = new Launch();
	  lc.ExecuteLaunch("CH64", "http://localhost:90/finsys/login.html",3000);
	  
	  Maximize_LoginPage maxlgpg = new Maximize_LoginPage();
	  maxlgpg.MaximizeLoginPage("CH64");
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException, IOException {
	  Thread.sleep(5000);
	    
	  Close_browser clbr = new Close_browser();
	  clbr.closebrowser("CH64");
	  
  }

  @DataProvider
  public Object[][] getdata() {
	  
	  Object[][]data = new Object[4][2];
	  //Login with CFO
	  data[0][0]="dummycfo";
	  data[0][1]="passw0rd";

	  //Login with FM
	  data[1][0]="dummyfm";
	  data[1][1]="passw0rd";
	  
	  //Login with RM
	  data[2][0]="dummyrm";
	  data[2][1]="passw0rd";
	  
	  //Login with ITM
	  data[3][0]="dummyitm";
	  data[3][1]="passw0rd";
	  return data;
   
    
  }
  
 /* @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }*/

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 
	  
	 
  }
 /*@AfterSuite
  public void afterSuite() {
  }*/
  
  
 /* @AfterTest
  public void afterTest() throws InterruptedException {
  
	
  }*/

  @BeforeSuite
  public void beforeSuite() throws IOException, InterruptedException {
	  
	  	  
	  
  }

 

}
