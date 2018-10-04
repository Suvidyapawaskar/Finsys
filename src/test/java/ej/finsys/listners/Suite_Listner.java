package ej.finsys.listners;

import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;
import org.testng.SuiteRunState;

import com.relevantcodes.extentreports.ExtentReports;

import ej.finsys.result.HTMLReportGenerator;

public class Suite_Listner implements ISuiteListener {

	final static Logger logger=Logger.getLogger(Suite_Listner.class);
	
	public void onStart(ISuite suite) {
		
		String Suitename=suite.getName();
		System.out.println("###Testsuite"+ Suitename +"has started"); 
		logger.info("Testsuite"+ Suitename +"has started");
		String Filepath ="F:\\Finsys\\Result\\Finsysresult9.html";
		
		
		try {
			HTMLReportGenerator.TestSuiteStart(Filepath,Suitename);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}

	public void onFinish(ISuite suite) {
		
		
		String Suitename1 = suite.getName();
		System.out.println("###Testsuite"+  Suitename1  + "is finished");
		logger.info("Testsuite"+  Suitename1  + "is finished");
		try {
			HTMLReportGenerator.TestSuiteEnd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	


}
