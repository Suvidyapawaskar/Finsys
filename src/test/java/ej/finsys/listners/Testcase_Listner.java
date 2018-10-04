package ej.finsys.listners;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

import ej.finsys.result.HTMLReportGenerator;
import ej.finsys.utility.Generic;
import ejagruti_finsys.config.Config;

public class Testcase_Listner implements ITestListener {

	final static Logger logger=Logger.getLogger(Testcase_Listner.class);
	
	
	public void onTestStart(ITestResult result) {
	
			
		System.out.println("###I am in onTestStart Testcase Listner");
				
		Object[] al= result.getParameters();
		
        for(int i=0;i<al.length ;i++)
        {
        	String value = al[i].toString();
        	System.out.println("The parameter name in TestNG file is:"+value);
        	try {
				String parameter_value=Generic.getParameterValue(value);
				System.out.println("The parameter value in parameters.properties file is:"+parameter_value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       	
        	
        }
        /*try {
			throw new Exception("Exception is skipped");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	}

	public void onTestSuccess(ITestResult result) {
		
		String val=null;
		System.out.println("###I am in onTestSuccess Testcase Listner");
		if(result.getStatus()==result.SUCCESS)
		{
			String Testcasenm =result.getTestName();
			String Status = "pass";
			String Stepname = result.getName();
			Object[] sp=result.getParameters();
						
			for(int i=0;i<sp.length;i++)
			{
				val=sp[i].toString();
				System.out.println("***The parameter value is:"+val);
			}
			
			
			String StepDetails =val;
			String objectImagePath ="F:\\Finsys\\Result";
			HTMLReportGenerator.StepDetails(Status, Stepname, StepDetails,objectImagePath);
			
			System.out.println("###Testcase"+Testcasenm+"is passed");
			System.out.println("###Stepname"+Stepname+" is passed");
			logger.info("Testcase Testcasenm is passed:" +Testcasenm);
					
		}
		   
		}
		
	public void onTestFailure(ITestResult result) {
		System.out.println("I am in onTestFailure Testcase Listner");
		String Testname2= result.getName();
		if(result.getStatus()==result.FAILURE)
		{
		
		String Status = "fail";
		String Stepname = result.getName();
		String StepDetails = result.getName();
		String objectImagePath ="F:\\Finsys\\Result\\img1.png";
		HTMLReportGenerator.StepDetails(Status, Stepname, StepDetails, objectImagePath);
		System.out.println("Testcase Testname is failed for test case:"+Testname2);
		logger.info("Testcase Testname is failed for test case:"+Testname2);
		logger.error("Testcase Testname is failed for test case:"+Testname2);
		TakesScreenshot ts = (TakesScreenshot) Config.driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.CopyFile(source,new File("F:\\Workspace_MM\\finsys\\Screenshots\\fail1.jpg"));
		System.out.println("Screenshot taken");
		
		
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("I am in onTestSkipped Testcase Listner");
		if(result.getStatus()==result.SKIP)
		{
			String Testcasename= result.getTestName();
			String Stepnm =result.getName();
			System.out.println("Test case"+Testcasename+"is skipped");
			System.out.println("Step name"+Stepnm+"is skipped");
			logger.info("I am in onTestSkipped Testcase Listner");
		}
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in onTestFailedButWithinSuccessPercentage Testcase Listner");
		logger.info("I am in onTestFailedButWithinSuccessPercentage Testcase Listner");
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("I am in onStart Testcase Listner");
		String Testcasename = context.getName();
		String Description = context.getName();
		        		
		/*if(Testcasename.equals("TC_082_Verify Authentication process of a finsys user having role of FM"))
		{
			throw new SkipException("Skipping/ignoring test not ready");
		}*/
		
		System.out.println("###Testcase execution is started for test case:"+Testcasename);
		logger.info("Testcase execution is started for test case:"+Testcasename);
		HTMLReportGenerator.TestCaseStart(Testcasename, Description);
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("I am in onFinish Testcase Listner");
		String Testcasename1 = context.getName();
		System.out.println("###Testcase execution is finished for test case:"+Testcasename1);
		logger.info("Testcase execution is finished for test case:"+Testcasename1);
		
		
	    
	}

	

}
