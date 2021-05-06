package testng_Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
//custom lstener everthing in file name

public class CustomListeners implements IInvokedMethodListener,ITestListener,ISuiteListener {
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testresult) {
		// TODO Auto-generated method stub
		// Before every method in the Test class
		System.out.println("after invocation"+ testresult.getTestClass().getName() + "=>" + method.getTestMethod().getMethodName() );
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testresult) {
		// TODO Auto-generated method stub
		//After every method in the test class
		System.out.println("before invocation"+ testresult.getTestClass().getName() + "=>" + method.getTestMethod().getMethodName() );

	}
	@Override
	public void onFinish(ITestContext result) {
		//after <test> tag in xml file 
		System.out.println("onStart--> TestName:" + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		//Before <test> tag of xml file 
		System.out.println("onStart--> TestName:" + context.getName());
		ITestNGMethod methods[]= context.getAllTestMethods();
		System.out.println("These methods will executed in this test tag:");
		
		for(ITestNGMethod method: methods) {
			System.out.println(method.getMethodName());
		}
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestfailedbutwithinsucesspercentage--> TestName:" + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestfailure--> TestName:" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped--> TestName:" + result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
     //when test method starts 		
		System.out.println("onTestStart--> TestName:" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess--> TestName:" + result.getName());

	}
	
	@Override
	public void onFinish(ISuite arg0) {
		// when suite tag complete
		System.out.println("On finish: after suite completes");
		
	}

	@Override
	public void onStart(ISuite arg0) {
		// when suite tag starts
		System.out.println("on start:after suit starts ");
	}
}
