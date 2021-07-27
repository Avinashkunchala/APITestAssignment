package com.APIAssignment.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println(result.getName() + "  execution is started");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println(result.getName() + "  successfully executed");

	}

	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName() + "  is failed");

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println(result.getName() + "  is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println(result.getName() + "  FailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
		
		System.out.println(context.getName() + "  onStart");

	}

	public void onFinish(ITestContext context) {
		
		System.out.println(context.getName() + "  onFinish");

	}

}
