package ej.finsys.listners;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class TestListner implements IMethodInterceptor {

	
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
	
		List<IMethodInstance> methodlist = new ArrayList<IMethodInstance>();

	    // Read these flags from somewhere, system var / test context / file or
	    // where ever
	    Boolean shouldRunTest1 = Boolean.valueOf(context.getAttribute("SHOULD_RUN_TEST1")
	            .toString());
	    Boolean shouldRunTest2 = Boolean.valueOf(context.getAttribute("SHOULD_RUN_TEST2")
	            .toString());

	    for (IMethodInstance iMethodInstance : methods) {

	        // decide based on method name / group / priority / description or
	        // what ever
	        String methodName = iMethodInstance.getMethod().getMethodName();

	       
	        if (iMethodInstance.getMethod().isTest()) {
	            if (shouldRunTest1 && methodName.equals("TC_082_Verify Authentication process of a finsys user having role of CFO")) {
	                methodlist.add(iMethodInstance);

	            } else if (shouldRunTest2 && methodName.equals("TC_082_Verify Authentication process of a finsys user having role of FM")) {
	                methodlist.add(iMethodInstance);

	            }
	        }
	    }
		
	    return methodlist;
	}

}
