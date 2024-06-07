package mExpanse.Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import mExpance.Library.BaseClass;

public class CustomListener extends BaseClass implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failled test");
		takeScreenshot(result.getMethod().getMethodName());
		
		
	}
	

}
