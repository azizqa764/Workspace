package testng_Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener{

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
