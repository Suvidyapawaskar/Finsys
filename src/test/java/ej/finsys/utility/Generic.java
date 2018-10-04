package ej.finsys.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Generic {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;	
	
	public String parameterget(String parametername) throws IOException
	{
		InputStream input = null;
		Properties prop = new Properties();
		
		input=getClass().getClassLoader().getResourceAsStream("parameters.properties");
		prop.load(input);
		
		String parameterValue=prop.getProperty(parametername);
		
		return parameterValue;
		}
	
public static String getParameterValue(String parametername) throws IOException
	
	{
		Generic gl = new Generic();
		return gl.parameterget(parametername);
		
	}

public static String getParameterValueTestng(String paramname) throws IOException
{
	Generic gl = new Generic();
	return gl.parametergettestng(paramname);
	
}
public String parametergettestng(String parameternm) throws IOException
{
	InputStream input = null;
	Properties prop = new Properties();
	
	input=getClass().getClassLoader().getResourceAsStream("testng3.xml");
	prop.load(input);
	
	String parameterValue=prop.getProperty(parameternm);
	
	return parameterValue;
	}
	
public static void main(String[] args) throws IOException {
	

	String param_username_val= Generic.getParameterValue("param_username");
	System.out.println(param_username_val);
	
	String param_username_testng_val= Generic.getParameterValueTestng("username");
	System.out.println("The parameter value in TestNG is:"+param_username_testng_val);
}


}
