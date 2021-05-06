package testng_Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

public class CustomListener1 implements IInvokedMethodListener{

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testresult) {
		// TODO Auto-generated method stub
		// after every method in the Test class
		System.out.println("after invocation"+ testresult.getTestClass().getName() + "=>" + method.getTestMethod().getMethodName() );
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testresult) {
		// TODO Auto-generated method stub
		System.out.println("before invocation"+ testresult.getTestClass().getName() + "=>" + method.getTestMethod().getMethodName() );

	}

}
