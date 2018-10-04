package ej.finsys.utility;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ejagruti_finsys.config.Config;

public class Maximize_LoginPage {


	@Test
	@Parameters ({"brname"})
	public String MaximizeLoginPage(String browsername)
	{
		//----Write a code here which will maximize the login page
		
		Config.driver.manage().window().maximize();
		
		return "The Login page is maximize successfully";
	}
}
