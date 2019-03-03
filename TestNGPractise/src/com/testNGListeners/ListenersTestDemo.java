package com.testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestDemo implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) {
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is fail"+" " +result.getName()+" "+result.getStartMillis());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case is Skipp"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("Test case is starts"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is Success"+result.getName());
	}

}
