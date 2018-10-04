package ej.finsys.utility;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Close_browser {

	
	@Test
	@Parameters ({"browsername"})
	public void closebrowser(String Browsername) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		if(Browsername.toLowerCase().startsWith("param_"))
		{
			Browsername = Generic.getParameterValue("param_browsername");
		}
		
		LaunchApp la = new LaunchApp();
		la.CloseBrowser(Browsername);
				
	}
}
